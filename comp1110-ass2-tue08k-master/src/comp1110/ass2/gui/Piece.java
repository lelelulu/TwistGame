package comp1110.ass2.gui;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javax.xml.bind.ValidationEvent;
import java.util.*;

import static comp1110.ass2.TwistGame.*;
import static comp1110.ass2.gui.Board.makePlacement;

/*
 class name:Piece
 Author name;Esra
 Ideas:This class helps to drag and rotate the pieces in the board
*/
public class Piece {
    char name;
    int x;
    int y;
    int orientation;
    static double mouseX;
    static double mouseY;
    static double mouseStartX;
    static double mouseStartY;
    static double finalX;
    static double finalY;


    public static final Group iniboardpiece = new Group();
    static ImageView[] iniImage = new ImageView[8];
    static String s = "CFJMILOS"; //037 10   036 10
    static String stmp = "";
    static int rotateCount;
    static int[] PlacedRotation = {-1, -1, -1, -1, -1, -1, -1, -1};
    static boolean[] place = {false,false,false,false,false,false,false,false};
    public static String subs;
    //static int ActualrotateCount = 0;


    //used for record those piece which not in the right place!!
    static Circle c;

    Piece(char name, int x, int y, int orientation) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    /* function author:LeFang
     * ideas:initialize pieces of board and use mathmetical method to solve the rotate or flip problem
     * @param  the string which indicates the placement of pegs and pieces
     * @return add mouse listener to each piece
     */
    public static void iniboardpiece(String pegpiece) {
        rotateCount = 0;
        subs = pegpiece;
        for (int i = 0; i < 8; i++) {
            PlacedRotation[i] = -1;
        }
        makePlacement(pegpiece);
        //System.out.println("mouse x and y" + mouseX + " " + mouseY);
        iniboardpiece.getChildren().clear();
        StringBuffer validString = new StringBuffer();
        List<Integer> lpp = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            iniImage[i] = new ImageView();
            iniImage[i].setImage(new Image(Board.URLs[i]));
            iniImage[i].setScaleX(0.4);
        }

        for (char pp : pegpiece.toCharArray()) {
            if (pp >= 'a' && pp <= 'h') lpp.add(pp - 'a');
        }

