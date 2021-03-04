package com.company.homework2;

public class Teststasks {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            double input1 = Math.random();
            System.out.print("Math.random()=" + input1);
            double input2 = input1*999;
            System.out.print(" Math.random()*999=" + input2);
            double input3 = input1*(999+1);
            System.out.print(" Math.random()*(999+1)=" + input3);
            int input4 = (int)input3;
            System.out.print(" (int)Math.random()*(999+1)=" + input4);
            int input5 = input4 + 1;
            System.out.print(" (int) (Math.random() * (999 + 1)) + 1=" + input5);
            System.out.println();
//            int input = (int) (Math.random() * (999 + 1)) + 1;
        }
    }
}
