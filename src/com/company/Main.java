package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of entered integers = "+z);
    }
}