        for (int i = 0; i < 8; i++) {
            if (!lpp.contains(i)) {
                double column;
                double roww;

                if (i < 4) {
                    column = 10;
                    roww = (double) (s.charAt(i) - 'B');
                } else {
                    column = 14;
                    roww = (double) (s.charAt(i) - 'H');
                }

                double height = iniImage[i].getImage().getHeight();
                double width = iniImage[i].getImage().getWidth();
                ImageView shapesTmp = iniImage[i];
                //System.out.println(i+" "+height+" "+width);
                shapesTmp.setScaleY(0.4);
                double ro = roww * 40 - 0.3 * height;
                double colum = column * 40 - 0.3 * width;
                shapesTmp.setX(colum);
                shapesTmp.setY(ro);
                //System.out.println("colum+ro :" + colum + " " + ro);

                shapesTmp.setOnScroll(event -> {
                    char x = ' ';
                    if (column == 10) {
                        if (roww == 1) x = 'a';
                        else if (roww == 4) x = 'b';
                        else if (roww == 8) x = 'c';
                        else x = 'd';
                    }
                    if (column == 14) {
                        if (roww == 1) x = 'e';
                        else if (roww == 4) x = 'f';
                        else if (roww == 7) x = 'g';
                        else x = 'h';
                    }
                    mouseX = event.getSceneX();
                    mouseY = event.getSceneY();
                    event.consume();
                    if (PlacedRotation[x - 'a'] != -1)
                        rotateCount = PlacedRotation[x - 'a'];
                    //System.out.println("PlacedRotation[x - 'a']:" + x + " " + PlacedRotation[x - 'a']);
                    rotateCount++;
                    PlacedRotation[x - 'a'] = rotateCount;
                    //System.out.println("after rotateCount++:rotateCount==" + rotateCount);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (rotateCount % 8 <= 3) {
                        shapesTmp.setScaleY(0.4);
                        shapesTmp.setRotate((shapesTmp.getRotate() + 90) % 360);
                    } else {
                        shapesTmp.setScaleY(-0.4);
                        shapesTmp.setRotate((shapesTmp.getRotate() + 90) % 360);
                    }
                    //System.out.println("rotate Count:" + rotateCount);
                });

                shapesTmp.setOnMousePressed(event -> {
                    mouseX = event.getSceneX();
                    mouseY = event.getSceneY();
                    event.consume();
                    //System.out.println("mousexy" + mouseX + " " + mouseY);
                });
                shapesTmp.setOnMouseDragged(event -> {      // mouse is being dragged
                    double movementX = event.getSceneX() - mouseX;
                    double movementY = event.getSceneY() - mouseY;
                    shapesTmp.setLayoutX(shapesTmp.getLayoutX() + movementX);
                    shapesTmp.setLayoutY(shapesTmp.getLayoutY() + movementY);
                    shapesTmp.toFront();
                    mouseX = event.getSceneX();
                    mouseY = event.getSceneY();
                    event.consume();
                });
                shapesTmp.setOnDragDetected(event -> {
                    mouseStartX = mouseX;
                    mouseStartY = mouseY;
                });

                shapesTmp.setOnMouseReleased(event -> {
                    finalX = mouseX;
                    finalY = mouseY;
                    //System.out.println("rotatecount " + rotateCount);
                    //System.out.println("finalx,y: " + finalX + " " + finalY);
                    double moveX = finalX - mouseStartX;
                    double moveY = finalY - mouseStartY;
                    double finalvertex_X;
                    double finalvertex_Y;

                    if (rotateCount % 2 == 1) {
                        finalvertex_X = column * 40 + moveX + Math.abs(0.5 * 0.4 * (height - width));
                        finalvertex_Y = roww * 40 + moveY - Math.abs(0.5 * 0.4 * (height - width));
                    } else {
                        finalvertex_X = column * 40 + moveX;
                        finalvertex_Y = roww * 40 + moveY;
                    }
                    // System.out.println("start column "+column+" " + roww);
                    char x = ' ';
                    if (column == 10) {
                        if (roww == 1) x = 'a';
                        else if (roww == 4) x = 'b';
                        else if (roww == 8) x = 'c';
                        else x = 'd';
                    }
                    if (column == 14) {
                        if (roww == 1) x = 'e';
                        else if (roww == 4) x = 'f';
                        else if (roww == 7) x = 'g';
                        else x = 'h';
                    }

                    c = new Circle(finalvertex_X, finalvertex_Y, 0.5);
                    //System.out.println("finalvertex "+finalvertex_X+" "+finalvertex_Y);
                    c.setOpacity(50);
                    c.setFill(Color.WHITE);
                    iniboardpiece.getChildren().add(c);

                    /*used to test whether the placement of piece is true*/
                    Circle tmpc = findNearestNode(findNearestDistance(finalvertex_X, finalvertex_Y), finalvertex_X, finalvertex_Y);
                    int v_x = (int) (tmpc.getCenterX() - 80) / 40 + 1;
                    int v_y = (int) (tmpc.getCenterY() - 120) / 40;
                    char c_vy = (char) (v_y + 'A');
                    //System.out.println("rotatecount" + rotateCount);
                    if (rotateCount % 2 == 1) {
                        shapesTmp.setLayoutX(tmpc.getCenterX() - column * 40 - Math.abs(0.5 * 0.4 * (height - width)));//+ Math.abs(0.5*0.4*(height-width)
                        shapesTmp.setLayoutY(tmpc.getCenterY() - roww * 40 + Math.abs(0.5 * 0.4 * (height - width)));//- Math.abs(0.5*0.4*(height-width)
                    } else {
                        shapesTmp.setLayoutX(tmpc.getCenterX() - column * 40);
                        shapesTmp.setLayoutY(tmpc.getCenterY() - roww * 40);
                    }
                    stmp = x + "" + v_x + "" + c_vy + "" + (rotateCount % 8);
                    System.out.println("stmp " + stmp);
                    /*try to insert the new piece the nouse is pointing at */
                    List<Character> list = new ArrayList<>();
                    List<Character> listofPieces = new ArrayList<>();
                    if (validString.length() > 0) {
                        // System.out.println("validString length >0 ！");
                        String lpeg = new String();
                        lpeg = pegpiece + validString.toString();

                        validString.replace(0, validString.length(), "");
                        //System.out.println("after initialize:validstring shold be"+validString+"test");

                        /*add peg to the validstring*/
                        TreeSet<String> ts = new TreeSet<>();
                        for (int k = 0; k < lpeg.length() / 4; k++) {
                            String str = lpeg.substring(k * 4, (k + 1) * 4);
                            ts.add(str);
                        }

                        String validstr = "";
                        for (String s : ts) {
                            //System.out.println("ts:" + s);
                            validstr += s;
                        }
                        //System.out.println("after combine the validstring and peg:" + validstr);
                        validString.append(validstr);

                    } else validString.append(pegpiece);

                    for (char c : validString.toString().toCharArray()) {
                        list.add(c);
                    }
                    for (char c : pegpiece.toCharArray()) {
                        if (c >= 'a' && c <= 'h') {
                            listofPieces.add(c);
                            //System.out.println("listofPieces:" + c);
                        }
                    }
                    int insertPos = 0;
                    int count = 0;
                    for (int q = 1; q < 8; q++) {//find the position of character which before x
                        int indexc = list.indexOf((char) (x - q));
                        //System.out.println("q " + (char) (x - q) + "indexc " + indexc);
                        if (indexc != -1 && count == 0) {
                            insertPos = indexc + 4;
                            count++;
                        }
                    }
                    System.out.println("try to insert stmp " + stmp + " and insertpos: " + insertPos);
                    validString.insert(insertPos, stmp);
                    //System.out.println("after inseting :validstring:" + validString);


                    /*test whether the string is valid after inserting this new pieice*/
                    if (isPlacementStringValid(stmp)) {
                        if (!isPlacementStringValid(validString.toString())) {
                            Music.PutfailMusic();
                            System.out.println("in the board but not in right place!!!");
                            validString.replace(insertPos, insertPos + 4, "");
                            PlacedRotation[x - 'a'] = rotateCount;
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            shapesTmp.setLayoutX(0);
                            shapesTmp.setLayoutY(0);
                        } else {
                            System.out.println("place " + stmp + " successfully!!");//if it is the right piece,it will not be removed!
                            Music.PutsuccessMusic();
                        }
                    } else {
                        Music.PutfailMusic();
                        /*if this piece is not valid ,show an wrong message,
                        if this piece is not valid, remove the string of this piece from validString */
                        System.out.println("fail to place ,out of board!!" + stmp);
                        validString.replace(insertPos, insertPos + 4, "");
                        PlacedRotation[x - 'a'] = rotateCount;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        shapesTmp.setLayoutX(0);
                        shapesTmp.setLayoutY(0);
                    }
                    //System.out.println(" now Valid String: " + validString);
                    if (validString.length() >= 32) {
                        if (checkSuccess(validString.toString().substring(0, 32))) {
                            //Music.playMusic();
                            //System.out.println("successful!!!");
                            place[x-'a'] = true;
                            Label success = new Label();//"congratulations,successful!!"
                            Image finish = new Image((Board.succ_URL));
                            success.setGraphic(new ImageView((finish)));
                            success.setLayoutX(160);
                            success.setLayoutY(160);
                            Music.playSuccessMusic();
                            iniboardpiece.getChildren().addAll(success);
                        }
                    }
                    subs = validString.toString();

                    int pegPos = 0;
                    int countPeg = 0;
                    int piecePos = 0;
                    /*remove the peg string from validString */
                    List<Character> list1 = new ArrayList<>();
                    for (char c : validString.toString().toCharArray()) {
                        list1.add(c);
                    }
                    for (Character c : list) {
                        if (countPeg == 0 && c >= 'i' && c <= 'l') {
                            pegPos = list1.indexOf(c);
                            countPeg++;
                            //System.out.println("c+pegpos+countpeg " + c + " " + pegPos + " " + countPeg);
                        }
                    }
                    validString.replace(pegPos, validString.length(), "");
                    //System.out.println("After remove pegs:Valid String: " + validString);

                    for (Character c : listofPieces) {
                        //System.out.println("c is redundant!" + c);
                        piecePos = validString.toString().indexOf(c);
                        if (piecePos != -1)// System.out.println("listofpieces should remove:"+c+"position is"+piecePos);
                            validString.replace(piecePos, piecePos + 4, "");
                    }

                    //System.out.println("After remove pieces:Valid String: " + validString);
                    /*check whether the valid string is finished,if finished, show successful message*/
                    rotateCount = 0;
                });
                iniboardpiece.getChildren().addAll(shapesTmp);

            }
        }
    }

    static public Boolean checkSuccess(String validString) {
        String l = "";
        for (int i = 0; i < validString.length(); i += 4) {
            l = l + validString.charAt(i);
        }
        System.out.println("l: " + l);
        if (l.equals("abcdefgh")) {
            System.out.println(validString);
            return true;
        }
        else return false;

    }

    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    static double findNearestDistance(double x, double y) {
        double nearest = distance(x, y, Board.circlelist.get(0).getCenterX(), Board.circlelist.get(0).getCenterY());
        for (Circle c : Board.circlelist) {
            if (distance(x, y, c.getCenterX(), c.getCenterY()) < nearest) {
                nearest = distance(x, y, c.getCenterX(), c.getCenterY());
            }
            //System.out.println("nearest distance is : "+nearest);
        }
        return nearest;
    }

    static Circle findNearestNode(double nearest, double x, double y) {
        for (Circle c : Board.circlelist) {
            if (distance(x, y, c.getCenterX(), c.getCenterY()) == nearest) {
                //System.out.println("x,y of c: "+c.getCenterX()+" "+c.getCenterY());
                return c;
            }
        }
        return null;
    }
}
