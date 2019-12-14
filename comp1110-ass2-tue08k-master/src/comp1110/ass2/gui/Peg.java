package comp1110.ass2.gui;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static comp1110.ass2.gui.Board.makePlacement;

/*
 * class name:Peg
 * Author name;Le fang
 * Ideas:This class repesents the 4 different pegs
 * Main Function: public static void checkPeg(char name,int column,int row)
 * Explanation: this function can place correct peg to the board if given the name,column,row of this peg
 * */
public class Peg  {
    Color color;//can choose k(green) , j (blue), l (yello), i(red)
    char name;
    public static final Group controlpeg = new Group();//
    static int showDifficulty = 0;

    static String[]difficulties= {
            //slider difficult one 1-12 two 13-24 three 25-36 gour 37-48
            "a7A7b6A7c1A3i6B0j2B0j1C0k3C0l4B0l5C0"/*1*/, "c5A2d1B3i7D0j7A0k5B0k5C0l3A0l3D0"/*2*/, "a6C4b1A0i2B0j2C0j4C0k3A0k4B0l3D0"/*3*/, "b2A4c1C4d7B5j2C0j8D0"/*4*/,
            "d7B1g1B3i7B0j7D0k5D0k6C0l5B0"/*5*/, "a3B3c3A4f7B7i3D0j2C0j2D0k2A0k2B0l4D0l5D0"/*6*/, "c3A2e3B4f1B5g6A1j6D0k4B0l6B0l4D0"/*7*/, "f1A0g2B7h4B2j5D0j6D0k7D0k8D0l3D0l4D0"/*8*/,
            "a1B5d7A7f1A0j7A0j7B0k3A0k5B0l5A0l3B0"/*9*/, "c1D0e4C7i6B0j2B0j2D0k4C0k5C0l3C0l6D0"/*10*/, "b2C6c1A1h8A7i6A0k6B0k6D0l6C0"/*11*/, "d1A2f2C0i8B0j1A0j2A0k1C0k4C0l7A0l8A0"/*12*/,
            "a1A6e4A3g2B3h6A2i1A0j7D0j8D0k5C0k4A0l2D0l8A0"/*13*/, "a7A7b2A0c1C4f4C4i3B0j6B0j2C0k1B0k2B0l6C0l1D0"/*14*/, "d1A3e1C4f4B3i5A0j2B0j3C0k2C0k2D0l8C0l8D0"/*15*/,
            "b5A6f1A3h6D2i6B0k2B0k2D0l4C0l5D0"/*16*/, "d5B0e7A0f1B5i6D0j6C0l5C0l5D0"/*17*/, "a1B6c1A0f1C4g6A6i3B0j5C0k7D0k8D0l7A0l8A0"/*18*/,
            "c5A2d1B5f1A6i8D0j2C0j2D0k1A0k2B0l4C0l5D0"/*19*/, "a1C2c5B4j1A0j6B0"/*20*/, "a1A3e7A0g3B7h5A5i1A0j8D0k8A0k1D0"/*21*/, "b4A5g1B3i8D0j7D0l2D0"/*22*/,
            "d7B7e1B6f1C4i7D0j7C0", "c3D2g5A4h2C0i2B0l2C0", "b3A4h4D2i4A0j4C0k7C0l6A0l5B0", "a1B5b4A0c4C0i5B0j5C0k2B0l2C0",
            "a1B5c2C6e7A4k4B0k8B0l7A0", "a1C2c5C0f4A6i2B0j6C0k3A0k5B0", "c5D0d1A3e1C4h3A1i5B0k6A0k2C0l3A0l3D0",
            "c2D4f1B3h6A2i3C0k2C0l4C0", "a1A3d6C4g5A3i1C0j7C0j8C0k2C0k8A0l5A0", "d4C4f4A6j3B0j5C0", "a1B5g3A7i1B0j7A0j7B0k1A0k2B0l3B0l4C0"
            , "a1B5f4C6g2B7k5D0l4D0l6D0", "d1A6g4B3j2B0j2C0k8B0k8C0l5D0l6C0", "a7B1d1A6e1C2i5A0j5C0k7B0l3B0", "b7B5e7A7h1A1i2D0j4C0k5D0",
            "b4B0f6C4i4A0j1B0k2A0l2C0", "a6A0f3C2j3B0j2D0k5B0l6D0l7D0", "b4C4f2A0j3C0j3D0k6D0l5A0l8A0", "d6C2g4A0j6C0j3D0k1A0k8C0l4A0",
            "b1A5h4D2j6A0j6C0k3B0k1C0", "a7A7f2C4i5D0j2B0j2C0k6A0l5B0", "a1A6c2D0j8C0k6A0l2B0l6C0",
            "d1C6g4A5k3D0k5D0l3A0l5A0", "a1B5d6A0e7C4j4C0k5A0l6B0", "a1A3h3A0i4C0j5B0j7B0", "a1A3h6A0j3C0k5A0k7C0l4B0",
            "b3A4e7C4j7B0j4C0k2B0", "a2C0c8A5i4C0k2B0l4A0l6B0", "b7A3e7C1j6A0j6D0k3A0l3D0",
            "a7B1h4D0i3C0j3A0j5B0k8A0k1D0", "d6D4g1A5h3D4i6A0j5C0k3A0k4B0l3D0", "b1A2h2D0i5A0k2C0k8B0l5C0"};

    public static String newdifficulty(int difficulty) {
        System.out.println("there is " + difficulties.length + " difficulties");
        Random rand =new Random();
        int i = rand.nextInt(13);//get random values by using Random class  0-13
        int j = rand.nextInt(13) + 14;//14 - 27
        int k = rand.nextInt(13) + 28;//28 - 41
        int l = rand.nextInt(12) + 42;// 42- 54
        System.out.println("difficulty:");
        switch(difficulty)
        {
            case 1: {
                //System.out.println("i:" + (i + 1));
                showDifficulty = i + 1;
                return difficulties[i];
            }//We can define different difficulties by returning different value of OBJECTIVES
            case 2: {
                //System.out.println("j " + (j + 1));
                showDifficulty = j + 1;
                return difficulties[j];
            }
            case 3: {
                //System.out.println("k " + (k + 1));
                showDifficulty = k + 1;
                return difficulties[k];
            }
            case 4: {
                //System.out.println("l " + (l + 1));
                showDifficulty = l + 1;
                return difficulties[l];

            }
            default: {
                //System.out.println("no choose! difficult 0");
                return difficulties[0];
            }
        }

    }

    public Peg(Color color,char name)//create instance of Peg at the start of the program!
    {
        this.color = color;
        this.name = name;
    }

    public static void checkPeg(char name,char colum,char roww)//task 4
    {
        ImageView []pegsImage = new ImageView[4];
        int row = roww-'A';
        int column = colum -'1';
        for(int i = 0;i < 4;i++) {
            pegsImage[i] = new ImageView();
            pegsImage[i].setImage(new Image(Board.Peg_URLs[i]));
        }

        for(char i = 'i';i <= 'l';i++) {
            double width = pegsImage[i-'i'].getImage().getWidth();
            double height = pegsImage[i-'i'].getImage().getHeight();
            double col = column*40 - 0.3*width + 80;
            double ro = row*40 - 0.3*height + 120;
            if(i == name){
                pegsImage[i - 'i'].setX(col);
                pegsImage[i - 'i'].setY(ro);
                pegsImage[i - 'i'].setScaleY(0.4);
                pegsImage[i - 'i'].setScaleX(0.4);
                controlpeg.getChildren().add(pegsImage[i-'i']);
            }
        }
    }
}
