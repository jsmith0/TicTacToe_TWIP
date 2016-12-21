package com.company;

 import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's play a game of tic tac toe. Pick the number in the spot you want to go in.");
        Scanner kb = new Scanner(System.in);

        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";
        String e = "5";
        String f = "6";
        String g = "7";
        String h = "8";
        String i = "9";
        String board = "\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n";
        System.out.println(board);
        System.out.println("Enter the number of the position you want. Or type \"0\" to go second");



        int count = 0;
        outerloop:
        while  (true) {

            count++;
            if (count > 5){
                System.out.println("It seems to be a draw.");
                break;
            }
            System.out.println("Now make your move.");
            String input = kb.next();
            if (input.equals("0")) {
                System.out.println("You will go second");
            } else if (input.equals("1")) {
                a = "X";
            } else if (input.equals("2")) {
                b = "X";
            } else if (input.equals("3")) {
                c = "X";
            } else if (input.equals("4")) {
                d = "X";
            } else if (input.equals("5")) {
                e = "X";
            } else if (input.equals("6")) {
                f = "X";
            } else if (input.equals("7")) {
                g = "X";
            } else if (input.equals("8")) {
                h = "X";
            } else if (input.equals("9")) {
                i = "X";
            }

            while(true) {
                Random rd = new Random();
                int Os = 1 + rd.nextInt(8);
                if (Os == 1 && !(a.equals("X"))) {
                    a = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 1 && (a.equals("X")) || a.equals("O")) {
                }
                if (Os == 2 && !(b.equals("X"))) {
                    b = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 2 && (b.equals("X")) || a.equals("O")) {
                }
                if (Os == 3 && !(c.equals("X"))) {
                    c = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 3 && !(c.equals("X")) || a.equals("O")) {
                }
                if (Os == 4 && !(d.equals("X"))) {
                    d = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 4 && (d.equals("X")) || a.equals("O")) {
                }
                if (Os == 5 && (e.equals("X"))) {
                    e = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 5 && (e.equals("X")) || a.equals("O")) {
                }
                if (Os == 6 && !(f.equals("X"))) {
                    f = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 6 && (f.equals("X")) || a.equals("O")) {
                }
                if (Os == 7 && !(g.equals("X"))) {
                    g = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 7 && (g.equals("X")) || a.equals("O")) {
                }
                if (Os == 8 && !(h.equals("X"))) {
                    h = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 8 && (h.equals("X")) || a.equals("O")) {
                }
                if (Os == 9 && !(i.equals("X"))) {
                    i = "O";
                    System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    break;
                }
                if (Os == 9 && (i.equals("X")) || a.equals("O")) {
                }
            }
            while(count >=3){
                System.out.println("Did you win, lose, or neither? Enter \"y\" or \"n\" or \"g\"");
                String yn = kb.next();
                if (yn.equalsIgnoreCase("y")){
                    break outerloop;
                }
                else if (yn.equalsIgnoreCase("n")){
                    break;
                }
                else if (yn.equalsIgnoreCase("g")){
                    break;
                }
                else{
                }
            }
        }
    }
}
