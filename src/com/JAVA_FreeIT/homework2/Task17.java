package src.com.JAVA_FreeIT.homework2;
/*
Задание 17
        Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
        таким образом:
        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1

*/

public class Task17 {

    public static void main(String[] args) {
        int [][] arr = new int[7][7];

        //Заполняем массив
        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i)))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }

        //Выводим массив
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr [i].length; j++) {
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }

    }
}
