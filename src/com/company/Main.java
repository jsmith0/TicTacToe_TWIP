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
                System.out.println("Did you win, lose, or neither? Enter \"w\" or \"l\" or \"n\"");
                String yn = kb.next();
                if (yn.equalsIgnoreCase("w")){
                    System.out.println("CONGRADULATIONS!!!!! You won!");
                    break outerloop;
                }
                else if (yn.equalsIgnoreCase("l")){
                    System.out.println("You lost. Would you like to try again? Enter \"y\" or \"n\"");
                    String qwerty = kb.next();
                    count = 0;
                    if (qwerty.equalsIgnoreCase("y")){
                         a = "1";
                         b = "2";
                         c = "3";
                         d = "4";
                         e = "5";
                         f = "6";
                         g = "7";
                         h = "8";
                         i = "9";
                        System.out.println("\n " + a + " | " + b + " | " + c + "\n---|---|--- \n " + d + " | " + e + " | " + f + "\n---|---|--- \n " + g + " | " + h + " | " + i + "\n");
                    }
                    if (qwerty.equalsIgnoreCase("n")){
                        System.out.println("Then we are done here.");
                    }
                    break;
                }
                else if (yn.equalsIgnoreCase("n")){
                    System.out.println("Then lets keep playing.");
                    break;
                }
                else{
                }
            }
        }
    }
}
