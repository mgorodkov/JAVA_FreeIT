package com.company.homework2;

/*Задание 13
        Создать последовательность случайных чисел, найти и вывести наибольшее
        из них.*/
public class Task13 {
    public static void main(String[] args) {

         int lenght = (int)(Math.random()*100 + 1); //Задаем длинну массива случайным образом от 1 до 100
         int [] arr = new int[lenght];
         int max =0;

        for (int i = 0; i < lenght ; i++) {
            arr[i] = (int)(Math.random()*100 + 1); //Заполняем массив случайными значениями от 1 до 100 и выводим
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < (lenght - 1); i++) {  //Находим максимальное из всех, сравнивая arr[i], arr[i+1], max на максимальное значение.
            if(arr[i] > arr[i+1] && arr[i] > max) {
                max = arr[i];
            } else if (arr[i+1] > max)
            {max = arr[i+1];}
        }
        System.out.println("Массив длинной: " + lenght);
        System.out.println("Наибольшее число массива: " + max);
    }
}
