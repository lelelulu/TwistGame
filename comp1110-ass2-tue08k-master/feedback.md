# Assignment Two Feedback

## Group members: u6565980,u6590727,u6443446

## Tutor Comment

Hi Yajing, Esra and Le Fang, fantastic work! I love how creative the GUI interface is,
the dynamic music which makes the game more enjoyable and informs the player about the
success of their actions is a great touch. I also liked Peppa giving me some hints about
how to play the game, though possibly the addition of a static instructions screen would 
be good as well. Unfortunately, the GUI was very broken - movements were extremely laggy and
unresponsive and I struggled to really make any placements. It also seemed like the snapping
was very sensitive - for example, when I made a hint, I was unable to place my piece where
the hint suggested. But I marked generously here, as I can see that the underlying features 
have been well implemented, its just a matter of bug testing and polishing. Great work.

The design of the code was mostly quite good. I like that there was a clearly a design vision 
which separated different object concepts into their own classes quite nicely. For example,
the process of initialising a piece for the GUI was well handled. You also made use of good
object oriented features throughout. To take your code to the next level, try playing with 
interfaces! Interfaces are extremely powerful and make your code much more extensible and maintainable.
A perfect spot to use an interface was your Music class. You should define a music interface with
the required stop/play methods, then have your particular music class implement this interface.
This is extremely powerful, as it inverts the heirarchy of dependency. What I mean is, say that 
A <- B <- C <- D etc (where <- means "depends on"), then if you change the lowest level class, D, then
it is possible that all of A,B,C may require change. However, if you make D* implement an interface D,
then the details of D* are hidden, so changing D* does not mean that A,B,C have to change. Regardless,
your code style is consistent and pleasing.

I couldn't find any documentation or explanation of how you defined "interesting starting placements", 
so couldn't award these marks. I could only find a static array of some various difficulty levels. 

Great work everyone, keep it up.

## Mark

**9.5/11.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | .25/.25 |
||Authorship clear for all classes      | .25/.25 |
||Appropriate use of git                | .5/.5  |
||Program runs from jar                 | .25/.25 |
|P|Appropriate use of OO features       | .5/.5  |
|P|Presentation pdf complete            | .5/.5  |
|CR|Program well designed               | .5/.5  |
|CR|Comments clear and sufficient       | .5/.5  |
|CR|Coding style good                   | .25/.5  |
|CR|Appropriate use of JUnit tests      | .25/.5  |
|D|Design and code of very high quality | 0/.25 |
|D|Demonstrates interesting extensions  | .25/.25 |
|D|Works well and easy to run           | 0/.25 |
|HD|Game is exceptional                 | .25/.5  |

**Total for miscellaneous marks:**  /5.5

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Pieces snap into place           | .25/.25 |
|CR|Pieces can be rotated            | .25/.25 |
|CR|Pieces can be flipped            | .25/.25 |
|CR|Only valid placements allowed    | .25/.25 |
|D |Basic starting placements        | .25/.25 |
|HD|Hints                            | .25/.25 |
|HD|Interesting starting placements  | 0/.25 |

**Total for manual marks:** 1.75/1.75

## Test results

| Task | Test | Result | Marks |
|:-:|---|:-:|:-:|
| |Compiled|.25/.25|.25|
|2|PlacementWellFormed|5/5|.5|
|3|PlacementStringWellFormed|5/5|.5|
|5|PlacementStringValid|5/5|.5|
|6|ViablePlacements|5/5|1|
|9|Solutions|5/5|1|

**Total for tests:** 3.75/3.75

## Originality statements

#### Originality statement G
We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work:

Signed: Yajing Wang (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)

#### Originality statement F
We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

Esra takes ideas from assignment1 and assignment2.

Signed: Yajing Wang (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)

#### Originality statements E
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:


The idea of <...> came from a discussion with <...>
The code in class <...> uses an idea suggested by <...>
I take the idea from ass1 and ass2


Signed: Esra Alhussaini (u6443446)I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>


Signed:LeFang (u6590727)

#### Originality statements D
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Le Fang  (u6590727)

#### Originality statement C
We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)

*  ....

Signed:Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)

#### Originality statement B
We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)

*  ....

Signed:  Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)

