package com.WithoutThread;

public class PVP extends WithoutThread {
    int val;
    boolean player = true;
    boolean checkDraw = false;

    PVP(){
        table(a);
        while (true) {
            player = !player;
            val = scanner();

            if (player) {
                a[val] = 'X';
            } else a[val] = 'O';
            table(a);
            if (check(val)) {
                if (player)
                    System.out.println("player 1 win");
                else System.out.println("player 2 win");
                break;
            }
            for (char x : a) {
                if (x == '_') checkDraw = false;
                else checkDraw = true;
            }
            if (checkDraw) {
                System.out.println("Draw");
                break;
            }
        }
    }


}
