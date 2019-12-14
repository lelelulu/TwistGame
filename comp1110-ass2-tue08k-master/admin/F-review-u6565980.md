Reviewer: Yajing Wang (u6565980)
Component: TwistGame class, isPlacementStringValid methods.
Author: Le Fang (u6590727)
Review Comments:
1.In my opinion,the best features of this code is the idea that it places all pegs to the board first and set the place
which they occupied as 1 and then it checks all the pieces,that is whether the pieces on the board and match the pegs.
This idea makes the method clear thinking.
2.I think this code is well-documented because if the string was invalid the whole game would not work.
3.I think the program decomposition is appropriate because the method was divided into two parts,one for pegs and one
for pieces,and it is really clear.And in the part for pieces,it determines whether the pieces match the board and the
pegs step by step.
4.I think it fairly follows Java code conventions as the method is properly named but the variables names are a little
bit confusing.And the style is consistent throughout.
5.I think there is no error in this code.






After check whether the placement string is well-formed,it tries to determine whether it is valid.
1.140-153 It gets the number of all pieces and pegs.
2.156-166 It gets where the pegs are and what color they are.Place all the pegs to the board first
and set the place which they occupied as 1 and set the colour checkpeg board to its color.
3.182-227 And then it checks all the pieces.
First,according to the name,x,y and orientation of each piece,it gets the real placement of each loops of this piece.
Then,it checks whether these loops are on the board.If not, return false.If on the board,check whether the place statement is 0.
If 0,it puts this piece on the board.If 1,it checks the color of this piece with occupied pegs:if they have different colors,return false;
if they have the same color ,it will check whether the place of the pegs conflicts with one of the depressions of this piece:if not ,return false,
otherwise,put this piece to the board.

