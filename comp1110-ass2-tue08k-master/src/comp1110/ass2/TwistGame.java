package comp1110.ass2;

//package comp1110.ass2;

import comp1110.ass2.gui.Piece;

import java.util.*;

import static comp1110.ass2.PiecesIni.IniLoopAndDepress;

/**
 * This class provides the text interface for the Twist Game
 * <p>
 * The game is based directly on Smart Games' IQ-Twist game
 * (http://www.smartgames.eu/en/smartgames/iq-twist)
 */
public class TwistGame {
    static List<Integer[][]> pieceLoop = new ArrayList<>(8);//a,b,c,d,e,f,g,h
    static List<Integer[][]> pieceDepression = new ArrayList<>(8);
    static int[] loopnumber = {4, 4, 4, 5, 3, 4, 5, 3};
    static int[] depnumber = {2, 1, 1, 2, 2, 2, 3, 1};
    static char[] piececolor = {'R', 'R', 'B', 'B', 'G', 'G', 'Y', 'Y'};


    static public int[][] loca = new int[4][8];//  row A-D column 1-8
    static public char[][] checkPeg = new char[4][8];

    static int countsolution = 0;

    /*create a board of 4*8 nodes and check the occupation statement of each node ,
    when a piece or peg occupies one node,this node will be set 1,otherwise 0  */
    static void initialboard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                loca[i][j] = 0;
            }
        }
    }

    /*
    create a board of 4*8 nodes and check the color
    of the pegs which had occupied one node of this board
    */
    static void initialCheckPeg() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                checkPeg[i][j] = '0';
            }
        }
    }


    /**
     * Determine whether a piece or peg placement is well-formed according to the following:
     * - it consists of exactly four characters
     * - the first character is in the range a .. l (pieces and pegs)
     * - the second character is in the range 1 .. 8 (columns)
     * - the third character is in the range A .. D (rows)
     * - the fourth character is in the range 0 .. 7 (if a piece) or is 0 (if a peg)
     *
     * @param piecePlacement A string describing a single piece or peg placement
     * @return True if the placement is well-formed
     */
    public static boolean isPlacementWellFormed(String piecePlacement) {//
        // FIXME Task 2: determine whether a piece or peg placement is well-formed
        if ((piecePlacement.length() == 4 &&
                piecePlacement.charAt(1) >= '1' && piecePlacement.charAt(1) <= '8' &&
                piecePlacement.charAt(2) >= 'A' && piecePlacement.charAt(2) <= 'D' &&
                piecePlacement.charAt(0) >= 'a' && piecePlacement.charAt(0) <= 'h' && piecePlacement.charAt(3) >= '0' && piecePlacement.charAt(3) <= '7') ||
                (piecePlacement.charAt(0) >= 'i' && piecePlacement.charAt(0) <= 'l' && piecePlacement.charAt(3) == '0'))
            return true;
        else
            return false;
    }
    //This function was written by Yajing Wang(u6565980).Use if statement and include all the requirement for a well-formed piece or peg as the boolean expression to determine whether it is well-formed.

    /**
     * Determine whether a placement string is well-formed:
     * - it consists of exactly N four-character piece placements (where N = 1 .. 15);
     * - each piece or peg placement is well-formed
     * - each piece or peg placement occurs in the correct alphabetical order (duplicate pegs can be in either order)
     * - no piece or red peg appears more than once in the placement
     * - no green, blue or yellow peg appears more than twice in the placement
     *
     * @param placement A string describing a placement of one or more pieces and pegs
     * @return True if the placement is well-formed
     */
    public static boolean isPlacementStringWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement is well-formed
        if (placement.length() / 4 < 1 || placement.length() / 4 > 15 || placement.length() % 4 != 0)
            return false;
        for (int i = 0; i < placement.length() - 3; i = i + 4) {
            boolean flag = true;
            flag = isPlacementWellFormed(placement.substring(i, i + 4));
            if (!flag) return false;
        }
        for (int i = 0; i < placement.length() - 7; i = i + 4)
            if (placement.charAt(i) > placement.charAt(i + 4))
                return false;
        int m = 0;
        for (int i = 0; i < placement.length() - 7; i = i + 4)
            if (placement.charAt(i) < 'j' && placement.charAt(i) == placement.charAt(i + 4) && placement.charAt(i + 3) == placement.charAt(i + 7))
                return false;
        for (int i = 0; i < placement.length() - 11; i = i + 4)
            if (placement.charAt(i) >= 'j' && placement.charAt(i) == placement.charAt(i + 4) && placement.charAt(i + 4) == placement.charAt(i + 8))
                return false;
        return true;
    }
    //This function was written by Yajing Wang(u6565980).Use if statement and for statement to check if the placement is well-formed.

    /**
     * Determine whether a placement string is valid.  To be valid, the placement
     * string must be well-formed and each piece placement must be a valid placement
     * according to the rules of the game.
     * - pieces must be entirely on the board
     * - pieces must not overlap each other
     * - pieces may only overlap pegs when the a) peg is of the same color and b) the
     * point of overlap in the piece is a hole.
     *
     * @param placement A placement sequence string
     * @return True if the placement sequence is valid
     */
  /*    j
    i  *        1-8  A-B   0-7
       *0   a
       *1   b
       *2   c
       *3   d
       *4   e
       *5   f
       *6   g
       *7   h
       *
       */
    public static boolean isPlacementStringValid(String placement) {
        // FIXME Task 5: determine whether a placement string is valid
        if (!isPlacementStringWellFormed(placement)) return false;
        initialboard();
        initialCheckPeg();
        IniLoopAndDepress();

        int allnum = placement.length() / 4;
        int x, y, d, name, na;
        int actualx, actualy;
        int actualDepx, actualDepy;
        int pegX, pegY;
        int countPeg = 0;

        for (int i = 0; i < allnum; i++)//initial place
        {
            na = placement.charAt(i * 4 + 0) - 'a';
            if (na >= 8) countPeg++;
        }
        int pieceNum = 0;
        pieceNum = allnum - countPeg;
        /*place all the pegs to the board first and set the place which they occupied from 0 to 1
         * and set the colour checkpeg board to its color */
        for (int i = pieceNum; i < allnum; i++)//initial place
        {
            name = placement.charAt(i * 4 + 0) - 'a';
            pegX = placement.charAt(i * 4 + 1) - '0' - 1;  //0-7
            pegY = placement.charAt(i * 4 + 2) - 'A';//A-B --> 0-3
            loca[pegY][pegX] = 1;
            if (name == 8) checkPeg[pegY][pegX] = 'R';//i
            else if (name == 9) checkPeg[pegY][pegX] = 'B';//j
            else if (name == 10) checkPeg[pegY][pegX] = 'G';//k
            else if (name == 11) checkPeg[pegY][pegX] = 'Y';//y
        }

        /*check all the pieces
         * first,according to the name,x,y and orientation of each piece,
         * we need to get the real placement of each loops of this piece
         * then, we check whether these loops are on the board:
         * if not, return false
         * if on the board,check whether the place statement is 0:
         * if 0,we put this piece on the board
         * othervise,we check the color of this piece with occupied pegs:
         * if they have different colors,return false .
         * if they have the same color ,we will check whether the place of the pegs conflicts with one of the depressions
         * of this piece:
         * if not ,return false,
         * otherwise,put this piece to the board
         * */
        for (int i = 0; i < pieceNum; i++)//initial place
        {
            name = placement.charAt(i * 4 + 0) - 'a';
            x = placement.charAt(i * 4 + 1) - '0' - 1;  //0-7
            y = placement.charAt(i * 4 + 2) - 'A';//A-B --> 0-3
            d = placement.charAt(i * 4 + 3) - '0';//0-7

            int loopnum = loopnumber[name];
            Loop[] piece = Loop.pieceloops.get(name);//Integer[a 0->7][loopnum][2]
            int[] pieceDep = Loop.piecedeps.get(name);
            Loop[] tmp;

            if (d <= 3) tmp = PiecesIni.rotate(piece, d);
            else tmp = PiecesIni.flip(piece, d - 3);

            for (int j = 0; j < loopnum; j++)//[d[i]][loopnumber[i]][0]
            {
                actualx = tmp[j].x + x - 1;
                actualy = tmp[j].y + y - 1;
                if (!((actualx <= 7 && actualx >= 0) && (actualy >= 0 && actualy <= 3))) {
                    //System.out.println("wrong place");
                    //System.out.println(i + " " + actualx + " " + actualy);
                    return false;
                }

                if (loca[actualy][actualx] == 0) {
                    loca[actualy][actualx] = 1;
                } else if (loca[actualy][actualx] == 1 && piececolor[name] == checkPeg[actualy][actualx]) {
                    boolean flag = false;
                    for (int k = 0; k < pieceDep.length; k++) {
                        Loop l1 = tmp[pieceDep[k]];
                        actualDepx = l1.x + x - 1;
                        actualDepy = l1.y + y - 1;
                        if ((actualDepx == actualx && actualDepy == actualy)) flag = true;
                    }
                    if (flag == false)
                        //  System.out.println("means this piece conflicts with peg!");
                        return false;
                } else {
                    //System.out.println("mean this piece conflicts with other pieces!");
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * Given a string describing a placement of pieces and pegs, return a set
     * of all possible next viable piece placements.   To be viable, a piece
     * placement must be a valid placement of a single piece.  The piece must
     * not have already been placed (ie not already in the placement string),
     * and its placement must be valid.   If there are no valid piece placements
     * for the given placement string, return null.
     * <p>
     * When symmetric placements of the same piece are viable, only the placement
     * with the lowest rotation should be included in the set.
     *
     * @param placement A valid placement string (comprised of peg and piece placements)
     * @return An set of viable piece placements, or null if there are none.
     */
    public static Set<String> getViablePiecePlacements(String placement) {
        // FIXME Task 6: determine the set of valid next piece placements
        if (!isPlacementStringValid(placement)) return null;
        Set<String> piece = new HashSet<>();
        List<Character> placementList = new ArrayList<Character>();// all the char elements in placement
        List<Loop> validNode_XY = new ArrayList<>();//x and y of all the valid placement (4*8 nodes in the board)
        List<Character> list = new ArrayList<Character>();//all the names of pieces from  placement
        List<Character> validNodesName = new ArrayList<Character>();//all the valid names of pieces which did not exist in the board
        Map<Character, Integer> nameMap = new HashMap<>();// the name of pieces which will be added to the board and its index of the insertion place

        int allnum = placement.length() / 4;
        int countPeg = 0;//amount of pegs

        for (char c : placement.toCharArray()) {
            placementList.add(c);
        }
        /*all the nodes should be detected*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                Loop l = new Loop(j, i);
                validNode_XY.add(l);
            }
        }
        /* count the amount of pegs*/
        for (int i = 0; i < allnum; i++) {
            char name = placement.charAt(i * 4 + 0);
            if (name >= 'i') countPeg++;
            else list.add(name);
        }
        int pieceNum = allnum - countPeg;
        /*add valid piece which did not exist in the board*/
        for (char i = 'a'; i <= 'h'; i++) {
            if (!list.contains(i)) {
                validNodesName.add(i);
                //System.out.println("validNodesName:"+i);
            }
        }
        /*map the name of each piece which will be inserted to the string
         * and the index of the pieces
         * find the previous one or later one in the placement,and insert
         * after the previous one or insert before the later one
         */
        /* int insertPos = 0;
            int count = 0;
            for (int q = 1; q < 8; q++) {//find the position of character which before x
                int indexc = list.indexOf((char) (x - q));
                System.out.println("q " + (char) (x - q) + "indexc " + indexc);
                if (indexc != -1 && count == 0) {
                    insertPos = indexc + 4;
                    count++;
                }
            }*/

        for (char c : validNodesName) {
            int count = 0;
            int success = 0;
            for (int q = 1; q < 8; q++) {
                char cp = (char) (c - q);
                int insertpos = placementList.indexOf(cp);
                if (count == 0 && insertpos != -1) {
                    nameMap.put(c, insertpos + 4);
                    //System.out.println(c + " maps "+(insertpos + 4));
                    success = 1;
                    count++;
                }
            }
            if (success == 0) nameMap.put(c, 0);
        }

        int valid = 0;
        /*we check all the valid nodes with all possible place in the board
         * together with all possible orientations
         * Note : insert each possible string into the StringBuffer and check whether
         *  this string is valid.If valid, put this string into the hashset.
         *  If not,replace this string with "".
         */
        for (char n : validNodesName) {
            for (Loop c : validNode_XY) {
                for (int i = 0; i <= 7; i++) {
                    String s = "";
                    char cy = (char) (c.y + 65);//y  transfer into A,B,C,D
                    int cx = c.x + 1;//x  transfer into 1,2,3,4,5,6,7,8

                    s = s + "" + n + "" + cx + "" + cy + "" + i;
                    //System.out.println("test viable s" + s);
                    StringBuffer sb = new StringBuffer();
                    sb.append(placement);
                    sb.insert(nameMap.get(n), s);

                    if (isPlacementStringValid(sb.toString())) {
                        int notadd = checksymmetry(piece, n, i);
                        if (notadd == 0) {
                            piece.add(s);
                            valid++;
                        }
                    } else {
                        if (s.charAt(0) == 'c')
                            //System.out.println("this string "+sb.toString()+" is not viable");
                            sb.replace(nameMap.get(n), nameMap.get(n) + 3, "");
                    }
                }
            }
        }
        if (valid == 0) piece = null;
        return piece;
    }

    /*check special case (weak symmetry),
     * notadd means previous piece which is eligible has been put to the board ,
     * so if we can find such a piece , we will not consider this piece which we want to add now
     */
    static int checksymmetry(Set<String> piece, char n, int i) {
        int notadd = 0;
        for (String ps : piece) {
            char nam = ps.charAt(0);
            int orient = ps.charAt(3) - '0';
            if (n == nam && nam == 'b' && i - orient == 2) {
                notadd++;
            } else if (n == nam && (nam == 'c') && (i - orient) % 2 == 0 & i != 0) {
                notadd++;
                // System.out.println("c"+orient+" will not be added to the board!!!");
            } else if (n == nam && (nam == 'h') && (i - orient) % 2 == 0 & i != 0) {
                notadd++;
            } else if (n == nam && nam == 'e') {
                if ((i == 7 && orient == 0) || (i == 4 && orient == 1) || (i == 5 && orient == 2) || (i == 6 && orient == 3))
                    notadd++;
            } else if (n == nam && nam == 'f') {
                if ((i == 6 && orient == 0) || (i == 7 && orient == 1) || (i == 4 && orient == 2) || (i == 5 && orient == 3))
                    notadd++;
            }
        }
        return notadd;
    }

    /**
     * Return an array of all unique solutions for a given starting placement.
     * <p>
     * Each solution should be a 32-character string giving the placement sequence
     * of all eight pieces, given the starting placement.
     * <p>
     * The set of solutions should not include any symmetric piece placements.
     * <p>
     * In the IQ-Twist game, valid challenges can have only one solution, but
     * other starting placements that are not valid challenges may have more
     * than one solution.  The most obvious example is the unconstrained board,
     * which has very many solutions.
     *
     * @param placement A valid piece placement string.
     * @return An array of strings, each 32-characters long, describing a unique
     * unordered solution to the game given the starting point provided by placement.
     */
    /* author:Le Fang
     * Ideas:Since we can use fuction:getViablePiecePlacements()in task 6 to get all the viable set of string,
     * for example, if we get viable set like this:a1A0,a1C4,b1D5,b2C8
     * we will check whether these strings are valid: a1A0b1D5,a1A0b2C8,a1C4b1D5,a1C4b2C8
     * so in order to find the right place to insert,I design a function named:  insertOfList()
     */
    public static String[] getSolutions(String placement) {
        TreeSet<String> placeTreeSet = new TreeSet<>();
        //the tree order of all solution strings(a1A0,a1C4,b1D5,b2C8),the start character of all solution strings(a,a,a,a,b,b,b,b,b)
        Set<Character> valueset = new HashSet<>();
        //in order to calculate the amount of different characters(a,b,c,d)
        List<TreeSet<String>> treeSetlist = new ArrayList<>();//all treesets
        Map<String, Character> smap = new HashMap<>();
        //the value of each map is the first character of this string
        Set<String> placementSet = getViablePiecePlacements(placement);
        //all possible solutions(a1A0,b1D5,a1C4,b2C8)
        StringBuffer validString = new StringBuffer();
        //change placement into the stringbuffer,it will be convenient for us to operate
        List<String> l = new ArrayList<>();
        //store the results of this function
        TreeSet<String> TreeSetOfs;

        for (String s : placementSet) { //all the viable string of pieces
            placeTreeSet.add(s);
            //System.out.print("viable piece :"+ s +" ");
        }
        for (String s : placeTreeSet) {
            smap.put(s, s.charAt(0));
            //string as the key ,the first character of this string as the value,put them into the map
            valueset.add(s.charAt(0));
        }

        /*use different treesets to store the viable string of each piece
            just like we get viable pieces like this:a1A0,b1D5,a1C4,b2C8
            then we can get:
            treeSetlist.get(0) :a1A0a1C4
            treeSetlist.get(1) :b1D5b2C8
            */
        for (Character s : valueset) {//valueset stores the first character of all these viable strings (like a,b,c,no duplicates)
            int i = 0;
            //System.out.println(" s valueset: " + s);
            TreeSetOfs = new TreeSet<>();
            for (Map.Entry<String, Character> entry : smap.entrySet()) {
                if (entry.getValue().equals(s)) {
                    TreeSetOfs.add(entry.getKey());
                    System.out.println(" i " + i + "th treeset add " + s + " " + entry.getKey());
                }
            }
            treeSetlist.add(TreeSetOfs);
            i++;
        }

        for (char p : placement.toCharArray()) {
            validString.append(p);
        }
        // System.out.println("initial validstring is:"+validString);
        insertOfList(valueset.size() - 1, treeSetlist, validString, l);// the most important part:recursive
        String[] sus = new String[l.size()];
        //change list into String[]
        for (int i = 0; i < l.size(); i++) {
            sus[i] = l.get(i);
        }
        return sus;
    }

    /*
     * try to find all possible placements of given viable strings
     */
    static void insertOfList(int n, List<TreeSet<String>> treeSetlist, StringBuffer validString, List<String> l) {

        if (n >= 0) {
            for (String s : treeSetlist.get(n)) {
                //System.out.println("n == "+ n +"before insert:"+validString);
                int insertPos = 0;
                int count = 0;
                /*
                find the character which is the fisrt character smaller than s.charAt(0)(like b of b1D5),
                we will find a in the existed placement ,then we can insert b1D5 to the position of a plus 4
                if this character element does not exist,the position of inserting this piece(b1D5) will be 0
                */
                for (int q = 1; q < 8; q++) {
                    int indexc = validString.toString().indexOf((char) (s.charAt(0) - q));
                    if (indexc != -1 && count == 0) {
                        insertPos = indexc + 4;
                        count++;
                    }
                }
                validString.insert(insertPos, s);

                insertOfList(n - 1, treeSetlist, validString, l);//recursive
                //if all the pieces have been put to the string,we need to check whether this string placement is valid
                //System.out.println("test l:"+validString.toString());
                if (n == 0 && isPlacementStringValid(validString.toString())) {
                    if (isPlacementStringValid(validString.toString().substring(0, 32)))
                        l.add(validString.toString().substring(0, 32));
                    System.out.println("test: l:" + l.toString() + " is valid ");
                }
                validString.replace(insertPos, insertPos + 4, "");
                //we need to remove this piece in order to put other placement of this piece to the string
            }
        }
    }

    //public static void main(String[] args) {

    //  String[] sus = getSolutions("a1A3d3C4j4C0l2D0l5B0");
        //a7A7b6A7c1A3d2A6e2C3f3C2g4A7h6D0i6B0j2B0j1C0k3C0l4B0l5C0
        //change list into String[]
    // for (int i = 0; i < sus.length; i++) {
    // System.out.println(sus[i] + " ");
    //  }
    // System.out.println(isPlacementStringValid("a3B3b6A4c3A4d1B5e1A0f7B7g4B3h5D0"));
    // }
}
