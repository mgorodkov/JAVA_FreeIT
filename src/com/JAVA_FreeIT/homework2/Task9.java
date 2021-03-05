package src.com.JAVA_FreeIT.homework2;

/*          Задание 9
            Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
            произведение, т.е. факториал числа.*/

public class Task9 {
    public static void main(String[] args) {


        long faktorial = 1;
        int n = 1;
        int x = (int) (Math.random() * 20);
        while (n <= x) {
            faktorial = faktorial * n;
            n++;
        }
        System.out.println("Число: " + x);
        System.out.println("Фаториал: " + faktorial);
    }

}


