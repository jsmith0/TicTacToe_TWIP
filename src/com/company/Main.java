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
        System.out.println("Now make your move. Enter the number of the position you want. Or ype \"0\" to go second");
        Random rd = new Random();
        String input = kb.next();

        if (input.equals("0")) {
            System.out.println("You will go second");
        }
        else if (input.equals("1")) {
            a = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("2")) {
            b = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("3")) {
            c = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("4")) {
            d = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("5")) {
            e = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("6")) {
            f = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("7")) {
            g = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("8")) {
            h = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }
        else if (input.equals("9")) {
            i = "X";
            System.out.println("\n "+a+" | "+b+" | "+c+"\n---|---|--- \n "+d+" | "+e+" | "+f+"\n---|---|--- \n "+g+" | "+h+" | "+i+"\n");
        }

        int Os = 1 + rd.nextInt(8);


    }
}
