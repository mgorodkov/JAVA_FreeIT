package com.company.homework2;

/*
Задание 11
        Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.
*/


import java.util.Random;

public class Task11 {
    public static void main(String[] args) {


        int num = (int) (Math.random() * 100);
        //Всякое целое число делится без остатка на 1 и на себя.
        //Надо проверить, будет ли появлятся остаток  от деления этого числа num на делители от 2 до num-1 включительно
        //Буде такой остаток материализуется, в признании num простым велено отказать:)
        int counter = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter > 0) System.out.println("число " + num + " НЕ простое");
        else System.out.println("число " + num + " простое");

    }


}
