package src.com.JAVA_FreeIT.homework2;
/*Задание 15
        Создать массив, заполнить его случайными элементами, распечатать,
        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
        еще один массив).
        */
public class Task15 {
    public static void main(String[] args) {

        int lenght = (int)(Math.random()*25 + 2); //Задаем длинну массива случайным образом от 2 до 26
        System.out.println(lenght + " - lenght"); //выводим длинну массива
        int [] arr = new int[lenght];
        for (int i = 0; i < lenght ; i++) {
            arr[i] = (int) Math.round((Math.random() * 100)); // заполняем значениями и выводим
            System.out.print(arr[i] + " ");
        }
        System.out.println();
// Меняем местами значения массива через перем. temp с краев до серединки. Если идти дальше, то массив поменяется обратно к первоначальному порядку
// Жаль тут рисовать нельзя, картинкой было бы понятнее
        for (int i = 0; i < lenght/2; i++) {
            int temp;
            temp = arr[lenght - 1 - i];
            arr[lenght - 1 - i] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < lenght; i++) {
        System.out.print(arr[i] + " ");}



    }
}
