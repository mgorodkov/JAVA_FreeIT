package src.com.JAVA_FreeIT.homework2;

/*Задание 10
        Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/
public class Task10 {

    public static void main(String[] args) {

            long faktorial = 1;
            int n = 1;
            double temp = Math.random();
            System.out.println("random: " + temp);

            int x = (int) (10 + temp * 6);
            while (n <= x) {
                faktorial = faktorial * n;
                n++;
            }

            System.out.println("Число: " + x);
            System.out.println("Фаториал: " + faktorial);
        }
}
