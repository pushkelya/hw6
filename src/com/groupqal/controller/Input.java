package com.groupqal.controller;

import java.util.Scanner;

public class Input {
   private static Scanner sc = new Scanner(System.in);

    public static String inputStr() {
        return sc.nextLine();
    }

   public static int input(){
        return sc.nextInt();
    }
}
