package com.WithoutThread;

import java.util.Random;

public class CVC extends WithoutThread {

    int val;
    boolean player = true;
    boolean checkDraw = false;
    Random r = new Random();
    CVC(){
        table(a);
        while (true) {
            if(player){
                while(true){
                    System.out.println("\nPC1 is playing");
                    val = r.nextInt(9);
                    if(a[val]=='_'){
                        a[val]='X';
                        table(a);
                        break;
                    }else System.out.println("\nIncorrect.PC1 keep trying\n");
                }
            }else{
                while(true){
                    System.out.println("PC2 is playing\n");
                    val = r.nextInt(9);
                    if(a[val]=='_'){
                        a[val]='O';
                        table(a);
                        break;
                    }else System.out.println("\nIncorrect.PC2 keep trying\n");
                }
            }
            player = !player;
            if (check(val)) {
                if (player)
                    System.out.println("\nPC1 win");
                else System.out.println("\nPC2 win");
                break;
            }
            for (char x : a) {
                if (x == '_') {
                    checkDraw = false;
                    break;
                }
                else {
                    checkDraw = true;
                    break;
                }
            }
            if (checkDraw) {
                System.out.println("\nDraw");
                break;
            }
        }
    }
}
