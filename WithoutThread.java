package com.WithoutThread;

import java.util.Scanner;

public class WithoutThread {

    static Scanner scanner = new Scanner(System.in);
    static char[] a = { '_','_','_',
            '_','_','_',
            '_','_','_'  };

    public static void main(String[] args) {

        System.out.println("Game is starting\n1 player - O\n2 player - X");
        int val;
        boolean player = false;
        boolean checkDraw = false;
        System.out.println("Choose option:\n1) Player/player\n2) player/computer\n3) computer/computer");
        int swit = 0;

        swit = scanner.nextInt();

        switch(swit){
            case 1:
                new PVP();
                break;
            case 2:
                new PVC();
                break;
            case 3:
                new CVC();
                break;
        }

    }
    public static void table(char[]a){
        for(int x = 0;x<9;x++){
            for (int y = 0;y<2;y++,x++){
                System.out.print(a[x]+" ");
            }
            System.out.println(a[x]);
        }
    }

    public static int scanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter position");
        int val = sc.nextInt();
        if(val>8||val<0){
            System.out.println("Incorrect input. Repeat please.");
            return scanner();
        }else
            return val;

    }

    public static boolean check(int in){
        int row = in-in%3;
        if (a[row]==a[row+1] &&
                a[row]==a[row+2]) return true;
        int column = in%3;
        if (a[column]==a[column+3])
            if (a[column]==a[column+6]) return true;
        if (in%2!=0) return false;
        if (in%4==0){
            if (a[0] == a[4] &&
                    a[0] == a[8]) return true;
            if (in!=4) return false;
        }
        return a[2] == a[4] &&
                a[2] == a[6];
    }
}


