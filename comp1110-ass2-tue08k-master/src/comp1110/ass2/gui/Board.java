package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static comp1110.ass2.TwistGame.getSolutions;
import static comp1110.ass2.gui.Peg.*;
import static comp1110.ass2.gui.Piece.iniboardpiece;
import static comp1110.ass2.gui.Shape.checkShape;
import static comp1110.ass2.gui.Shape.controlshapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Board extends Application {

    /* board layout */
    private static final int VIEWER_WIDTH = 750;//750 933
    private static final int VIEWER_HEIGHT = 650 ;//500 700

    /*all urls of picctures*/
    private static final String URL_BASE ="assets/";
    private static final String a_URL = Board.class.getResource(URL_BASE+"a.png").toString();
    private static final String b_URL = Board.class.getResource(URL_BASE+"b.png").toString();
    private static final String c_URL = Board.class.getResource(URL_BASE+"c.png").toString();
    private static final String d_URL = Board.class.getResource(URL_BASE+"d.png").toString();
    private static final String e_URL = Board.class.getResource(URL_BASE+"e.png").toString();
    private static final String f_URL = Board.class.getResource(URL_BASE+"f.png").toString();
    private static final String g_URL = Board.class.getResource(URL_BASE+"g.png").toString();
    private static final String h_URL = Board.class.getResource(URL_BASE+"h.png").toString();

    private static final String i_URL = Board.class.getResource(URL_BASE+"i.png").toString();
    private static final String j_URL = Board.class.getResource(URL_BASE+"j.png").toString();
    private static final String k_URL = Board.class.getResource(URL_BASE+"k.png").toString();
    private static final String l_URL = Board.class.getResource(URL_BASE+"l.png").toString();

    public static final String succ_URL = Board.class.getResource(URL_BASE + "success.png").toString();
    public static final String back_URL = Board.class.getResource(URL_BASE + "background.jpg").toString();
    public static final String inst_URL = Board.class.getResource(URL_BASE + "instruction.jpg").toString();


    public static final String[]URLs = {a_URL,b_URL,c_URL,d_URL,e_URL,f_URL,g_URL,h_URL};
    public static final String[]Peg_URLs = {i_URL,j_URL,k_URL,l_URL};


    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group controlnodes = new Group();

    TextField textField;
    public static List<Circle> circlelist = new ArrayList<>();
    private final Slider difficulty = new Slider();
    static int storeChallenge;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement  A valid placement string
     */
    public static void makePlacement(String placement) {
        controlpeg.getChildren().clear();
        controlshapes.getChildren().clear();
        int allnum = placement.length()/4;
        int na,countPeg = 0;
        String[] s = new String[allnum];
        int orientation;
        for (int i = 0; i < allnum; i++)//initial placement
        {
            na = placement.charAt(i * 4 + 0) - 'a';
            if (na >= 8) countPeg++;
        }
        for (int i = 0; i < allnum; i++)//s is an array of string which contains 4 characters
        {
            s[i] ="";
            for(int j = 0 ;j < 4;j++)
            {
                s[i] = s[i] + placement.charAt(i * 4 + j);
            }
        }
        for(int i = 0;i < allnum ;i++)
        {
            orientation = s[i].charAt(3)-'0';
            if (i >= allnum - countPeg) checkPeg(s[i].charAt(0), s[i].charAt(1), s[i].charAt(2));//put pegs to the board
            else checkShape(s[i].charAt(0), s[i].charAt(1), s[i].charAt(2), orientation, 0);//put pieces to the board
        }
    }

    private void putNodes()  //initialize the board with 45 nodes (4*8 board needs 45 nodes)
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                Circle c = new Circle(j*40+80,i*40+120,1);
                c.setOpacity(50);
                c.setFill(Color.WHITE);
                controlnodes.getChildren().add(c);
                circlelist.add(c);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Create a basic text field for input and a refresh button.
     * use slider called difficulties to control the difficulty of challenges
     * Button "refresh" is applied to show the placement when users input a string of placement to the textfeild (used for test)
     * Button "newGame" is applied to initialize the board and is convenient for users to choose the difficulty of challenges.
     */
    private void makeControls() {

        Label label1 = new Label("Placement:");
        Label label2 = new Label("difficulty:");
        Label difficult = new Label("please press newGame button and start your game!");

        difficulty.setMin(1);
        difficulty.setMax(4);
        difficulty.setValue(0);
        difficulty.setShowTickLabels(true);
        difficulty.setShowTickMarks(true);
        difficulty.setMajorTickUnit(1);
        difficulty.setMinorTickCount(1);
        difficulty.setSnapToTicks(true);
        difficulty.setLayoutX(80);
        difficulty.setLayoutY(300);

        textField = new TextField ();
        textField.setPrefWidth(300);

        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                makePlacement(textField.getText());
                textField.clear();
            }
        });
        Button newGame = new Button("newGame");

        newGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Music.stopSuccessMusic();
                Music.stopStartMusic();
                controlpeg.getChildren().clear();
                iniboardpiece(newdifficulty((int) difficulty.getValue()));
                storeChallenge = showDifficulty - 1;
                difficult.setText("this is " + (showDifficulty) + " challenge");
            }
        });

        Button Restart = new Button("Restart");

        Restart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Music.stopSuccessMusic();
                controlpeg.getChildren().clear();
                iniboardpiece(difficulties[storeChallenge]);
                difficult.setText("this is " + (storeChallenge+1) + " challenge again");

            }
        });

        HBox hb0 = new HBox();
        Label background = new Label();
        Image back = new Image((Board.back_URL), 320, 160, false, false);
        background.setGraphic(new ImageView(back));


        hb0.getChildren().addAll(background);
        hb0.setLayoutX(82);
        hb0.setLayoutY(VIEWER_HEIGHT - 530);

        HBox hb = new HBox();
        hb.getChildren().addAll(Restart, label1,textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);

        HBox hb1 = new HBox();
        hb1.getChildren().addAll(difficulty, newGame, label2, difficult);
        hb1.setSpacing(10);
        hb1.setLayoutX(130);
        hb1.setLayoutY(VIEWER_HEIGHT - 100);
        //System.out.println("difficulty"+(int)difficulty.getValue());
        controls.getChildren().add(hb0);
        controls.getChildren().add(hb);
        controls.getChildren().add(hb1);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TwistGame Viewer");
        Music.playStartMusic();
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
        root.getChildren().add(controls);
        //iniboardpiece(initial_difficulty_pegs(newdifficulty(0)));
        root.getChildren().add(controlnodes);
        root.getChildren().add(controlshapes);
        root.getChildren().add(controlpeg);
        root.getChildren().add(iniboardpiece);

        Label inst = new Label();
        Image instruction = new Image((Board.inst_URL));
        inst.setGraphic(new ImageView(instruction));
        inst.setLayoutX(-50 - 0.2 * instruction.getWidth());
        inst.setLayoutY(270 - 0.2 * instruction.getHeight());
        inst.setScaleX(0.5);
        inst.setScaleY(0.5);
        inst.toBack();
        root.getChildren().add(inst);

        makeControls();
        putNodes();
        primaryStage.setScene(scene);
        scene.setOnKeyTyped(event -> {
            if (event.getCharacter().equals("Q"))
                Platform.exit();
            else if (event.getCharacter().equals("/")) {

                try {
                    String solutions = getSolutions(Piece.subs)[0];
                    if (Piece.checkSuccess(solutions.substring(0, 32))) {
                        System.out.println("solutions.substring(0, 32)" + solutions.substring(0, 32));
                        List<Character> validlist = new ArrayList<>();
                        for (char c : Piece.subs.toCharArray()) {
                            validlist.add(c);
                        }
                        int i = 0, count = 0;
                        for (char c : solutions.toCharArray()) {
                            if (c >= 'a' && c <= 'h' && !validlist.contains(c) && count == 0) {
                                String sub = solutions.substring(i, i + 4);
                                Shape.checkShape(sub.charAt(0), sub.charAt(1), sub.charAt(2), sub.charAt(3) - '0', 1);
                                Music.playHintMusic();
                                count++;
                            }
                            i++;
                        }
                    } else System.out.println("not a great and completed solution!");
                } catch (Exception ex) {
                    System.out.println("throw exception! no solution!!");
                }
            }
        });
        primaryStage.show();
    }
}