## Git Log
```
commit 7e508be0319fb20e0b5fef7869f8b01729654f4f
Author: Le Fang <le.fang@anu.edu.au>
Date:   Thu Oct 18 22:30:21 2018 +1100

    Update G-features.md

commit 79b5a7c801a1b97a95ad79f74f621da9ac64d504
Merge: eca55a6 87b300a
Author: Le Fang <2716164562@qq.com>
Date:   Thu Oct 18 22:16:18 2018 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       admin/G-best-u6443446.md

commit eca55a62a60473c2b5ccc66afe0c9034e5d0ac32
Author: Le Fang <2716164562@qq.com>
Date:   Thu Oct 18 22:15:29 2018 +1100

    finish stage G

commit 87b300af88f4ba9c34f9c81ea0fcc4664e84effa
Author: Le Fang <le.fang@anu.edu.au>
Date:   Thu Oct 18 22:13:21 2018 +1100

    Delete  G-best-u6443446.md

commit 025ff138e1f7f1990c169db1abf69cb507808c87
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Thu Oct 18 21:03:22 2018 +1100

    Update  G-best-u6443446.md

commit 82f13c0b8ec18dbefcaa5f01bfe9e812593942c0
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Thu Oct 18 21:02:09 2018 +1100

    Add new file

commit 7843e65a6eaecfc17a70c812bf204c761cda4704
Merge: c59fc9b 88e9be5
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Thu Oct 18 20:52:16 2018 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       admin/G-best-u1234567.md

commit c59fc9b674dcc1851bf6edce5688814ce1a6c651
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Thu Oct 18 20:51:28 2018 +1100

    best

commit 88e9be5dba2bb0e2d74b29cd9ebef4fa62f29320
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Thu Oct 18 20:49:32 2018 +1100

    Update G-contribution.md

commit 9a8a7b01eb8bfedacc0930a072d752a9a31a5c47
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Thu Oct 18 20:49:15 2018 +1100

    Update G-contribution.md

commit 52b3bdebe06469eef4cded2fe09825fe4c8d9960
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Thu Oct 18 20:47:50 2018 +1100

    Update G-best-u1234567.md

commit 59da827d90b5ba194de733ef49905a589da781fb
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Thu Oct 18 20:47:05 2018 +1100

    Update G-best-u1234567.md

commit c49ee2e50e62d506e26bff43beb2618cca55847c
Merge: 96ae327 aa7e5f7
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Thu Oct 18 20:27:41 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k

commit 96ae32795078bb1f85af908bfeddf806118e4854
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Thu Oct 18 20:27:31 2018 +1100

    commit

commit aa7e5f7e57336e1be8ef291ad415191a1e55f6a9
Author: Le Fang <2716164562@qq.com>
Date:   Thu Oct 18 20:14:36 2018 +1100

    finish presentation

commit b422ec064fcfb372e7025a7abfaba3a2b41feb63
Merge: cb81253 7c6346d
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Thu Oct 18 17:04:27 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k

commit cb812533d26e329c71c392b01a5a516b05ed944b
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Thu Oct 18 17:04:16 2018 +1100

    commit

commit 90ef108b111dc7df5424d99c227cbb2646669b19
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Thu Oct 18 17:01:41 2018 +1100

    commit

commit 7c6346d889ef926f343dc9694acae9d56767190b
Author: Le Fang <2716164562@qq.com>
Date:   Thu Oct 18 16:28:17 2018 +1100

    edit docu

commit 4f146cef6b275b76ae0a03717308e9a86a6779d9
Author: Le Fang <2716164562@qq.com>
Date:   Thu Oct 18 12:57:13 2018 +1100

    make it beautiful

commit 6c2fa1c095822eec00fd0890bf0355af992d1dea
Author: Le Fang <2716164562@qq.com>
Date:   Thu Oct 18 12:52:13 2018 +1100

    add some effects

commit 606733722745cb09711350b98b62bcac471848f2
Author: Le Fang <2716164562@qq.com>
Date:   Wed Oct 17 00:10:07 2018 +1100

    refine placement

commit d24f6f93e76900d937cd615a1152d1c5619eaf5f
Author: Le Fang <2716164562@qq.com>
Date:   Tue Oct 16 22:09:27 2018 +1100

    all have solutions!

commit 408ae0df4c0085cc038ab0153ac6181fff3adcf6
Author: Le Fang <2716164562@qq.com>
Date:   Tue Oct 16 12:33:15 2018 +1100

    almost final version

commit c12eac469fddcfc0491594ba25b611f65019a7f8
Merge: cb3b964 dc7c6af
Author: Le Fang <2716164562@qq.com>
Date:   Mon Oct 15 16:16:25 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit cb3b964830863f1d326ed8a3e349ce5eb39306d6
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 22:41:58 2018 +1100

    almost finish task 10

commit 05e10e1958ebfefa87180ee5e12aac773918387b
Merge: 0089774 a023521
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 21:22:58 2018 +1100

    try to give hints

commit 00897743b93687bde66aacd288c678310a4fb458
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 20:38:49 2018 +1100

    test all cases

commit a023521b4f3b3597000699f0861ebea342a84064
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Sat Oct 13 20:32:22 2018 +1100

    fix solutions 51-100

commit 0a926b1b711647d17f7fa8ebe462d3c7cf7c2d2e
Merge: 35781f1 6ae4c35
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Sat Oct 13 19:45:44 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Peg.java

commit 6ae4c3514f74a23dc397930507cfa3553efcd3a9
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 17:31:20 2018 +1100

    solve some problems

commit 35781f182a236c791282641cc9140f0dc7730a80
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Sat Oct 13 17:20:21 2018 +1100

    pieces solutions 51-100

commit 63482850b02707d589aee16fced761af71804a02
Merge: beeb142 a83b717
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 17:05:21 2018 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Peg.java

commit a83b717026e2f607efe987dcb0716cf45d3cf9a9
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Sat Oct 13 17:04:43 2018 +1100

    pieces solutions 51-100

commit beeb142380c14d77bf5ade718cd084eccaee9f43
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 17:03:25 2018 +1100

    solve some problems

commit f330550eeb3cdab569a64a365d3f0356a56a4657
Merge: 4c168c8 7477018
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 13:48:47 2018 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar
    #       src/comp1110/ass2/gui/Peg.java

commit 4c168c879a6273114e112d255a4ebf838a5c475d
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 13:09:56 2018 +1100

     add notes

commit 747701814461b77fcf6e783fdf25ea77a665cfba
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Sat Oct 13 12:21:34 2018 +1100

    add initial pieces for 50 challenges

commit 31ff1ae54810ab7bbf0dc04849aecf0ed61b02c1
Merge: 8ef3e22 4c4aba0
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 13 09:41:04 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit dc7c6afd3d03055f27d92a60b30357601816d4cb
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Thu Oct 11 22:18:22 2018 +1100

    Correct feature list for G

commit 8ef3e22a62f1600d603735c037535d1f71900bc9
Author: Le Fang <2716164562@qq.com>
Date:   Thu Oct 11 12:28:29 2018 +1100

     expect to add more conditions in task 8

commit 9f2ce051de21626d8b5de5f6d0fe281e11c084d3
Author: Le Fang <2716164562@qq.com>
Date:   Tue Oct 9 21:27:01 2018 +1100

    almost finish task 8

commit 7eec046eae536ad5d8c788e0916dde8fbe8d09d4
Author: Le Fang <2716164562@qq.com>
Date:   Tue Oct 9 11:22:56 2018 +1100

    passed task 9

commit 4c4aba0689b82243c78ae7ed87543260d3e1044f
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Sat Oct 6 16:23:48 2018 +1000

    n

commit 7bac9324b0b6c3c2715be858e27e91480d1f4b9b
Author: Le Fang <2716164562@qq.com>
Date:   Sat Oct 6 15:10:14 2018 +1000

    finish 7 and 8 mostly

commit ff33016d6bf0aed71772fd8435c178477ed66516
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Thu Oct 4 12:43:27 2018 +1000

    l

commit 79ab293c20faa6ec649a754bb2d2cc0ba2747152
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Tue Oct 2 09:13:38 2018 +1000

    Test Changes + cleaning orig

commit 89f337507ac8c4dfba316648e813f38c12fafd48
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Oct 2 07:40:32 2018 +1000

    code review

commit eb1b8b64ab27dfb22b4c7926ce9ff0da3d8db570
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Tue Oct 2 05:35:18 2018 +1000

    Update F-review-u6443446.md

commit 6dbd66e86540909be2931f3ba2bf5bd82cf2f2b6
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Tue Oct 2 05:34:57 2018 +1000

    Update F-review-u6443446

commit ab932855c75742b59c7b6c75826dafa2e2a531df
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Tue Oct 2 05:34:16 2018 +1000

    Add new file

commit 438f92eca14ab2dbc7913f678968a683cfa7b002
Merge: 274b6d5 d4e7205
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Oct 2 00:34:29 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 274b6d5e161beee76c476ebbc6daa56a51034365
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Oct 2 00:34:08 2018 +1000

    authorship

commit d4e72055d3c46784baa090f3c49510b1a96231e2
Merge: aa05475 cac2fc1
Author: Le Fang <2716164562@qq.com>
Date:   Tue Oct 2 00:24:33 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit aa054758592d1b866dc13a3340f1065676356ce5
Author: Le Fang <2716164562@qq.com>
Date:   Tue Oct 2 00:17:37 2018 +1000

    add review

commit cac2fc17895d18411cda9522457b55e3c47c4a75
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Mon Oct 1 23:30:46 2018 +1000

    originality and contribution

commit 8ab072c977558984c33446e753a6d03980e61151
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Mon Oct 1 22:48:02 2018 +1000

    game.jar

commit 56b6322f870865e0bcf37926b1407598eb0ef42a
Author: Le Fang <2716164562@qq.com>
Date:   Mon Oct 1 22:24:27 2018 +1000

    change viewer to board!

commit 4460933e91239e82ac40c648ce9510efc0337e4b
Author: Le Fang <2716164562@qq.com>
Date:   Mon Oct 1 22:03:17 2018 +1000

    fix problem

commit 299803d9ac48e77a284529fe0464ce02a5d3e48f
Author: Le Fang <le.fang@anu.edu.au>
Date:   Mon Oct 1 21:54:52 2018 +1000

    Delete Viewer.java

commit f791722825083ed849cb87eb81bf37fe43683901
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Mon Oct 1 20:39:41 2018 +1000

    Update Viewer.java

commit 25727da0d86e5f15837364c05e34d8d05a6b20ae
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Mon Oct 1 20:33:00 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Viewer.java
    #       src/gittest/Main.java

commit ad3b1a6650d569ca4f0e96340c4b7e47a3063493
Merge: 5304e58 2bb0ad3
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Mon Oct 1 19:35:04 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Viewer.java
    #       src/gittest/Main.java

commit 5304e5829fa7b66feba86559dd24ce697205424c
Merge: a7d0c85 94dedb9
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Sun Sep 30 20:39:15 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/TwistGame.java
    #       src/comp1110/ass2/gui/Viewer.java

commit 2bb0ad37adae9ea248d3c525113ea4b9527e853e
Merge: e427abb 1bd1993
Author: Le Fang <2716164562@qq.com>
Date:   Sun Sep 30 20:29:21 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit e427abbf0c413208e76b15ed92a0959b4c666a92
Author: Le Fang <2716164562@qq.com>
Date:   Sun Sep 30 20:28:26 2018 +1000

    try task 7 and prepare for package

commit 1bd1993b9e536cb06faad266d74cf18cf0ad1894
Author: Le Fang <le.fang@anu.edu.au>
Date:   Tue Sep 25 07:22:19 2018 +1000

    Update E-originality-u6590727.md

commit 8bae5b348871930f6c9068dfba4bcf1b0261e5e0
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Tue Sep 25 07:20:18 2018 +1000

    Update E-originality-u6443446.md

commit f2a30375910f97895ca20c0570e7ebd3e05664d6
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Tue Sep 25 07:19:50 2018 +1000

    Add new file

commit a05046965071ac96a9c36f189b130d6bb0ce0f96
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Tue Sep 25 06:51:45 2018 +1000

    Update E-originality-u6590727.md

commit a7d0c85bb0d2c81247b9bdee1379bb8fe4a08b3d
Merge: d7abc39 7f7fd5f
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Tue Sep 25 06:30:47 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k
    
    # Conflicts:
    #       src/comp1110/ass2/Peg.java
    #       src/comp1110/ass2/Piece.java
    #       src/comp1110/ass2/Shape.java
    #       src/comp1110/ass2/TwistGame.java
    #       src/comp1110/ass2/gui/BoardImage.java
    #       src/comp1110/ass2/gui/Viewer.java

commit 94dedb9ee7e95b0a17d52a3c19f4a06f7536a2cf
Author: lenovo <2716164562@qq.com>
Date:   Mon Sep 24 17:19:54 2018 +1000

    passes task 6,add notes and tests
    originality(u6590727)

commit 2deb302611698cd255c67a4db044d660e237eede
Author: lenovo <2716164562@qq.com>
Date:   Mon Sep 24 12:13:21 2018 +1000

    passes task 6,add notes(u6590727)

commit d7abc39cfde8138fa5b8f62799973adc081ed4d6
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Mon Sep 24 08:51:03 2018 +1000

    Create an instance of C within Main

commit d0e06b93691ba78856964ebe536442e71849526e
Author: lenovo <2716164562@qq.com>
Date:   Sun Sep 23 17:36:52 2018 +1000

    LeFang, passes task 6,add notes

commit f15c05c94c557551221cd55f6c6b9e5511b47ad4
Author: lenovo <2716164562@qq.com>
Date:   Sun Sep 23 15:49:33 2018 +1000

    LeFang, passes task 6

commit 7f7fd5f82d68cdc739bafe46c0b8f9cc2db2fe3e
Author: lenovo <2716164562@qq.com>
Date:   Sat Sep 22 11:26:19 2018 +1000

    Update PieceIni

commit 9143e23f8213ea0c390e66f5c06d1d45d7410560
Author: lenovo <2716164562@qq.com>
Date:   Sat Sep 22 10:12:50 2018 +1000

    task 4,task 5 finish!

commit 7c6eea9cc1e3d65e8ad22828dd60e4cfeb85fc7c
Merge: 1791ccc 63e146f
Author: lenovo <2716164562@qq.com>
Date:   Tue Sep 18 09:56:08 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k
    
    # Conflicts:
    #       admin/D-originality-u6590727.md

commit 1791cccafdaaa9e6e05888ec8ecf4e9247328580
Author: lenovo <2716164562@qq.com>
Date:   Tue Sep 18 08:10:12 2018 +1000

    originality_u6590727

commit 63e146fe6933ee4be4b5aba72173f1879e1b32b5
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Sep 18 04:41:28 2018 +1000

    Update D-originality-u6565980.md

commit 0b47cd7ce080c322e88d936d94fe8e35aa06d5e2
Author: lenovo <2716164562@qq.com>
Date:   Mon Sep 17 20:10:59 2018 +1000

    originality_u6590727

commit 10792458e26ae0a5902e63e5d1b3907146472604
Merge: d44fe1a 7eba818
Author: lenovo <2716164562@qq.com>
Date:   Mon Sep 17 20:07:38 2018 +1000

    originality_LeFang_u6590727

commit d44fe1a04e65b4853ce9338b8f2ecee1a75374c8
Author: lenovo <2716164562@qq.com>
Date:   Fri Sep 14 15:26:43 2018 +1000

    Task5 change

commit 45524c6847f69e649a991d15e71c9c9f13c1282b
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Fri Sep 14 13:44:35 2018 +1000

    Improved error message

commit 1f16cfeaa468e03fe67058c53af53c97dab20bb2
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Tue Sep 11 14:32:12 2018 +1000

    Further normalization

commit f9e67ea082a89320f58418fe0cd0932d7317f58c
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Tue Sep 11 08:13:31 2018 +1000

    Fix thanks to Yuan Chen

commit 7c9874a187459efbed7ac38c899db997b202cb1f
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Sat Sep 8 18:25:33 2018 +1000

    Another fix thanks to Ethal Askander

commit a716274b4d0b0c081969383a06344a592eecfd0a
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Sat Sep 8 17:50:45 2018 +1000

    Fix thanks to Ethal Askander

commit 30a45ea00f7be68e617476ae06ff0c7089a8e44c
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Sat Sep 8 16:41:59 2018 +1000

    Another fix

commit c66679c5a54ec1dd199df9192056f8f8ee0d3b9c
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Sat Sep 8 16:25:22 2018 +1000

    Fix thanks to Yuan Chen and others

commit eb9f3d33827d587348962d7eb2d393532921b691
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Fri Sep 7 16:08:56 2018 +1000

    More fixes, thanks to Zunren

commit 0766d1f63cd48a75ac158774d3db06457f620293
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Fri Sep 7 11:30:36 2018 +1000

    Fix broken tests for task 6.  Thanks to Siyu Jiang

commit 7eba8184dbd1db37d153acd85ee106e64d9e945c
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Mon Aug 27 13:12:48 2018 +1000

    Update C-contribution.md

commit 3aca2e1c8f04236a21ff6230f4bfc584554682e7
Merge: 7d99bd8 8eece37
Author: lenovo <2716164562@qq.com>
Date:   Mon Aug 27 12:09:18 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/TwistGame.java

commit 7d99bd8585dd4a7ef9ccd746b182f8c9162ea234
Author: lenovo <2716164562@qq.com>
Date:   Mon Aug 27 12:07:25 2018 +1000

    Assignment2

commit 8eece37b941014f3f125252c9b7360c1ef922da4
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Mon Aug 27 12:03:27 2018 +1000

    Update C-originality.md

commit 66ae695f6ec929d0eba896b58b23245ef507ad44
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Mon Aug 27 12:00:46 2018 +1000

    task 2&3

commit 850c60d9a8c7fbad67017d8d7d9538fe5355e25c
Author: lenovo <2716164562@qq.com>
Date:   Mon Aug 27 11:35:18 2018 +1000

    Assignment2 upstream

commit e9867de4c029159e1b71ba14b5d2b3058dd5432a
Author: lenovo <2716164562@qq.com>
Date:   Mon Aug 27 11:34:01 2018 +1000

    Assignment2 upstream

commit 13bc76513d07fa0fbcd8eac41d0382385778a245
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Wed Aug 22 15:17:44 2018 +1000

    Change challenge to use minimal rotation, f2 rather than f4

commit 696847bf452c79608d0d3a355ad362dd1e0d5b0c
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Tue Aug 21 21:03:26 2018 +1000

    Fix bug noticed by Wu Qing

commit 49e301078370700eeeaa62489a4b6eaf0bbf775a
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Tue Aug 21 21:02:09 2018 +1000

    Fix ordering of placement strings, bug noticed by Wu Qing

commit 375795645b3a3802f70b39e9ea1c3e1cf8882962
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Tue Aug 21 20:54:44 2018 +1000

    Add missing piece, noticed by Wu Qing

commit 5c02552b593e1cea35566806e1d8b7f7a45acbd6
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Tue Aug 21 20:50:23 2018 +1000

    Fix first problem identified by Wu Qing

commit 25fd0027719c42f7b4cae7091ec1437e5721fb16
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Tue Aug 21 12:15:20 2018 +1000

    Fix PlacementStringValidTest to call the correct method

commit 96dacc044e76fe243c8d2f6ce0f10c7c08220e46
Merge: f76fe55 dc5d8db
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Aug 21 10:54:24 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k
    
    # Conflicts:
    #       src/gittest/Main.java

commit f76fe55a857fb0c3bcd24322637bb7b685967953
Author: Alice <u6565980@anu.edu.au>
Date:   Tue Aug 21 10:39:49 2018 +1000

    Create an A class within Main

commit dc5d8dbe91c42acef7c92eb10e7730962ae7d9af
Merge: 8b95464 6e9dc81
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Tue Aug 21 10:36:28 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 6e9dc815456dab717fb90f489d2c433fb62f1712
Merge: 4c09ea5 036a439
Author: u6590727 <2716164562@qq.com>
Date:   Tue Aug 21 10:31:54 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 8b9546473c9cf5ea9441aeee0a30ffd1fef00cde
Author: Cindy <u6443446Aanu.edu.au>
Date:   Tue Aug 21 10:25:47 2018 +1000

    Create an instance of C within Main

commit 4c09ea5aaee5fc9e3b3184fff969b18f15f571de
Author: Bob <u6590727@anu.edu.au>
Date:   Tue Aug 21 10:23:18 2018 +1000

    Create an instance of B inside Main

commit 036a43963e57f6e4aea44ec66aa89682da2f0fed
Author: Alice <u6565980@anu.edu.au>
Date:   Tue Aug 21 10:20:26 2018 +1000

    Create an A class within Main

commit 7b49ea60a2a34c74f6716b95139d591b3263ee5a
Merge: 82e4f22 21cb327
Author: u6590727 <2716164562@qq.com>
Date:   Tue Aug 21 09:51:02 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 21cb327594e98fe68a25b65ce8b71f59a59547d4
Author: Cindy <u6443446Aanu.edu.au>
Date:   Tue Aug 21 09:48:11 2018 +1000

    Added C

commit 82e4f22af0ca8e0cb8490fabc603a458db47d5b8
Author: Bob <u6590727@anu.edu.au>
Date:   Tue Aug 21 09:45:12 2018 +1000

    added b

commit 8756be26c6677ae773ed92192a07c735f7ba9357
Merge: 169cbe9 9dfbced
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Tue Aug 21 09:45:11 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k

commit 9dfbced0b4548ae143ecb55d674a99c67ff9e3c6
Merge: 0faff87 9f9975e
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Aug 21 09:41:25 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 0faff873c0a91278915699e34577647ea0ae8d89
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Aug 21 09:39:40 2018 +1000

    Alice 1(Yajing)

commit 9f9975e0fc0f0e41a6d6f829f14262ad8db6578a
Merge: 9eb5902 527cf3b
Author: u6590727 <2716164562@qq.com>
Date:   Tue Aug 21 09:34:56 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6565980/comp1110-ass2-tue08k
    
    # Conflicts:
    #       src/comp1110/ass2/TwistGame.java

commit 169cbe9461721e837034c69d4edd3093bed3a930
Author: Cindy <u6443446Aanu.edu.au>
Date:   Tue Aug 21 09:27:16 2018 +1000

    finished greate C.

commit ce9c092676bb54c4aa8e34d1eb30114347fcdf95
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Tue Aug 21 09:24:16 2018 +1000

    finished greate C.

commit 527cf3b4494d7a31c27f57f1f0a53c55281b1e6f
Merge: c1c4fb2 3edec0a
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Aug 21 08:45:28 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit c1c4fb23f32fcf9296682a30eb48efbdcfd66aa1
Author: Yajing <u6565980@anu.edu.au>
Date:   Tue Aug 21 08:42:56 2018 +1000

    Alice 1(Yajing)

commit 9eb5902a2f98ed73d2482385287d006f3fceb357
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Mon Aug 20 22:25:42 2018 +1000

    Added new unit tests

commit 1b53bd87835bb359f648d158fc1e2bfe90559cc9
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Mon Aug 20 22:13:08 2018 +1000

    Clarifications

commit eec0771bfc7d592013244c728d213eb93737c661
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Mon Aug 20 22:11:26 2018 +1000

    Clarify points in README

commit 3edec0ae3293701d4775f854cefaae86cd036b77
Merge: 699438c 0e6725b
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Mon Aug 20 15:28:42 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 699438cebb053cd907d658aed310b59298b4fcab
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Mon Aug 20 15:28:27 2018 +1000

    finished sketch/skeleton file.

commit 0e6725bb6ae116e2d2893495251b624eefa753ea
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Mon Aug 20 15:24:45 2018 +1000

    Update B-contribution.md

commit fc6b7b6e6c182543c2245f4bef82bf80c3586776
Merge: 0e85ca9 b352a56
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Mon Aug 20 15:19:28 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 0e85ca91f59b42a2cd26dd38ec162e34f8b19f72
Author: esraalhussaini <u6443446@anu.edu.au>
Date:   Mon Aug 20 15:18:57 2018 +1000

    finished sketch/skeleton file

commit b352a569c9595af146e3492a9be7f968e6e9e4d3
Merge: c679e57 d05e70d
Author: lenovo <2716164562@qq.com>
Date:   Mon Aug 20 13:49:41 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit c679e575badb0eef1576dc716d3fc56661d97c6f
Author: lenovo <2716164562@qq.com>
Date:   Mon Aug 20 13:47:34 2018 +1000

    Assignment2

commit d05e70d9043bba731f99c9c099eb2b60dda1f18c
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Mon Aug 20 13:29:01 2018 +1000

    Update B-originality.md

commit e052cb66ba32bdd32e72ff67086871790c7336dc
Author: Esra Alhussaini <esra.alhussaini@anu.edu.au>
Date:   Mon Aug 20 13:27:13 2018 +1000

    Update B-contribution.md

commit 153e3eb32f67c126ad63abf7aac37aafcdd712a9
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Thu Aug 16 21:29:51 2018 +1000

    Correction

commit 69bdedd51831fd60268b32a4950550ec6f1387d6
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Wed Aug 15 13:32:47 2018 +1000

    Make key methods public

commit 5b0d8ed5eb9af66482b185724eb9461ba9114d3a
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Wed Aug 15 13:32:17 2018 +1000

    Center pegs nicely

commit 357a97ee2b7409852071e661dc5fa538267cbc89
Author: Yajing Wang <u6565980@anu.edu.au>
Date:   Tue Aug 14 09:38:32 2018 +1000

    Update tasks.md

commit f7811be68e2a89cc9f62f5a7717980c39a0da574
Author: Steve Blackburn <steve.blackburn@anu.edu.au>
Date:   Mon Aug 13 22:57:32 2018 +1000

    Initial import
```
## Changes
``` diff
Only in comp1110-ass2/.idea: artifacts
diff -ru -x .git ../master/comp1110-ass2/.idea/comp1110-ass2.iml comp1110-ass2/.idea/comp1110-ass2.iml
--- ../master/comp1110-ass2/.idea/comp1110-ass2.iml	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/.idea/comp1110-ass2.iml	2018-10-19 19:27:00.779795543 +1100
@@ -19,5 +19,15 @@
         <SOURCES />
       </library>
     </orderEntry>
+    <orderEntry type="module-library">
+      <library>
+        <CLASSES>
+          <root url="jar://$APPLICATION_HOME_DIR$/lib/junit-4.12.jar!/" />
+          <root url="jar://$APPLICATION_HOME_DIR$/lib/hamcrest-core-1.3.jar!/" />
+        </CLASSES>
+        <JAVADOC />
+        <SOURCES />
+      </library>
+    </orderEntry>
   </component>
 </module>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/T2_PlacementWellFormedTest.xml comp1110-ass2/.idea/runConfigurations/T2_PlacementWellFormedTest.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/T2_PlacementWellFormedTest.xml	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/.idea/runConfigurations/T2_PlacementWellFormedTest.xml	2018-10-19 19:27:00.779795543 +1100
@@ -3,24 +3,17 @@
     <module name="comp1110-ass2" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.*" />
+        <option name="PATTERN" value="comp1110.ass2.gui.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
-    <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
-    <option name="ALTERNATIVE_JRE_PATH" />
     <option name="PACKAGE_NAME" value="comp1110.ass2" />
     <option name="MAIN_CLASS_NAME" value="comp1110.ass2.PlacementWellFormedTest" />
     <option name="METHOD_NAME" value="" />
-    <option name="TEST_OBJECT" value="class" />
-    <option name="VM_PARAMETERS" value="-ea" />
     <option name="PARAMETERS" value="" />
     <option name="WORKING_DIRECTORY" value="file://$MODULE_DIR$" />
-    <option name="PASS_PARENT_ENVS" value="true" />
-    <option name="TEST_SEARCH_SCOPE">
-      <value defaultName="singleModule" />
-    </option>
-    <patterns />
-    <method />
+    <method v="2">
+      <option name="Make" enabled="true" />
+    </method>
   </configuration>
 </component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/T3_PlacementStringWellFormedTest.xml comp1110-ass2/.idea/runConfigurations/T3_PlacementStringWellFormedTest.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/T3_PlacementStringWellFormedTest.xml	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/.idea/runConfigurations/T3_PlacementStringWellFormedTest.xml	2018-10-19 19:27:00.779795543 +1100
@@ -3,24 +3,17 @@
     <module name="comp1110-ass2" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.*" />
+        <option name="PATTERN" value="comp1110.ass2.gui.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
-    <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
-    <option name="ALTERNATIVE_JRE_PATH" />
     <option name="PACKAGE_NAME" value="comp1110.ass2" />
     <option name="MAIN_CLASS_NAME" value="comp1110.ass2.PlacementStringWellFormedTest" />
     <option name="METHOD_NAME" value="" />
-    <option name="TEST_OBJECT" value="class" />
-    <option name="VM_PARAMETERS" value="-ea" />
     <option name="PARAMETERS" value="" />
     <option name="WORKING_DIRECTORY" value="file://$MODULE_DIR$" />
-    <option name="PASS_PARENT_ENVS" value="true" />
-    <option name="TEST_SEARCH_SCOPE">
-      <value defaultName="singleModule" />
-    </option>
-    <patterns />
-    <method />
+    <method v="2">
+      <option name="Make" enabled="true" />
+    </method>
   </configuration>
 </component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/T5_PlacementStringValidTest.xml comp1110-ass2/.idea/runConfigurations/T5_PlacementStringValidTest.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/T5_PlacementStringValidTest.xml	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/.idea/runConfigurations/T5_PlacementStringValidTest.xml	2018-10-19 19:27:00.779795543 +1100
@@ -3,24 +3,17 @@
     <module name="comp1110-ass2" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.*" />
+        <option name="PATTERN" value="comp1110.ass2.gui.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
-    <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
-    <option name="ALTERNATIVE_JRE_PATH" />
     <option name="PACKAGE_NAME" value="comp1110.ass2" />
     <option name="MAIN_CLASS_NAME" value="comp1110.ass2.PlacementStringValidTest" />
     <option name="METHOD_NAME" value="" />
-    <option name="TEST_OBJECT" value="class" />
-    <option name="VM_PARAMETERS" value="-ea" />
     <option name="PARAMETERS" value="" />
     <option name="WORKING_DIRECTORY" value="file://$MODULE_DIR$" />
-    <option name="PASS_PARENT_ENVS" value="true" />
-    <option name="TEST_SEARCH_SCOPE">
-      <value defaultName="singleModule" />
-    </option>
-    <patterns />
-    <method />
+    <method v="2">
+      <option name="Make" enabled="true" />
+    </method>
   </configuration>
 </component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/T6_ViablePlacementsTest.xml comp1110-ass2/.idea/runConfigurations/T6_ViablePlacementsTest.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/T6_ViablePlacementsTest.xml	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/.idea/runConfigurations/T6_ViablePlacementsTest.xml	2018-10-19 19:27:00.779795543 +1100
@@ -3,24 +3,17 @@
     <module name="comp1110-ass2" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.*" />
+        <option name="PATTERN" value="comp1110.ass2.gui.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
-    <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
-    <option name="ALTERNATIVE_JRE_PATH" />
     <option name="PACKAGE_NAME" value="comp1110.ass2" />
     <option name="MAIN_CLASS_NAME" value="comp1110.ass2.ViablePlacementsTest" />
     <option name="METHOD_NAME" value="" />
-    <option name="TEST_OBJECT" value="class" />
-    <option name="VM_PARAMETERS" value="-ea" />
     <option name="PARAMETERS" value="" />
     <option name="WORKING_DIRECTORY" value="file://$MODULE_DIR$" />
-    <option name="PASS_PARENT_ENVS" value="true" />
-    <option name="TEST_SEARCH_SCOPE">
-      <value defaultName="singleModule" />
-    </option>
-    <patterns />
-    <method />
+    <method v="2">
+      <option name="Make" enabled="true" />
+    </method>
   </configuration>
 </component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/runConfigurations/T9_SolutionsTest.xml comp1110-ass2/.idea/runConfigurations/T9_SolutionsTest.xml
--- ../master/comp1110-ass2/.idea/runConfigurations/T9_SolutionsTest.xml	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/.idea/runConfigurations/T9_SolutionsTest.xml	2018-10-19 19:27:00.779795543 +1100
@@ -3,24 +3,17 @@
     <module name="comp1110-ass2" />
     <extension name="coverage">
       <pattern>
-        <option name="PATTERN" value="comp1110.ass2.*" />
+        <option name="PATTERN" value="comp1110.ass2.gui.*" />
         <option name="ENABLED" value="true" />
       </pattern>
     </extension>
-    <option name="ALTERNATIVE_JRE_PATH_ENABLED" value="false" />
-    <option name="ALTERNATIVE_JRE_PATH" />
     <option name="PACKAGE_NAME" value="comp1110.ass2" />
     <option name="MAIN_CLASS_NAME" value="comp1110.ass2.SolutionsTest" />
     <option name="METHOD_NAME" value="" />
-    <option name="TEST_OBJECT" value="class" />
-    <option name="VM_PARAMETERS" value="-ea" />
     <option name="PARAMETERS" value="" />
     <option name="WORKING_DIRECTORY" value="file://$MODULE_DIR$" />
-    <option name="PASS_PARENT_ENVS" value="true" />
-    <option name="TEST_SEARCH_SCOPE">
-      <value defaultName="singleModule" />
-    </option>
-    <patterns />
-    <method />
+    <method v="2">
+      <option name="Make" enabled="true" />
+    </method>
   </configuration>
 </component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/README.md comp1110-ass2/README.md
--- ../master/comp1110-ass2/README.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/README.md	2018-10-19 19:27:00.779795543 +1100
@@ -11,7 +11,7 @@
 Carefully review the [statement of originality](originality.md) which you must complete.  Edit that statement and update it as you complete each state of the assignment, ensuring that when you complete each stage, a truthful statement is committed and pushed to your repo.
 
 ## Purpose
-
+****
 In this assignment you will exercise a number of major themes of the course, including software design and implementation, using development tools such as Git and IntelliJ, using JavaFX to build a user interface.   Above all, this assignment will emphasize group work.
 
 ## Assignment Deliverables
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/B-contribution.md	2018-10-19 19:27:00.779795543 +1100
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6565980 30
+* u6590727 40
+* u6443446 30
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/B-originality.md	2018-10-19 19:27:00.779795543 +1100
@@ -6,4 +6,4 @@
 
 *  ....
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed:  Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/C-contribution.md	2018-10-19 19:27:00.779795543 +1100
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6565980 35
+* u6443446 25
+* u6590727 40
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/C-originality.md	2018-10-19 19:27:00.779795543 +1100
@@ -6,4 +6,4 @@
 
 *  ....
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed:Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.md
Only in comp1110-ass2/admin: D-originality-u6590727.md
Only in ../master/comp1110-ass2/admin: E-originality-u1234567.md
Only in comp1110-ass2/admin: E-originality-u6443446.md
Only in comp1110-ass2/admin: E-originality-u6590727.md
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/F-contribution.md	2018-10-19 19:27:00.779795543 +1100
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u6565980 30
+* u6443446 30
+* u6590727 40
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
 
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/F-originality.md	2018-10-19 19:27:00.779795543 +1100
@@ -1,9 +1,5 @@
 We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+Esra takes ideas from assignment1 and assignment2.
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Yajing Wang (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
Only in ../master/comp1110-ass2/admin: F-review-u1234567.md
Only in comp1110-ass2/admin: F-review-u6443446.md
Only in comp1110-ass2/admin: F-review-u6565980.md
Only in comp1110-ass2/admin: F-review-u6590727.md
Only in ../master/comp1110-ass2/admin: G-best-u1234567.md
Only in comp1110-ass2/admin: G-best-u6443446.md
Only in comp1110-ass2/admin: G-best-u6565980.md
Only in comp1110-ass2/admin: G-best-u6590727.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/G-contribution.md	2018-10-19 19:27:00.779795543 +1100
@@ -1,8 +1,10 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
+u6565980 25
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+u6443446 25
 
+u6590727 50
+
+
+Signed: Yajing Wang  (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/G-features.md	2018-10-19 19:27:00.779795543 +1100
@@ -1,5 +1,4 @@
-In addition to the features that are auto-graded, the graphical user interface
-of our project implements the following features:
+In addition to the features that are auto-graded, the graphical user interface of our project implements the following features:
 
 *(Remove those that are unimplemented)*
 
@@ -10,4 +9,5 @@
  - Implements hints (Task 10)
  - Implements interesting starting placements (Task 11)
 
-additional features...
+additional features:
+instruction and musics during the game
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2018-10-19 19:04:21.510579930 +1100
+++ comp1110-ass2/admin/G-originality.md	2018-10-19 19:27:00.779795543 +1100
@@ -1,9 +1,3 @@
-We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
+We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
-
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Yajing Wang (u6565980), Esra Alhussaini (u6443446), and Le Fang (u6590727)
Only in comp1110-ass2/admin: presentation.pdf
Only in comp1110-ass2/admin: sketch
diff -ru -x .git ../master/comp1110-ass2/admin/tasks.md comp1110-ass2/admin/tasks.md
--- ../master/comp1110-ass2/admin/tasks.md	2018-10-19 19:04:21.514580002 +1100
+++ comp1110-ass2/admin/tasks.md	2018-10-19 19:27:00.783795617 +1100
@@ -5,7 +5,11 @@
 
 ## Week 4
 
-Everyone: create application skeleton - meeting 14:00 17 Aug
+Everyone: create application skeleton - meeting 9:00 16 Aug
+Jenny:u6565980,0450650109,design the game and write some code
+Esra:u6443446,0415054385,write most code
+Fang:u6590727,0415850781,write code and design
+
 
 ## Week 5
 
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2/src: META-INF
Only in comp1110-ass2/src/comp1110/ass2: Loop.class
Only in comp1110-ass2/src/comp1110/ass2: Loop.java
Only in comp1110-ass2/src/comp1110/ass2: PiecesIni.class
Only in comp1110-ass2/src/comp1110/ass2: PiecesIni.java
Only in comp1110-ass2/src/comp1110/ass2: TwistGame.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/TwistGame.java comp1110-ass2/src/comp1110/ass2/TwistGame.java
--- ../master/comp1110-ass2/src/comp1110/ass2/TwistGame.java	2018-10-19 19:04:21.542580509 +1100
+++ comp1110-ass2/src/comp1110/ass2/TwistGame.java	2018-10-19 19:27:00.819796289 +1100
@@ -1,6 +1,12 @@
 package comp1110.ass2;
 
-import java.util.Set;
+//package comp1110.ass2;
+
+import comp1110.ass2.gui.Piece;
+
+import java.util.*;
+
+import static comp1110.ass2.PiecesIni.IniLoopAndDepress;
 
 /**
  * This class provides the text interface for the Twist Game
@@ -9,94 +15,496 @@
  * (http://www.smartgames.eu/en/smartgames/iq-twist)
  */
 public class TwistGame {
+    static List<Integer[][]> pieceLoop = new ArrayList<>(8);//a,b,c,d,e,f,g,h
+    static List<Integer[][]> pieceDepression = new ArrayList<>(8);
+    static int[] loopnumber = {4, 4, 4, 5, 3, 4, 5, 3};
+    static int[] depnumber = {2, 1, 1, 2, 2, 2, 3, 1};
+    static char[] piececolor = {'R', 'R', 'B', 'B', 'G', 'G', 'Y', 'Y'};
+
+
+    static public int[][] loca = new int[4][8];//  row A-D column 1-8
+    static public char[][] checkPeg = new char[4][8];
+
+    static int countsolution = 0;
+
+    /*create a board of 4*8 nodes and check the occupation statement of each node ,
+    when a piece or peg occupies one node,this node will be set 1,otherwise 0  */
+    static void initialboard() {
+        for (int i = 0; i < 4; i++) {
+            for (int j = 0; j < 8; j++) {
+                loca[i][j] = 0;
+            }
+        }
+    }
+
+    /*
+    create a board of 4*8 nodes and check the color
+    of the pegs which had occupied one node of this board
+    */
+    static void initialCheckPeg() {
+        for (int i = 0; i < 4; i++) {
+            for (int j = 0; j < 8; j++) {
+                checkPeg[i][j] = '0';
+            }
+        }
+    }
+
+
+    /**
+     * Determine whether a piece or peg placement is well-formed according to the following:
+     * - it consists of exactly four characters
+     * - the first character is in the range a .. l (pieces and pegs)
+     * - the second character is in the range 1 .. 8 (columns)
+     * - the third character is in the range A .. D (rows)
+     * - the fourth character is in the range 0 .. 7 (if a piece) or is 0 (if a peg)
+     *
+     * @param piecePlacement A string describing a single piece or peg placement
+     * @return True if the placement is well-formed
+     */
+    public static boolean isPlacementWellFormed(String piecePlacement) {//
+        // FIXME Task 2: determine whether a piece or peg placement is well-formed
+        if ((piecePlacement.length() == 4 &&
+                piecePlacement.charAt(1) >= '1' && piecePlacement.charAt(1) <= '8' &&
+                piecePlacement.charAt(2) >= 'A' && piecePlacement.charAt(2) <= 'D' &&
+                piecePlacement.charAt(0) >= 'a' && piecePlacement.charAt(0) <= 'h' && piecePlacement.charAt(3) >= '0' && piecePlacement.charAt(3) <= '7') ||
+                (piecePlacement.charAt(0) >= 'i' && piecePlacement.charAt(0) <= 'l' && piecePlacement.charAt(3) == '0'))
+            return true;
+        else
+            return false;
+    }
+    //This function was written by Yajing Wang(u6565980).Use if statement and include all the requirement for a well-formed piece or peg as the boolean expression to determine whether it is well-formed.
+
+    /**
+     * Determine whether a placement string is well-formed:
+     * - it consists of exactly N four-character piece placements (where N = 1 .. 15);
+     * - each piece or peg placement is well-formed
+     * - each piece or peg placement occurs in the correct alphabetical order (duplicate pegs can be in either order)
+     * - no piece or red peg appears more than once in the placement
+     * - no green, blue or yellow peg appears more than twice in the placement
+     *
+     * @param placement A string describing a placement of one or more pieces and pegs
+     * @return True if the placement is well-formed
+     */
+    public static boolean isPlacementStringWellFormed(String placement) {
+        // FIXME Task 3: determine whether a placement is well-formed
+        if (placement.length() / 4 < 1 || placement.length() / 4 > 15 || placement.length() % 4 != 0)
+            return false;
+        for (int i = 0; i < placement.length() - 3; i = i + 4) {
+            boolean flag = true;
+            flag = isPlacementWellFormed(placement.substring(i, i + 4));
+            if (!flag) return false;
+        }
+        for (int i = 0; i < placement.length() - 7; i = i + 4)
+            if (placement.charAt(i) > placement.charAt(i + 4))
+                return false;
+        int m = 0;
+        for (int i = 0; i < placement.length() - 7; i = i + 4)
+            if (placement.charAt(i) < 'j' && placement.charAt(i) == placement.charAt(i + 4) && placement.charAt(i + 3) == placement.charAt(i + 7))
+                return false;
+        for (int i = 0; i < placement.length() - 11; i = i + 4)
+            if (placement.charAt(i) >= 'j' && placement.charAt(i) == placement.charAt(i + 4) && placement.charAt(i + 4) == placement.charAt(i + 8))
+                return false;
+        return true;
+    }
+    //This function was written by Yajing Wang(u6565980).Use if statement and for statement to check if the placement is well-formed.
+
+    /**
+     * Determine whether a placement string is valid.  To be valid, the placement
+     * string must be well-formed and each piece placement must be a valid placement
+     * according to the rules of the game.
+     * - pieces must be entirely on the board
+     * - pieces must not overlap each other
+     * - pieces may only overlap pegs when the a) peg is of the same color and b) the
+     * point of overlap in the piece is a hole.
+     *
+     * @param placement A placement sequence string
+     * @return True if the placement sequence is valid
+     */
+  /*    j
+    i  *        1-8  A-B   0-7
+       *0   a
+       *1   b
+       *2   c
+       *3   d
+       *4   e
+       *5   f
+       *6   g
+       *7   h
+       *
+       */
+    public static boolean isPlacementStringValid(String placement) {
+        // FIXME Task 5: determine whether a placement string is valid
+        if (!isPlacementStringWellFormed(placement)) return false;
+        initialboard();
+        initialCheckPeg();
+        IniLoopAndDepress();
+
+        int allnum = placement.length() / 4;
+        int x, y, d, name, na;
+        int actualx, actualy;
+        int actualDepx, actualDepy;
+        int pegX, pegY;
+        int countPeg = 0;
+
+        for (int i = 0; i < allnum; i++)//initial place
+        {
+            na = placement.charAt(i * 4 + 0) - 'a';
+            if (na >= 8) countPeg++;
+        }
+        int pieceNum = 0;
+        pieceNum = allnum - countPeg;
+        /*place all the pegs to the board first and set the place which they occupied from 0 to 1
+         * and set the colour checkpeg board to its color */
+        for (int i = pieceNum; i < allnum; i++)//initial place
+        {
+            name = placement.charAt(i * 4 + 0) - 'a';
+            pegX = placement.charAt(i * 4 + 1) - '0' - 1;  //0-7
+            pegY = placement.charAt(i * 4 + 2) - 'A';//A-B --> 0-3
+            loca[pegY][pegX] = 1;
+            if (name == 8) checkPeg[pegY][pegX] = 'R';//i
+            else if (name == 9) checkPeg[pegY][pegX] = 'B';//j
+            else if (name == 10) checkPeg[pegY][pegX] = 'G';//k
+            else if (name == 11) checkPeg[pegY][pegX] = 'Y';//y
+        }
+
+        /*check all the pieces
+         * first,according to the name,x,y and orientation of each piece,
+         * we need to get the real placement of each loops of this piece
+         * then, we check whether these loops are on the board:
+         * if not, return false
+         * if on the board,check whether the place statement is 0:
+         * if 0,we put this piece on the board
+         * othervise,we check the color of this piece with occupied pegs:
+         * if they have different colors,return false .
+         * if they have the same color ,we will check whether the place of the pegs conflicts with one of the depressions
+         * of this piece:
+         * if not ,return false,
+         * otherwise,put this piece to the board
+         * */
+        for (int i = 0; i < pieceNum; i++)//initial place
+        {
+            name = placement.charAt(i * 4 + 0) - 'a';
+            x = placement.charAt(i * 4 + 1) - '0' - 1;  //0-7
+            y = placement.charAt(i * 4 + 2) - 'A';//A-B --> 0-3
+            d = placement.charAt(i * 4 + 3) - '0';//0-7
+
+            int loopnum = loopnumber[name];
+            Loop[] piece = Loop.pieceloops.get(name);//Integer[a 0->7][loopnum][2]
+            int[] pieceDep = Loop.piecedeps.get(name);
+            Loop[] tmp;
+
+            if (d <= 3) tmp = PiecesIni.rotate(piece, d);
+            else tmp = PiecesIni.flip(piece, d - 3);
+
+            for (int j = 0; j < loopnum; j++)//[d[i]][loopnumber[i]][0]
+            {
+                actualx = tmp[j].x + x - 1;
+                actualy = tmp[j].y + y - 1;
+                if (!((actualx <= 7 && actualx >= 0) && (actualy >= 0 && actualy <= 3))) {
+                    //System.out.println("wrong place");
+                    //System.out.println(i + " " + actualx + " " + actualy);
+                    return false;
+                }
+
+                if (loca[actualy][actualx] == 0) {
+                    loca[actualy][actualx] = 1;
+                } else if (loca[actualy][actualx] == 1 && piececolor[name] == checkPeg[actualy][actualx]) {
+                    boolean flag = false;
+                    for (int k = 0; k < pieceDep.length; k++) {
+                        Loop l1 = tmp[pieceDep[k]];
+                        actualDepx = l1.x + x - 1;
+                        actualDepy = l1.y + y - 1;
+                        if ((actualDepx == actualx && actualDepy == actualy)) flag = true;
+                    }
+                    if (flag == false)
+                        //  System.out.println("means this piece conflicts with peg!");
+                        return false;
+                } else {
+                    //System.out.println("mean this piece conflicts with other pieces!");
+                    return false;
+                }
+            }
+        }
+        return true;
+    }
+
+
+    /**
+     * Given a string describing a placement of pieces and pegs, return a set
+     * of all possible next viable piece placements.   To be viable, a piece
+     * placement must be a valid placement of a single piece.  The piece must
+     * not have already been placed (ie not already in the placement string),
+     * and its placement must be valid.   If there are no valid piece placements
+     * for the given placement string, return null.
+     * <p>
+     * When symmetric placements of the same piece are viable, only the placement
+     * with the lowest rotation should be included in the set.
+     *
+     * @param placement A valid placement string (comprised of peg and piece placements)
+     * @return An set of viable piece placements, or null if there are none.
+     */
+    public static Set<String> getViablePiecePlacements(String placement) {
+        // FIXME Task 6: determine the set of valid next piece placements
+        if (!isPlacementStringValid(placement)) return null;
+        Set<String> piece = new HashSet<>();
+        List<Character> placementList = new ArrayList<Character>();// all the char elements in placement
+        List<Loop> validNode_XY = new ArrayList<>();//x and y of all the valid placement (4*8 nodes in the board)
+        List<Character> list = new ArrayList<Character>();//all the names of pieces from  placement
+        List<Character> validNodesName = new ArrayList<Character>();//all the valid names of pieces which did not exist in the board
+        Map<Character, Integer> nameMap = new HashMap<>();// the name of pieces which will be added to the board and its index of the insertion place
+
+        int allnum = placement.length() / 4;
+        int countPeg = 0;//amount of pegs
+
+        for (char c : placement.toCharArray()) {
+            placementList.add(c);
+        }
+        /*all the nodes should be detected*/
+        for (int i = 0; i < 4; i++) {
+            for (int j = 0; j < 8; j++) {
+                Loop l = new Loop(j, i);
+                validNode_XY.add(l);
+            }
+        }
+        /* count the amount of pegs*/
+        for (int i = 0; i < allnum; i++) {
+            char name = placement.charAt(i * 4 + 0);
+            if (name >= 'i') countPeg++;
+            else list.add(name);
+        }
+        int pieceNum = allnum - countPeg;
+        /*add valid piece which did not exist in the board*/
+        for (char i = 'a'; i <= 'h'; i++) {
+            if (!list.contains(i)) {
+                validNodesName.add(i);
+                //System.out.println("validNodesName:"+i);
+            }
+        }
+        /*map the name of each piece which will be inserted to the string
+         * and the index of the pieces
+         * find the previous one or later one in the placement,and insert
+         * after the previous one or insert before the later one
+         */
+        /* int insertPos = 0;
+            int count = 0;
+            for (int q = 1; q < 8; q++) {//find the position of character which before x
+                int indexc = list.indexOf((char) (x - q));
+                System.out.println("q " + (char) (x - q) + "indexc " + indexc);
+                if (indexc != -1 && count == 0) {
+                    insertPos = indexc + 4;
+                    count++;
+                }
+            }*/
+
+        for (char c : validNodesName) {
+            int count = 0;
+            int success = 0;
+            for (int q = 1; q < 8; q++) {
+                char cp = (char) (c - q);
+                int insertpos = placementList.indexOf(cp);
+                if (count == 0 && insertpos != -1) {
+                    nameMap.put(c, insertpos + 4);
+                    //System.out.println(c + " maps "+(insertpos + 4));
+                    success = 1;
+                    count++;
+                }
+            }
+            if (success == 0) nameMap.put(c, 0);
+        }
+
+        int valid = 0;
+        /*we check all the valid nodes with all possible place in the board
+         * together with all possible orientations
+         * Note : insert each possible string into the StringBuffer and check whether
+         *  this string is valid.If valid, put this string into the hashset.
+         *  If not,replace this string with "".
+         */
+        for (char n : validNodesName) {
+            for (Loop c : validNode_XY) {
+                for (int i = 0; i <= 7; i++) {
+                    String s = "";
+                    char cy = (char) (c.y + 65);//y  transfer into A,B,C,D
+                    int cx = c.x + 1;//x  transfer into 1,2,3,4,5,6,7,8
+
+                    s = s + "" + n + "" + cx + "" + cy + "" + i;
+                    //System.out.println("test viable s" + s);
+                    StringBuffer sb = new StringBuffer();
+                    sb.append(placement);
+                    sb.insert(nameMap.get(n), s);
+
+                    if (isPlacementStringValid(sb.toString())) {
+                        int notadd = checksymmetry(piece, n, i);
+                        if (notadd == 0) {
+                            piece.add(s);
+                            valid++;
+                        }
+                    } else {
+                        if (s.charAt(0) == 'c')
+                            //System.out.println("this string "+sb.toString()+" is not viable");
+                            sb.replace(nameMap.get(n), nameMap.get(n) + 3, "");
+                    }
+                }
+            }
+        }
+        if (valid == 0) piece = null;
+        return piece;
+    }
+
+    /*check special case (weak symmetry),
+     * notadd means previous piece which is eligible has been put to the board ,
+     * so if we can find such a piece , we will not consider this piece which we want to add now
+     */
+    static int checksymmetry(Set<String> piece, char n, int i) {
+        int notadd = 0;
+        for (String ps : piece) {
+            char nam = ps.charAt(0);
+            int orient = ps.charAt(3) - '0';
+            if (n == nam && nam == 'b' && i - orient == 2) {
+                notadd++;
+            } else if (n == nam && (nam == 'c') && (i - orient) % 2 == 0 & i != 0) {
+                notadd++;
+                // System.out.println("c"+orient+" will not be added to the board!!!");
+            } else if (n == nam && (nam == 'h') && (i - orient) % 2 == 0 & i != 0) {
+                notadd++;
+            } else if (n == nam && nam == 'e') {
+                if ((i == 7 && orient == 0) || (i == 4 && orient == 1) || (i == 5 && orient == 2) || (i == 6 && orient == 3))
+                    notadd++;
+            } else if (n == nam && nam == 'f') {
+                if ((i == 6 && orient == 0) || (i == 7 && orient == 1) || (i == 4 && orient == 2) || (i == 5 && orient == 3))
+                    notadd++;
+            }
+        }
+        return notadd;
+    }
+
+    /**
+     * Return an array of all unique solutions for a given starting placement.
+     * <p>
+     * Each solution should be a 32-character string giving the placement sequence
+     * of all eight pieces, given the starting placement.
+     * <p>
+     * The set of solutions should not include any symmetric piece placements.
+     * <p>
+     * In the IQ-Twist game, valid challenges can have only one solution, but
+     * other starting placements that are not valid challenges may have more
+     * than one solution.  The most obvious example is the unconstrained board,
+     * which has very many solutions.
+     *
+     * @param placement A valid piece placement string.
+     * @return An array of strings, each 32-characters long, describing a unique
+     * unordered solution to the game given the starting point provided by placement.
+     */
+    /* author:Le Fang
+     * Ideas:Since we can use fuction:getViablePiecePlacements()in task 6 to get all the viable set of string,
+     * for example, if we get viable set like this:a1A0,a1C4,b1D5,b2C8
+     * we will check whether these strings are valid: a1A0b1D5,a1A0b2C8,a1C4b1D5,a1C4b2C8
+     * so in order to find the right place to insert,I design a function named:  insertOfList()
+     */
+    public static String[] getSolutions(String placement) {
+        TreeSet<String> placeTreeSet = new TreeSet<>();
+        //the tree order of all solution strings(a1A0,a1C4,b1D5,b2C8),the start character of all solution strings(a,a,a,a,b,b,b,b,b)
+        Set<Character> valueset = new HashSet<>();
+        //in order to calculate the amount of different characters(a,b,c,d)
+        List<TreeSet<String>> treeSetlist = new ArrayList<>();//all treesets
+        Map<String, Character> smap = new HashMap<>();
+        //the value of each map is the first character of this string
+        Set<String> placementSet = getViablePiecePlacements(placement);
+        //all possible solutions(a1A0,b1D5,a1C4,b2C8)
+        StringBuffer validString = new StringBuffer();
+        //change placement into the stringbuffer,it will be convenient for us to operate
+        List<String> l = new ArrayList<>();
+        //store the results of this function
+        TreeSet<String> TreeSetOfs;
+
+        for (String s : placementSet) { //all the viable string of pieces
+            placeTreeSet.add(s);
+            //System.out.print("viable piece :"+ s +" ");
+        }
+        for (String s : placeTreeSet) {
+            smap.put(s, s.charAt(0));
+            //string as the key ,the first character of this string as the value,put them into the map
+            valueset.add(s.charAt(0));
+        }
+
+        /*use different treesets to store the viable string of each piece
+            just like we get viable pieces like this:a1A0,b1D5,a1C4,b2C8
+            then we can get:
+            treeSetlist.get(0) :a1A0a1C4
+            treeSetlist.get(1) :b1D5b2C8
+            */
+        for (Character s : valueset) {//valueset stores the first character of all these viable strings (like a,b,c,no duplicates)
+            int i = 0;
+            //System.out.println(" s valueset: " + s);
+            TreeSetOfs = new TreeSet<>();
+            for (Map.Entry<String, Character> entry : smap.entrySet()) {
+                if (entry.getValue().equals(s)) {
+                    TreeSetOfs.add(entry.getKey());
+                    System.out.println(" i " + i + "th treeset add " + s + " " + entry.getKey());
+                }
+            }
+            treeSetlist.add(TreeSetOfs);
+            i++;
+        }
+
+        for (char p : placement.toCharArray()) {
+            validString.append(p);
+        }
+        // System.out.println("initial validstring is:"+validString);
+        insertOfList(valueset.size() - 1, treeSetlist, validString, l);// the most important part:recursive
+        String[] sus = new String[l.size()];
+        //change list into String[]
+        for (int i = 0; i < l.size(); i++) {
+            sus[i] = l.get(i);
+        }
+        return sus;
+    }
+
+    /*
+     * try to find all possible placements of given viable strings
+     */
+    static void insertOfList(int n, List<TreeSet<String>> treeSetlist, StringBuffer validString, List<String> l) {
+
+        if (n >= 0) {
+            for (String s : treeSetlist.get(n)) {
+                //System.out.println("n == "+ n +"before insert:"+validString);
+                int insertPos = 0;
+                int count = 0;
+                /*
+                find the character which is the fisrt character smaller than s.charAt(0)(like b of b1D5),
+                we will find a in the existed placement ,then we can insert b1D5 to the position of a plus 4
+                if this character element does not exist,the position of inserting this piece(b1D5) will be 0
+                */
+                for (int q = 1; q < 8; q++) {
+                    int indexc = validString.toString().indexOf((char) (s.charAt(0) - q));
+                    if (indexc != -1 && count == 0) {
+                        insertPos = indexc + 4;
+                        count++;
+                    }
+                }
+                validString.insert(insertPos, s);
+
+                insertOfList(n - 1, treeSetlist, validString, l);//recursive
+                //if all the pieces have been put to the string,we need to check whether this string placement is valid
+                //System.out.println("test l:"+validString.toString());
+                if (n == 0 && isPlacementStringValid(validString.toString())) {
+                    if (isPlacementStringValid(validString.toString().substring(0, 32)))
+                        l.add(validString.toString().substring(0, 32));
+                    System.out.println("test: l:" + l.toString() + " is valid ");
+                }
+                validString.replace(insertPos, insertPos + 4, "");
+                //we need to remove this piece in order to put other placement of this piece to the string
+            }
+        }
+    }
+
+    //public static void main(String[] args) {
 
-  /**
-   * Determine whether a piece or peg placement is well-formed according to the following:
-   * - it consists of exactly four characters
-   * - the first character is in the range a .. l (pieces and pegs)
-   * - the second character is in the range 1 .. 8 (columns)
-   * - the third character is in the range A .. D (rows)
-   * - the fourth character is in the range 0 .. 7 (if a piece) or is 0 (if a peg)
-   *
-   * @param piecePlacement A string describing a single piece or peg placement
-   * @return True if the placement is well-formed
-   */
-  public static boolean isPlacementWellFormed(String piecePlacement) {
-    // FIXME Task 2: determine whether a piece or peg placement is well-formed
-    return false;
-  }
-
-  /**
-   * Determine whether a placement string is well-formed:
-   * - it consists of exactly N four-character piece placements (where N = 1 .. 15);
-   * - each piece or peg placement is well-formed
-   * - each piece or peg placement occurs in the correct alphabetical order (duplicate pegs can be in either order)
-   * - no piece or red peg appears more than once in the placement
-   * - no green, blue or yellow peg appears more than twice in the placement
-   *
-   * @param placement A string describing a placement of one or more pieces and pegs
-   * @return True if the placement is well-formed
-   */
-  public static boolean isPlacementStringWellFormed(String placement) {
-    // FIXME Task 3: determine whether a placement is well-formed
-    return false;
-  }
-
-  /**
-   * Determine whether a placement string is valid.  To be valid, the placement
-   * string must be well-formed and each piece placement must be a valid placement
-   * according to the rules of the game.
-   * - pieces must be entirely on the board
-   * - pieces must not overlap each other
-   * - pieces may only overlap pegs when the a) peg is of the same color and b) the
-   *   point of overlap in the piece is a hole.
-   *
-   * @param placement A placement sequence string
-   * @return True if the placement sequence is valid
-   */
-  public static boolean isPlacementStringValid(String placement) {
-    // FIXME Task 5: determine whether a placement string is valid
-    return false;
-  }
-
-  /**
-   * Given a string describing a placement of pieces and pegs, return a set
-   * of all possible next viable piece placements.   To be viable, a piece
-   * placement must be a valid placement of a single piece.  The piece must
-   * not have already been placed (ie not already in the placement string),
-   * and its placement must be valid.   If there are no valid piece placements
-   * for the given placement string, return null.
-   *
-   * When symmetric placements of the same piece are viable, only the placement
-   * with the lowest rotation should be included in the set.
-   *
-   * @param placement A valid placement string (comprised of peg and piece placements)
-   * @return An set of viable piece placements, or null if there are none.
-   */
-  public static Set<String> getViablePiecePlacements(String placement) {
-    // FIXME Task 6: determine the set of valid next piece placements
-    return null;
-  }
-
-  /**
-   * Return an array of all unique solutions for a given starting placement.
-   *
-   * Each solution should be a 32-character string giving the placement sequence
-   * of all eight pieces, given the starting placement.
-   *
-   * The set of solutions should not include any symmetric piece placements.
-   *
-   * In the IQ-Twist game, valid challenges can have only one solution, but
-   * other starting placements that are not valid challenges may have more
-   * than one solution.  The most obvious example is the unconstrained board,
-   * which has very many solutions.
-   *
-   * @param placement A valid piece placement string.
-   * @return An array of strings, each 32-characters long, describing a unique
-   * unordered solution to the game given the starting point provided by placement.
-   */
-  public static String[] getSolutions(String placement) {
-    // FIXME Task 9: determine all solutions to the game, given a particular starting placement
-    return null;
-  }
+    //  String[] sus = getSolutions("a1A3d3C4j4C0l2D0l5B0");
+        //a7A7b6A7c1A3d2A6e2C3f3C2g4A7h6D0i6B0j2B0j1C0k3C0l4B0l5C0
+        //change list into String[]
+    // for (int i = 0; i < sus.length; i++) {
+    // System.out.println(sus[i] + " ");
+    //  }
+    // System.out.println(isPlacementStringValid("a3B3b6A4c3A4d1B5e1A0f7B7g4B3h5D0"));
+    // }
 }
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$2.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$3.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Board.java comp1110-ass2/src/comp1110/ass2/gui/Board.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Board.java	2018-10-19 19:04:21.542580509 +1100
+++ comp1110-ass2/src/comp1110/ass2/gui/Board.java	2018-10-19 19:27:00.819796289 +1100
@@ -1,22 +1,266 @@
 package comp1110.ass2.gui;
 
 import javafx.application.Application;
+import javafx.application.Platform;
+import javafx.event.ActionEvent;
+import javafx.event.EventHandler;
+import javafx.scene.Group;
+import javafx.scene.Scene;
+import javafx.scene.control.Button;
+import javafx.scene.control.Label;
+import javafx.scene.control.Slider;
+import javafx.scene.control.TextField;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
+import javafx.scene.layout.HBox;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Circle;
 import javafx.stage.Stage;
 
+import static comp1110.ass2.TwistGame.getSolutions;
+import static comp1110.ass2.gui.Peg.*;
+import static comp1110.ass2.gui.Piece.iniboardpiece;
+import static comp1110.ass2.gui.Shape.checkShape;
+import static comp1110.ass2.gui.Shape.controlshapes;
+
+import java.awt.*;
+import java.util.ArrayList;
+import java.util.List;
+
+
 public class Board extends Application {
-    private static final int BOARD_WIDTH = 933;
-    private static final int BOARD_HEIGHT = 700;
 
-    // FIXME Task 7: Implement a basic playable Twist Game in JavaFX that only allows pieces to be placed in valid places
+    /* board layout */
+    private static final int VIEWER_WIDTH = 750;//750 933
+    private static final int VIEWER_HEIGHT = 650 ;//500 700
+
+    /*all urls of picctures*/
+    private static final String URL_BASE ="assets/";
+    private static final String a_URL = Board.class.getResource(URL_BASE+"a.png").toString();
+    private static final String b_URL = Board.class.getResource(URL_BASE+"b.png").toString();
+    private static final String c_URL = Board.class.getResource(URL_BASE+"c.png").toString();
+    private static final String d_URL = Board.class.getResource(URL_BASE+"d.png").toString();
+    private static final String e_URL = Board.class.getResource(URL_BASE+"e.png").toString();
+    private static final String f_URL = Board.class.getResource(URL_BASE+"f.png").toString();
+    private static final String g_URL = Board.class.getResource(URL_BASE+"g.png").toString();
+    private static final String h_URL = Board.class.getResource(URL_BASE+"h.png").toString();
+
+    private static final String i_URL = Board.class.getResource(URL_BASE+"i.png").toString();
+    private static final String j_URL = Board.class.getResource(URL_BASE+"j.png").toString();
+    private static final String k_URL = Board.class.getResource(URL_BASE+"k.png").toString();
+    private static final String l_URL = Board.class.getResource(URL_BASE+"l.png").toString();
+
+    public static final String succ_URL = Board.class.getResource(URL_BASE + "success.png").toString();
+    public static final String back_URL = Board.class.getResource(URL_BASE + "background.jpg").toString();
+    public static final String inst_URL = Board.class.getResource(URL_BASE + "instruction.jpg").toString();
+
+
+    public static final String[]URLs = {a_URL,b_URL,c_URL,d_URL,e_URL,f_URL,g_URL,h_URL};
+    public static final String[]Peg_URLs = {i_URL,j_URL,k_URL,l_URL};
+
+
+    private final Group root = new Group();
+    private final Group controls = new Group();
+    private final Group controlnodes = new Group();
+
+    TextField textField;
+    public static List<Circle> circlelist = new ArrayList<>();
+    private final Slider difficulty = new Slider();
+    static int storeChallenge;
+
+    /**
+     * Draw a placement in the window, removing any previously drawn one
+     *
+     * @param placement  A valid placement string
+     */
+    public static void makePlacement(String placement) {
+        controlpeg.getChildren().clear();
+        controlshapes.getChildren().clear();
+        int allnum = placement.length()/4;
+        int na,countPeg = 0;
+        String[] s = new String[allnum];
+        int orientation;
+        for (int i = 0; i < allnum; i++)//initial placement
+        {
+            na = placement.charAt(i * 4 + 0) - 'a';
+            if (na >= 8) countPeg++;
+        }
+        for (int i = 0; i < allnum; i++)//s is an array of string which contains 4 characters
+        {
+            s[i] ="";
+            for(int j = 0 ;j < 4;j++)
+            {
+                s[i] = s[i] + placement.charAt(i * 4 + j);
+            }
+        }
+        for(int i = 0;i < allnum ;i++)
+        {
+            orientation = s[i].charAt(3)-'0';
+            if (i >= allnum - countPeg) checkPeg(s[i].charAt(0), s[i].charAt(1), s[i].charAt(2));//put pegs to the board
+            else checkShape(s[i].charAt(0), s[i].charAt(1), s[i].charAt(2), orientation, 0);//put pieces to the board
+        }
+    }
+
+    private void putNodes()  //initialize the board with 45 nodes (4*8 board needs 45 nodes)
+    {
+        for (int i = 0; i < 5; i++) {
+            for (int j = 0; j < 9; j++) {
+                Circle c = new Circle(j*40+80,i*40+120,1);
+                c.setOpacity(50);
+                c.setFill(Color.WHITE);
+                controlnodes.getChildren().add(c);
+                circlelist.add(c);
+            }
+            System.out.println();
+        }
+        System.out.println();
+    }
+
 
-    // FIXME Task 8: Implement starting placements
+    /**
+     * Create a basic text field for input and a refresh button.
+     * use slider called difficulties to control the difficulty of challenges
+     * Button "refresh" is applied to show the placement when users input a string of placement to the textfeild (used for test)
+     * Button "newGame" is applied to initialize the board and is convenient for users to choose the difficulty of challenges.
+     */
+    private void makeControls() {
 
-    // FIXME Task 10: Implement hints
+        Label label1 = new Label("Placement:");
+        Label label2 = new Label("difficulty:");
+        Label difficult = new Label("please press newGame button and start your game!");
+
+        difficulty.setMin(1);
+        difficulty.setMax(4);
+        difficulty.setValue(0);
+        difficulty.setShowTickLabels(true);
+        difficulty.setShowTickMarks(true);
+        difficulty.setMajorTickUnit(1);
+        difficulty.setMinorTickCount(1);
+        difficulty.setSnapToTicks(true);
+        difficulty.setLayoutX(80);
+        difficulty.setLayoutY(300);
+
+        textField = new TextField ();
+        textField.setPrefWidth(300);
+
+        Button button = new Button("Refresh");
+        button.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent e) {
+                makePlacement(textField.getText());
+                textField.clear();
+            }
+        });
+        Button newGame = new Button("newGame");
+
+        newGame.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent e) {
+                Music.stopSuccessMusic();
+                Music.stopStartMusic();
+                controlpeg.getChildren().clear();
+                iniboardpiece(newdifficulty((int) difficulty.getValue()));
+                storeChallenge = showDifficulty - 1;
+                difficult.setText("this is " + (showDifficulty) + " challenge");
+            }
+        });
+
+        Button Restart = new Button("Restart");
+
+        Restart.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent e) {
+                Music.stopSuccessMusic();
+                controlpeg.getChildren().clear();
+                iniboardpiece(difficulties[storeChallenge]);
+                difficult.setText("this is " + (storeChallenge+1) + " challenge again");
+
+            }
+        });
+
+        HBox hb0 = new HBox();
+        Label background = new Label();
+        Image back = new Image((Board.back_URL), 320, 160, false, false);
+        background.setGraphic(new ImageView(back));
+
+
+        hb0.getChildren().addAll(background);
+        hb0.setLayoutX(82);
+        hb0.setLayoutY(VIEWER_HEIGHT - 530);
+
+        HBox hb = new HBox();
+        hb.getChildren().addAll(Restart, label1,textField, button);
+        hb.setSpacing(10);
+        hb.setLayoutX(130);
+        hb.setLayoutY(VIEWER_HEIGHT - 50);
+
+        HBox hb1 = new HBox();
+        hb1.getChildren().addAll(difficulty, newGame, label2, difficult);
+        hb1.setSpacing(10);
+        hb1.setLayoutX(130);
+        hb1.setLayoutY(VIEWER_HEIGHT - 100);
+        //System.out.println("difficulty"+(int)difficulty.getValue());
+        controls.getChildren().add(hb0);
+        controls.getChildren().add(hb);
+        controls.getChildren().add(hb1);
+    }
 
-    // FIXME Task 11: Generate interesting starting placements
 
     @Override
     public void start(Stage primaryStage) throws Exception {
+        primaryStage.setTitle("TwistGame Viewer");
+        Music.playStartMusic();
+        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
+        root.getChildren().add(controls);
+        //iniboardpiece(initial_difficulty_pegs(newdifficulty(0)));
+        root.getChildren().add(controlnodes);
+        root.getChildren().add(controlshapes);
+        root.getChildren().add(controlpeg);
+        root.getChildren().add(iniboardpiece);
+
+        Label inst = new Label();
+        Image instruction = new Image((Board.inst_URL));
+        inst.setGraphic(new ImageView(instruction));
+        inst.setLayoutX(-50 - 0.2 * instruction.getWidth());
+        inst.setLayoutY(270 - 0.2 * instruction.getHeight());
+        inst.setScaleX(0.5);
+        inst.setScaleY(0.5);
+        inst.toBack();
+        root.getChildren().add(inst);
 
+        makeControls();
+        putNodes();
+        primaryStage.setScene(scene);
+        scene.setOnKeyTyped(event -> {
+            if (event.getCharacter().equals("Q"))
+                Platform.exit();
+            else if (event.getCharacter().equals("/")) {
+
+                try {
+                    String solutions = getSolutions(Piece.subs)[0];
+                    if (Piece.checkSuccess(solutions.substring(0, 32))) {
+                        System.out.println("solutions.substring(0, 32)" + solutions.substring(0, 32));
+                        List<Character> validlist = new ArrayList<>();
+                        for (char c : Piece.subs.toCharArray()) {
+                            validlist.add(c);
+                        }
+                        int i = 0, count = 0;
+                        for (char c : solutions.toCharArray()) {
+                            if (c >= 'a' && c <= 'h' && !validlist.contains(c) && count == 0) {
+                                String sub = solutions.substring(i, i + 4);
+                                Shape.checkShape(sub.charAt(0), sub.charAt(1), sub.charAt(2), sub.charAt(3) - '0', 1);
+                                Music.playHintMusic();
+                                count++;
+                            }
+                            i++;
+                        }
+                    } else System.out.println("not a great and completed solution!");
+                } catch (Exception ex) {
+                    System.out.println("throw exception! no solution!!");
+                }
+            }
+        });
+        primaryStage.show();
     }
 }
+
Only in comp1110-ass2/src/comp1110/ass2/gui: Music.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Music.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Peg.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Peg.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Piece.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Piece.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Shape.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Shape.java
Only in ../master/comp1110-ass2/src/comp1110/ass2/gui: Viewer.java
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: background.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: fail.mp3
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: hint.mp3
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: instruction.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: putSuccess.mp3
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: start.mp3
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: success.mp3
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: success.png
Only in comp1110-ass2/tests/comp1110/ass2: FlipRotateAndWeakSymmetryTest.java
```
## Test log
```
--javac output--
----
java -cp comp1110-ass2/src:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/junit-4.12.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/commons-lang3-3.8.1.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/deploy.jar::/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.02

OK (5 tests)

java -cp comp1110-ass2/src:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/junit-4.12.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/commons-lang3-3.8.1.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/deploy.jar::/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementStringWellFormedTest
---
JUnit version 4.12
.....
Time: 0.018

OK (5 tests)

java -cp comp1110-ass2/src:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/junit-4.12.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/commons-lang3-3.8.1.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/deploy.jar::/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementStringValidTest
---
JUnit version 4.12
.....
Time: 0.018

OK (5 tests)

java -cp comp1110-ass2/src:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/junit-4.12.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/commons-lang3-3.8.1.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/deploy.jar::/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.ViablePlacementsTest
---
JUnit version 4.12
.....
Time: 0.156

OK (5 tests)

java -cp comp1110-ass2/src:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/junit-4.12.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/commons-lang3-3.8.1.jar:/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/deploy.jar::/dept/dcs/comp1110/supr/comp1110-tutors/bin/../ass2/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.SolutionsTest
---
JUnit version 4.12
. i 0th treeset add a a7A7
 i 0th treeset add a a6A4
 i 0th treeset add a a7A3
 i 0th treeset add a a6A6
 i 0th treeset add a a7A5
 i 0th treeset add a a6A7
 i 0th treeset add a a6A0
 i 0th treeset add a a6A2
 i 0th treeset add a a7A1
 i 0th treeset add a a6B0
 i 0th treeset add b b7A5
 i 0th treeset add b b6A5
 i 0th treeset add b b7A1
 i 0th treeset add b b6A4
 i 0th treeset add b b6A0
 i 0th treeset add b b6B0
test: l:[a7A7b6A5c1A3d2A6e2C3f3C2g4A7h6D0] is valid 
test: l:[a7A7b6A5c1A3d2A6e2C3f3C2g4A7h6D0, a6A0b6B0c1A3d2A6e2C3f3C2g4A7h6D0] is valid 
. i 0th treeset add d d1C6
 i 0th treeset add d d2C6
 i 0th treeset add d d1B3
 i 0th treeset add d d2B2
 i 0th treeset add d d1B4
 i 0th treeset add d d2B3
 i 0th treeset add d d1B1
 i 0th treeset add d d1B2
 i 0th treeset add d d2B1
 i 0th treeset add d d1B0
 i 0th treeset add d d1B7
 i 0th treeset add d d2B7
 i 0th treeset add d d1B5
 i 0th treeset add d d1B6
 i 0th treeset add d d2B5
 i 0th treeset add d d1C4
 i 0th treeset add d d1C2
 i 0th treeset add d d1C0
 i 0th treeset add g g1A6
 i 0th treeset add g g1B7
 i 0th treeset add g g1B6
 i 0th treeset add g g2B5
 i 0th treeset add g g1B5
 i 0th treeset add g g2B4
 i 0th treeset add g g1B4
 i 0th treeset add g g2B3
 i 0th treeset add g g1B3
 i 0th treeset add g g1B2
 i 0th treeset add g g1B1
 i 0th treeset add g g2B0
 i 0th treeset add g g1B0
test: l:[a6B0b6C0c5A2d1B3e4A5f4C2g2B3h1A2] is valid 
test: l:[a6B0b6C0c5A2d1B3e4A5f4C2g2B3h1A2, a6B0b6C0c5A2d1B5e4A5f4C2g2B5h1A2] is valid 
. i 0th treeset add a a7A7
 i 0th treeset add a a6A4
 i 0th treeset add a a7A3
 i 0th treeset add a a7A5
 i 0th treeset add a a6A7
 i 0th treeset add a a6A0
 i 0th treeset add a a6A2
 i 0th treeset add a a7A1
 i 0th treeset add a a6B0
 i 0th treeset add b b7A5
 i 0th treeset add b b6A7
 i 0th treeset add b b7A1
 i 0th treeset add b b6A0
test: l:[a7A7b6A7c1A3d2A6e2C3f3C2g4A7h6D0] is valid 
 i 0th treeset add a a6B6
 i 0th treeset add a a7B5
 i 0th treeset add a a6B7
 i 0th treeset add a a7B7
 i 0th treeset add a a6B2
 i 0th treeset add a a6B4
 i 0th treeset add a a7B3
 i 0th treeset add a a6C0
 i 0th treeset add a a6B0
 i 0th treeset add b b7B5
 i 0th treeset add b b6B4
 i 0th treeset add b b6C0
 i 0th treeset add b b6B0
test: l:[a6B0b6C0c5A2d1B3e4A5f4C2g2B3h1A2] is valid 
 i 0th treeset add a a5A6
 i 0th treeset add a a6A6
 i 0th treeset add a a6A0
 i 0th treeset add b b5A6
 i 0th treeset add b b4A2
test: l:[a6A0b4A2c3A3d1A3e1C4f4B3g6B2h5D0] is valid 
 i 0th treeset add a a4C4
 i 0th treeset add a a3C2
 i 0th treeset add a a2C4
 i 0th treeset add a a4C2
 i 0th treeset add b b3C0
 i 0th treeset add b b2C4
test: l:[a4C4b2C4c1B2d7B1e1C6f6A0g4A5h1A0] is valid 
 i 0th treeset add a a7B1
 i 0th treeset add b b2C4
test: l:[a7B1b2C4c1B2d4C4e1C3f4A0g6A1h1A0] is valid 
 i 0th treeset add a a1C0
 i 0th treeset add a a1C2
 i 0th treeset add a a2C2
 i 0th treeset add a a1C4
 i 0th treeset add a a1B5
 i 0th treeset add a a1C6
 i 0th treeset add b b2C0
 i 0th treeset add b b1C0
 i 0th treeset add b b1C4
test: l:[a1B5b2C0c5A2d7B7e5B0f1A6g3A7h5D0] is valid 
 i 0th treeset add a a1C6
 i 0th treeset add b b6A6
test: l:[a1C6b6A6c2D0d7B1e1A3f2A2g4B2h4A2] is valid 
 i 0th treeset add a a7B5
 i 0th treeset add a a7B7
 i 0th treeset add a a6B1
 i 0th treeset add a a7B1
 i 0th treeset add a a6C4
 i 0th treeset add a a7A1
 i 0th treeset add a a7B3
 i 0th treeset add b b7B5
 i 0th treeset add b b6C4
 i 0th treeset add b b7A1
 i 0th treeset add b b7B1
test: l:[a6C4b7A1c2D0d1A0e5B4f1B3g3A3h5A0] is valid 
 i 0th treeset add a a1A3
 i 0th treeset add b b5A4
test: l:[a1A3b5A4c5C0d3A6e7A1f3C4g1B3h6D0] is valid 
 i 0th treeset add a a7A7
 i 0th treeset add b b3B5
test: l:[a7A7b3B5c3A0d1A3e5C2f1C4g6B7h4B0] is valid 
. i 0th treeset add a a7A7
 i 0th treeset add a a6A4
 i 0th treeset add a a7A3
 i 0th treeset add a a7A5
 i 0th treeset add a a6A7
 i 0th treeset add a a6A0
 i 0th treeset add a a6A2
 i 0th treeset add a a7A1
 i 0th treeset add a a6B0
 i 0th treeset add b b7A5
 i 0th treeset add b b6A7
 i 0th treeset add b b7A1
 i 0th treeset add b b6A0
 i 0th treeset add c c1A3
test: l:[a7A7b6A7c1A3d2A6e2C3f3C2g4A7h6D0] is valid 
 i 0th treeset add a a6A4
 i 0th treeset add a a6A5
 i 0th treeset add a a6B6
 i 0th treeset add a a7B5
 i 0th treeset add a a5A7
 i 0th treeset add a a6B7
 i 0th treeset add a a7B7
 i 0th treeset add a a6B2
 i 0th treeset add a a6A2
 i 0th treeset add a a7A1
 i 0th treeset add a a6B4
 i 0th treeset add a a7B3
 i 0th treeset add a a6C0
 i 0th treeset add a a6B0
 i 0th treeset add b b6A5
 i 0th treeset add b b7B5
 i 0th treeset add b b7A1
 i 0th treeset add b b6B4
 i 0th treeset add b b6C0
 i 0th treeset add b b5A0
 i 0th treeset add b b6B0
 i 0th treeset add c c8A1
 i 0th treeset add c c5A2
test: l:[a6B0b6C0c5A2d1B3e4A5f4C2g2B3h1A2] is valid 
 i 0th treeset add a a5A6
 i 0th treeset add a a6A6
 i 0th treeset add a a6A0
 i 0th treeset add a a3A6
 i 0th treeset add a a3A0
 i 0th treeset add b b5A6
 i 0th treeset add b b4A2
 i 0th treeset add c c3A3
test: l:[a6A0b4A2c3A3d1A3e1C4f4B3g6B2h5D0] is valid 
 i 0th treeset add a a4C4
 i 0th treeset add a a4B5
 i 0th treeset add a a3B1
 i 0th treeset add a a3C2
 i 0th treeset add a a2C4
 i 0th treeset add a a4C2
 i 0th treeset add b b3C0
 i 0th treeset add b b2C4
 i 0th treeset add b b3B1
 i 0th treeset add c c3D0
 i 0th treeset add c c1B2
 i 0th treeset add c c2D0
test: l:[a4C4b2C4c1B2d7B1e1C6f6A0g4A5h1A0] is valid 
 i 0th treeset add a a7B1
 i 0th treeset add b b2C4
 i 0th treeset add b b3B1
 i 0th treeset add c c1B2
test: l:[a7B1b2C4c1B2d4C4e1C3f4A0g6A1h1A0] is valid 
 i 0th treeset add a a1C0
 i 0th treeset add a a1C2
 i 0th treeset add a a2C2
 i 0th treeset add a a1C4
 i 0th treeset add a a1B5
 i 0th treeset add a a1C6
 i 0th treeset add b b2C0
 i 0th treeset add b b1C0
 i 0th treeset add b b1C4
 i 0th treeset add c c1D0
 i 0th treeset add c c5A2
test: l:[a1B5b2C0c5A2d7B7e5B0f1A6g3A7h5D0] is valid 
 i 0th treeset add a a1C6
 i 0th treeset add b b6A6
 i 0th treeset add b b1C4
 i 0th treeset add c c1D2
 i 0th treeset add c c2D0
test: l:[a1C6b6A6c2D0d7B1e1A3f2A2g4B2h4A2] is valid 
 i 0th treeset add a a7B5
 i 0th treeset add a a7B7
 i 0th treeset add a a6B1
 i 0th treeset add a a5C4
 i 0th treeset add a a7B1
 i 0th treeset add a a6C4
 i 0th treeset add a a7A1
 i 0th treeset add a a7B3
 i 0th treeset add b b7B5
 i 0th treeset add b b6C4
 i 0th treeset add b b7A1
 i 0th treeset add b b7B1
 i 0th treeset add c c8A1
 i 0th treeset add c c4D0
 i 0th treeset add c c3D0
 i 0th treeset add c c5D0
 i 0th treeset add c c2D0
test: l:[a6C4b7A1c2D0d1A0e5B4f1B3g3A3h5A0] is valid 
 i 0th treeset add a a6A5
 i 0th treeset add a a5A1
 i 0th treeset add a a5B2
 i 0th treeset add a a6B2
 i 0th treeset add a a6A3
 i 0th treeset add a a1A3
 i 0th treeset add b b5A4
 i 0th treeset add b b5B0
 i 0th treeset add b b5A1
 i 0th treeset add c c5C0
test: l:[a1A3b5A4c5C0d3A6e7A1f3C4g1B3h6D0] is valid 
 i 0th treeset add a a7A7
 i 0th treeset add a a3A3
 i 0th treeset add a a6A0
 i 0th treeset add a a3A5
 i 0th treeset add a a3A6
 i 0th treeset add b b3B5
 i 0th treeset add c c3A0
 i 0th treeset add c c5A0
 i 0th treeset add c c4A0
test: l:[a7A7b3B5c3A0d1A3e5C2f1C4g6B7h4B0] is valid 
. i 0th treeset add a a6B0
 i 0th treeset add a a1A0
 i 0th treeset add a a7A7
 i 0th treeset add a a6A4
 i 0th treeset add a a7A3
 i 0th treeset add a a7A5
 i 0th treeset add a a6A7
 i 0th treeset add a a6A0
 i 0th treeset add a a1A6
 i 0th treeset add a a6A2
 i 0th treeset add a a7A1
 i 0th treeset add b b7A5
 i 0th treeset add b b6A7
 i 0th treeset add b b7A1
 i 0th treeset add b b6A0
 i 0th treeset add c c1A0
 i 0th treeset add c c1A3
 i 0th treeset add d d7A7
 i 0th treeset add d d7A5
 i 0th treeset add d d7A3
 i 0th treeset add d d1A6
 i 0th treeset add d d2A6
 i 0th treeset add d d7A1
 i 0th treeset add d d6A0
 i 0th treeset add d d1A0
test: l:[a7A7b6A7c1A3d2A6e2C3f3C2g4A7h6D0] is valid 
 i 0th treeset add a a6B6
 i 0th treeset add a a7B5
 i 0th treeset add a a6B7
 i 0th treeset add a a7B7
 i 0th treeset add a a6B2
 i 0th treeset add a a6B4
 i 0th treeset add a a7B3
 i 0th treeset add a a1B3
 i 0th treeset add a a6B0
 i 0th treeset add a a6A4
 i 0th treeset add a a6A5
 i 0th treeset add a a5A7
 i 0th treeset add a a6A2
 i 0th treeset add a a7A1
 i 0th treeset add a a6C0
 i 0th treeset add b b6A5
 i 0th treeset add b b7A1
 i 0th treeset add b b6C0
 i 0th treeset add b b5A0
 i 0th treeset add b b1B1
 i 0th treeset add b b7B5
 i 0th treeset add b b6B4
 i 0th treeset add b b6B0
 i 0th treeset add c c8A1
 i 0th treeset add c c5A2
 i 0th treeset add d d7A7
 i 0th treeset add d d6A5
 i 0th treeset add d d6A3
 i 0th treeset add d d6A4
 i 0th treeset add d d6A2
 i 0th treeset add d d7A1
 i 0th treeset add d d1B3
 i 0th treeset add d d7B7
 i 0th treeset add d d6B6
 i 0th treeset add d d6B4
 i 0th treeset add d d6B2
 i 0th treeset add d d6B0
test: l:[a6B0b6C0c5A2d1B3e4A5f4C2g2B3h1A2] is valid 
 i 0th treeset add a a5A6
 i 0th treeset add a a6A6
 i 0th treeset add a a6A0
 i 0th treeset add a a1A6
 i 0th treeset add a a3A6
 i 0th treeset add a a3A0
 i 0th treeset add a a1A3
 i 0th treeset add a a1A0
 i 0th treeset add b b5A6
 i 0th treeset add b b4A2
 i 0th treeset add c c3A3
 i 0th treeset add c c1A0
 i 0th treeset add d d1A6
 i 0th treeset add d d2A6
 i 0th treeset add d d1A3
 i 0th treeset add d d1A0
test: l:[a6A0b4A2c3A3d1A3e1C4f4B3g6B2h5D0] is valid 
 i 0th treeset add a a6C6
 i 0th treeset add a a4C4
 i 0th treeset add a a4B5
 i 0th treeset add a a6B4
 i 0th treeset add a a3B1
 i 0th treeset add a a3C2
 i 0th treeset add a a2C4
 i 0th treeset add a a4C2
 i 0th treeset add a a6C0
 i 0th treeset add b b5C4
 i 0th treeset add b b2C4
 i 0th treeset add b b3B1
 i 0th treeset add b b3C0
 i 0th treeset add c c3D0
 i 0th treeset add c c1B2
 i 0th treeset add c c2D0
 i 0th treeset add d d3B7
 i 0th treeset add d d6C6
 i 0th treeset add d d7B1
 i 0th treeset add d d3B1
 i 0th treeset add d d3C2
 i 0th treeset add d d2C4
 i 0th treeset add d d6C0
test: l:[a4C4b2C4c1B2d7B1e1C6f6A0g4A5h1A0] is valid 
 i 0th treeset add a a7B1
 i 0th treeset add a a4B5
 i 0th treeset add a a3B1
 i 0th treeset add a a4C4
 i 0th treeset add a a6C2
 i 0th treeset add a a6C4
 i 0th treeset add a a3C2
 i 0th treeset add a a2C4
 i 0th treeset add a a4C2
 i 0th treeset add b b2C4
 i 0th treeset add b b3B1
 i 0th treeset add b b3C0
 i 0th treeset add c c4D0
 i 0th treeset add c c3D0
 i 0th treeset add c c1B2
 i 0th treeset add c c5D0
 i 0th treeset add c c2D0
 i 0th treeset add d d3C4
 i 0th treeset add d d5C2
 i 0th treeset add d d4C4
 i 0th treeset add d d3B1
 i 0th treeset add d d3B7
 i 0th treeset add d d4B5
 i 0th treeset add d d3C2
 i 0th treeset add d d2C4
 i 0th treeset add d d4C2
test: l:[a7B1b2C4c1B2d4C4e1C3f4A0g6A1h1A0] is valid 
 i 0th treeset add a a7A1
 i 0th treeset add a a2C2
 i 0th treeset add a a1C4
 i 0th treeset add a a1B5
 i 0th treeset add a a1C6
 i 0th treeset add a a1C0
 i 0th treeset add a a1C2
 i 0th treeset add b b1C4
 i 0th treeset add b b2C0
 i 0th treeset add b b1C0
 i 0th treeset add c c8A1
 i 0th treeset add c c5A2
 i 0th treeset add c c1D0
 i 0th treeset add d d7B7
 i 0th treeset add d d7A7
 i 0th treeset add d d7A1
 i 0th treeset add d d1C6
 i 0th treeset add d d1C4
 i 0th treeset add d d1C2
 i 0th treeset add d d2C2
 i 0th treeset add d d1C0
test: l:[a1B5b2C0c5A2d7B7e5B0f1A6g3A7h5D0] is valid 
 i 0th treeset add a a7A7
 i 0th treeset add a a7A1
 i 0th treeset add a a1C6
 i 0th treeset add b b6A6
 i 0th treeset add b b7A7
 i 0th treeset add b b7A1
 i 0th treeset add b b6B2
 i 0th treeset add b b1C6
 i 0th treeset add c c8A1
 i 0th treeset add c c1D2
 i 0th treeset add c c2D0
 i 0th treeset add d d7B1
 i 0th treeset add d d1C6
 i 0th treeset add d d1C0
test: l:[a1C6b6A6c2D0d7B1e1A3f2A2g4B2h4A2] is valid 
 i 0th treeset add a a7B5
 i 0th treeset add a a7B7
 i 0th treeset add a a6B1
 i 0th treeset add a a7B1
 i 0th treeset add a a7B3
 i 0th treeset add a a1A0
 i 0th treeset add a a5C4
 i 0th treeset add a a6C4
 i 0th treeset add a a7A1
 i 0th treeset add b b6C4
 i 0th treeset add b b7A1
 i 0th treeset add b b7B5
 i 0th treeset add b b7B1
 i 0th treeset add b b1A0
 i 0th treeset add c c8A1
 i 0th treeset add c c4D0
 i 0th treeset add c c3D0
 i 0th treeset add c c5D0
 i 0th treeset add c c2D0
 i 0th treeset add d d6C4
 i 0th treeset add d d7A1
 i 0th treeset add d d7B7
 i 0th treeset add d d7B5
 i 0th treeset add d d7B3
 i 0th treeset add d d7B1
 i 0th treeset add d d1A0
test: l:[a6C4b7A1c2D0d1A0e5B4f1B3g3A3h5A0] is valid 
 i 0th treeset add a a5B2
 i 0th treeset add a a6B2
 i 0th treeset add a a1A0
 i 0th treeset add a a5A5
 i 0th treeset add a a4A7
 i 0th treeset add a a5A6
 i 0th treeset add a a6A5
 i 0th treeset add a a5A7
 i 0th treeset add a a5A1
 i 0th treeset add a a1A6
 i 0th treeset add a a5A3
 i 0th treeset add a a3A6
 i 0th treeset add a a6A3
 i 0th treeset add a a3A0
 i 0th treeset add a a1A3
 i 0th treeset add a a4A0
 i 0th treeset add b b5A5
 i 0th treeset add b b5A4
 i 0th treeset add b b4A0
 i 0th treeset add b b5A1
 i 0th treeset add b b5B0
 i 0th treeset add c c1A0
 i 0th treeset add c c3A0
 i 0th treeset add c c5C0
 i 0th treeset add c c2A0
 i 0th treeset add c c4A0
 i 0th treeset add c c3B0
 i 0th treeset add d d4A7
 i 0th treeset add d d5A6
 i 0th treeset add d d5A7
 i 0th treeset add d d3A6
 i 0th treeset add d d4A6
 i 0th treeset add d d5A5
 i 0th treeset add d d5A3
 i 0th treeset add d d5A1
 i 0th treeset add d d5B2
 i 0th treeset add d d3A0
 i 0th treeset add d d4A0
 i 0th treeset add d d2A0
test: l:[a1A3b5A4c5C0d3A6e7A1f3C4g1B3h6D0] is valid 
 i 0th treeset add a a1B6
 i 0th treeset add a a1A0
 i 0th treeset add a a7A7
 i 0th treeset add a a3A3
 i 0th treeset add a a6A0
 i 0th treeset add a a1A6
 i 0th treeset add a a2A6
 i 0th treeset add a a3A5
 i 0th treeset add a a2A7
 i 0th treeset add a a3A6
 i 0th treeset add a a1A2
 i 0th treeset add a a1A3
 i 0th treeset add a a1A4
 i 0th treeset add a a1B0
 i 0th treeset add b b2A5
 i 0th treeset add b b2A4
 i 0th treeset add b b1A4
 i 0th treeset add b b2B0
 i 0th treeset add b b3B5
 i 0th treeset add b b1A1
 i 0th treeset add b b1A0
 i 0th treeset add c c1A0
 i 0th treeset add c c3A0
 i 0th treeset add c c2A0
 i 0th treeset add c c5A0
 i 0th treeset add c c4A0
 i 0th treeset add d d2A7
 i 0th treeset add d d1A6
 i 0th treeset add d d2A6
 i 0th treeset add d d1A4
 i 0th treeset add d d1A2
 i 0th treeset add d d1A3
 i 0th treeset add d d1A0
test: l:[a7A7b3B5c3A0d1A3e5C2f1C4g6B7h4B0] is valid 

Time: 0.254

OK (5 tests)

```
