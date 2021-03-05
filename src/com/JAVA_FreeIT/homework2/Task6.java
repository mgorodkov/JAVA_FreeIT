package src.com.JAVA_FreeIT.homework2;
/*Задание 6
        Создайте число. Определите, является ли число трехзначным. Определите, является
        ли его последняя цифра семеркой. Определите, является ли число четным.*/
public class Task6 {
    public static void main(String[] args) {

        //получаем рандомный дабл от >=0.0 до <1.0, сдвигаем 3 разряда умножением на 1e3,
        // отбрасываем дробную часть приведением к целочисленному
        // т.о. получаем неизвестное число в диапазоне от 0 до 999
        int num = (int) (Math.random() * (1000));

        // определяем его трехзначность
        boolean threeDigit = (num > 99);

        // определяем является ли его последняя цифра семеркой
        boolean lastDigit7 = (num % 10 == 7);

        // определяем является ли число четным
        boolean evenNum = (num % 2 == 0);

        //Выводим результат
        System.out.println("Число " + num);
        System.out.println("Трехзначное: " + threeDigit);
        System.out.println("Его последня цифра 7:" + lastDigit7);
        System.out.println("Четное: " + evenNum);

    }

}

