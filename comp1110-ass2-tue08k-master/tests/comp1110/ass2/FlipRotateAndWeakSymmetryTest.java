package comp1110.ass2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static comp1110.ass2.PiecesIni.flip;
import static comp1110.ass2.PiecesIni.rotate;
import static comp1110.ass2.TwistGame.checksymmetry;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlipRotateAndWeakSymmetryTest {//u6590727 LeFang
    @Test
    public void testFlipA7()
    {

        Loop[]flipped = flip(Loop.a,4);//we need to get a7
        Loop[]ftru ={ new Loop(1,1),new Loop(2,1) ,new Loop(2,2) ,new Loop(2,3)};
        int flag = 0;
        for(Loop l :flipped)
        {
            for(Loop k : ftru)
            {
                if(l.x == k.x&&l.y ==k.y) flag++;
            }
        }
        assertTrue(flag==4 && flipped.length==flag);
    }

    @Test
    public void testRotateB3()
    {

        Loop[]rotated = rotate(Loop.b,3);//we need to get b3
        Loop[]rtru ={ new Loop(1,2),new Loop(1,3) ,new Loop(2,1) ,new Loop(2,2)};
        int flag = 0;
        for(Loop l :rotated)
        {
            for(Loop k : rtru)
            {
                if(l.x == k.x&&l.y ==k.y) flag++;
            }
        }
        assertTrue(flag==4 && rotated.length==flag);
    }
   @Test
   public void checkWeakSymmetry()
   {
       char name = 'c';
       int orientation = 5;
       Set<String> set = new HashSet<>();
       set.add("a3C2");
       set.add("b1D3");
       set.add("c1A1");
       Set<String> set2 = new HashSet<>();
       set2.add("a5C2");
       set2.add("b1A3");
       set2.add("d1D1");
      assertTrue(checksymmetry(set,name,orientation) ==1 );
      assertTrue(checksymmetry(set2,name,orientation) ==0 );
   }
}
