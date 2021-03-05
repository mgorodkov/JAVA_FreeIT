package src.com.JAVA_FreeIT.homework2;

/*
Задание 14
        Создать массив оценок произвольной длины, вывести максимальную и
        минимальную оценку, её (их) номера.

*/

public class Task14 {

    public static void main(String[] args) {
        int [] arr = new int[15];
        int max =0;
        int maxItem = 0;
        int min =10;
        int minItem = 0;


        for (int i = 0; i < 15 ; i++) {
        arr[i] = (int) Math.round((Math.random() * 10)); // заполняем значениями от 0 до 10 и выводим
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < (14); i++) {  //Находим максимальное из всех, сравнивая arr[i], arr[i+1], max на максимальное значение.
            if(arr[i] > arr[i+1] && arr[i] > max) {
                max = arr[i];
                maxItem = i;
            } else if (arr[i+1] > max)
            {max = arr[i+1];
            maxItem = i+1;}
        }
        System.out.println("Номер наибольшго элемента: " + maxItem);
        System.out.println("Наибольшее число массива: " + max);

        for (int i = 0; i < (14); i++) {  //Находим минимальное из всех, сравнивая arr[i], arr[i+1], min на минимальное значение.
            if(arr[i] < arr[i+1] && arr[i] < min) {
                min = arr[i];
                minItem = i;
            } else if (arr[i+1] < min)
            {min = arr[i+1];
                minItem = i+1;}
        }
        System.out.println("Номер нименьшего элемента: " + minItem);
        System.out.println("Наименьшее число массива: " + min);
    }
}
