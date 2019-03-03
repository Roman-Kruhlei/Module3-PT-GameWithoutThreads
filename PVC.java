package com.WithoutThread;

import java.util.Random;

public class PVC extends WithoutThread {

        int val;
        boolean player = true;
        boolean checkDraw = false;
        Random r = new Random();
        PVC(){
            table(a);
            while (true) {
                if(player){
                    val = scanner();
                    a[val] = 'X';
                    table(a);
                }else{
                    while(true){
                        System.out.println("PC is playing");
                        val = r.nextInt(9);
                        if(a[val]=='_'){
                            a[val]='O';
                            table(a);
                            break;
                        }else System.out.println("\nIncorrect.PC keep trying\n");
                    }


                }
                player = !player;
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


