package comp1110.ass2;

import java.util.ArrayList;
import java.util.List;
/*
 * class name:Shape
 * Author name;Le fang
 * Ideas:This class repesents the loop which has two attributes x and y
 * */

public class Loop {
    /*every loop has the attribute of x and y*/
    int x ;
    int y ;
    /*there only exists 8 elective nodes for each piecce to choose*/
    static Loop node1 =  new Loop(1,1);//
    static Loop node2 =  new Loop(1,2);
    static Loop node3 =  new Loop(2,1);//
    static Loop node4 =  new Loop(2,2);//
    static Loop node5 =  new Loop(2,3);//
    static Loop node6 =  new Loop(3,1);
    static Loop node7 =  new Loop(3,2);
    static Loop node8 =  new Loop(4,1);

    /*each piece has depressions*/
    static int[] aDep = {0,2};
    static int[] bDep = {2};
    static int[] cDep = {1};
    static int[] dDep = {2,4};
    static int[] eDep = {1,2};
    static int[] fDep = {2,3};
    static int[] gDep = {0,1,3};
    static int[] hDep = {0};
    //0      1     2     3      4
    static Loop[] a = {node1,node3,node6,node7}; //depression numbers are a[0],a[2]
    static Loop[] b = {node1,node3,node4,node7};//2
    static Loop[] c = {node1,node3,node6,node8};//1
    static Loop[] d = {node1,node3,node4,node6,node7};//2,4
    static Loop[] e = {node1,node3,node4};//1,2
    static Loop[] f = {node1,node3,node4,node6};//2,3
    static Loop[] g = {node1,node2,node4,node5,node7};//0 1 3
    static Loop[] h = {node1,node3,node6};//0

    static List<int[]>piecedeps = new ArrayList<>();//arraylist to store all the depressions of each piece
    static List<Loop[]>pieceloops = new ArrayList<>();//arraylist to store all the loops of each piece

    Loop(int x,int y){
        this.x = x;
        this.y = y;
    }
    static void iniPieceDep() {//add nodes to the piecedeps
        piecedeps.add(aDep);
        piecedeps.add(bDep);
        piecedeps.add(cDep);
        piecedeps.add(dDep);
        piecedeps.add(eDep);
        piecedeps.add(fDep);
        piecedeps.add(gDep);
        piecedeps.add(hDep);
    }
    static void iniPieceLoop() {//add nodes to the pieceloops
        pieceloops.add(a);
        pieceloops.add(b);
        pieceloops.add(c);
        pieceloops.add(d);
        pieceloops.add(e);
        pieceloops.add(f);
        pieceloops.add(g);
        pieceloops.add(h);
    }
}
