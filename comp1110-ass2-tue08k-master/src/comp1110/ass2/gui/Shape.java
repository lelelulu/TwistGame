package comp1110.ass2.gui;

import javafx.scene.Group;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
/*
* class name:Shape
* Author name;Le fang
* Ideas:This class repesents the 8 different shapes
* Main Function: public static void checkShape(char name,int column,int row,int orientation)
* Explanation: this function can place correct shape to the board if given the name,column,row,and orientation of this shape
* */
public class Shape{
    Color color;
    int loop;
    char name;
    public static final Group controlshapes = new Group();
    public Shape(char name, Color color, int loop)
    {
        this.color = color;
        this.loop = loop;
        this.name = name;
    }

    Color getcolor()
    {
        return this.color;
    }

    char getname()
    {
        return this.name;
    }

    int getloop()
    {
        return this.loop;
    }

    public static void checkShape(char name, char colum, char roww, int orientation, int tag) {
        ImageView[] shapesImage = new ImageView[8];
        int row = roww-'A';
        int column = colum -'1';
        for (int i = 0; i < 8; i++) {
            shapesImage[i] = new ImageView();
            shapesImage[i].setImage(new Image(Board.URLs[i]));
            shapesImage[i].setScaleX(0.4);
        }
        for (char i = 'a'; i <= 'h'; i++) {
            int na = i-'a';
            double width = shapesImage[na].getImage().getWidth();
            double height = shapesImage[na].getImage().getHeight();
            ImageView shapesTmp = shapesImage[na];
            double col = column*40 - 0.3*width + 80;
            double ro = row*40 - 0.3*height + 120;

            if(orientation %2 ==1 )
            {
                col = col  - Math.abs(0.5*0.4*(height-width)) ;
                ro = ro + Math.abs(0.5*0.4*(height-width));
            }

            if (i == name) {
                if (orientation < 4) {
                    shapesTmp.setScaleY(0.4);
                    shapesTmp.setX(col);
                    shapesTmp.setY(ro);
                    shapesTmp.setRotate(orientation * 90);
                    //System.out.println(col+" "+ro);
                    //System.out.println(name + " "+column+" "+row+" "+shapesImage[i-'a'].getImage().getWidth()+" "+shapesImage[i-'a'].getImage().getHeight());
                } else if(orientation >= 4)
                {
                    shapesTmp.setX(col);
                    shapesTmp.setY(ro);
                    shapesTmp.setRotate(orientation  * 90);
                    shapesTmp.setScaleY(-0.4);
                    //System.out.println(name + " "+column+" "+row+" "+shapesImage[i-'a'].getLayoutX()+" "+shapesImage[i-'a'].getLayoutY());
                }
                if (tag == 0)
                    controlshapes.getChildren().addAll(shapesImage[na]);
                else {
                    shapesImage[na].setOpacity(0.5);
                    controlshapes.getChildren().addAll(shapesImage[na]);

                }

            }
        }
    }
}
