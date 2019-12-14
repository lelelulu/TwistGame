package comp1110.ass2;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/*
 * class name:Shape
 * Author name;Le fang
 * Ideas:This class realizes the rotation and flip of shapes
 * */
public class PiecesIni{
    /*initialize all the first shape of 8 pieces like a0,b0,c0,d0,e0,f0,g0,h0 and their depression placement */
    static void IniLoopAndDepress()
    {
        Loop.iniPieceDep();
        Loop.iniPieceLoop();
    }

    /*loop[] means a loops of each piece ,and every piece can be rotated to specific degree
     * when rotateTime is 0,it means the first shape of this piece
     * one rotateTime means 90 degree rotation
     * rotateTime = 1,2,3 means  a1,a2,a3
     * this function includes some mathmetical transformations
     */
    static Loop[] rotate(Loop[] shape,int rotateTime)//totate-->1 90
    {
        Loop[] shaperotate = new Loop[shape.length];
        int max = shape[0].y;//
        for (int i = 0; i < shape.length; i++) {
            if (shape[i].y > max) {
                max = shape[i].y;
            }
        }

        for (int i = 0; i < shape.length; i++) {
            shaperotate[i] = new Loop(0,0);
            shaperotate[i].x = shape[i].y * (-1) + max + 1;
            shaperotate[i].y = shape[i].x;
        }
        if (rotateTime == 0) return shape;
        else  if (rotateTime == 1) return shaperotate;
        else return rotate(shaperotate, rotateTime - 1);
    }

    /*
     * every piece can be flipped when given specific fliptime
     * fliptime = 1,2,3,4 means a4,a5,a6,a7
     */
    static Loop[] flip(Loop[] shape,int flipTime)//
    {
        Loop[] shapeflip = new Loop[shape.length] ;
        int max = shape[0].y;
        for (int i = 0; i < shape.length; i++) {
            if (shape[i].y > max) {
                max = shape[i].y;
            }
        }
        for (int i = 0; i < shape.length; i++) {
            shapeflip[i] = new Loop(0, 0);
            shapeflip[i].x = shape[i].x;
            shapeflip[i].y = shape[i].y * (-1) + max + 1;
        }
        if (flipTime == 1) return shapeflip;
        else return rotate(shapeflip,  flipTime - 1);
    }

}
