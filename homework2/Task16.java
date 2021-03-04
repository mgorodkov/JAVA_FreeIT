package com.company.homework2;
/*
Задание 16
        Определите сумму элементов одномерного массива, расположенных между
        минимальным и максимальным значениями.
*/

public class Task16 {
    public static void main(String[] args) {

        //Материализуем массив, ВЖУХ:
        int lenght = (int)(Math.random()*20 + 7); //Задаем длинну массива случайным образом от 7 до 26
        System.out.println(lenght + " - lenght"); //выводим длинну массива
        int [] arr = new int[lenght];
        for (int i = 0; i < lenght ; i++) {
            arr[i] = (int) Math.round((Math.random() * 100)); // заполняем значениями от 0 до 99 и выводим
            System.out.print(arr[i] + " ");
        }
        System.out.println();


//Находим индекс максимального значения, сравнивая arr[i], arr[i+1], max на максимальное значение.
        int max =0;
        int maxItem = 0;
        for (int i = 0; i < lenght -1; i++) {
            if(arr[i] > arr[i+1] && arr[i] > max) {
                max = arr[i];
                maxItem = i;
            } else if (arr[i+1] > max)
            {max = arr[i+1];
                maxItem = i+1;}
        }
        System.out.println("max " + max + " Индекс " + maxItem);

//Находим индекс минимального значения из всех, сравнивая arr[i], arr[i+1], min на минимальное значение.
        int min = max;
        int minItem = 0;
        for (int i = 0; i < lenght -1; i++) {
            if (arr[i] < arr[i + 1] && arr[i] < min) {
                min = arr[i];
                minItem = i;
            } else if (arr[i + 1] < min) {
                min = arr[i + 1];
                minItem = i + 1;
            }
        }
        System.out.println("min " + min + " Индекс " + minItem);

        //ищем сумму между min и max значениями, не включая их самих
        int sum = 0;

        if (minItem < maxItem){  //если сначала идет минимально значение, доходим от него до максимального
            for (int i = (minItem +1); i < maxItem; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Сумма между min и max, не включая их = " + sum);

        } else { //если сначала идет максималльное значение, доходим от него до минимального
            for (int i = (maxItem+1); i < minItem; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Сумма между min и max, не включая их = " + sum);
        }



    }


}
