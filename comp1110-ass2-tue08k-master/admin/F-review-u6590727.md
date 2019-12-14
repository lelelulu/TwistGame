Reviewer: LeFang (u2345678)
Component: Piece class:
Author: Esra Alhussaini (u6443446)
Review Comments:
1.Piece 49-70:I think the best feature of this code is that it places 8 
  different pieces in the spare place on the board and thus we can drag 
  or rotate them much more easier and when we scroll the mouse, system 
  will show the sum of rotation,which will help us to detect problem and 
  manage the game easier .
2.Piece 40-243: about function :public static void iniboardpiece();  
  this function occupies too much space,So I think it can be compressed,
  and I advise that this code should be added more annotations in order to
  help people get better understand of it.so it is not so well-documented.
3.I think the program decomposition (method structure)is not so appropriate,
  method can be seperated into different parts,we may not need to add 
  listeners to each piece at all.
4.Piece 14-31:it follows Java code conventions,since the name of methods 
  or instances are easily understood and this code also has a constructor,
5.what I suspect an error is that:If we add listeners to each piece like this,
  It will be difficult for us to add some general functions to the piece,
  in other words,it will add some common function seperately which consume
   too much time.
