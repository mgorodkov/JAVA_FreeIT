package src.com.JAVA_FreeIT.homework2;

/*Задание 8
        Имеется целове число (задать с помощью Random rand = new Random(); int x =
        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        нему слово «рублей» в правильном падеже.*/

/*Логика решения: 3 падежа:
 - "рубль" для окончания числа на 1, 21, 31, и т.д (исключая 11)
 - "рубля" для окончания числа на 2,3,4, 22,23,23,32,33,34 и тд. (исключая 12,13,14)
 - "рублей" для всех остальный окончаний
*/

import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        // for добавлен для наглядности, что бы заполнить консоль многократным результатом и проверить его

        for (int i = 0; i < 40; i++) {
            Random random = new Random();
            int rub = random.nextInt(1000);
            padej:
            //метка блока для прерывания логики оператором break
            {
                //проверяем на первую группу окончаний
                if (rub % 10 == 1 && rub % 100 != 11) {
                    System.out.println(rub + " рубль");
                    break padej;
                }
                //проверяем на вторую группу окончаний
                if (rub % 10 == 2 && rub % 100 != 12) {
                    System.out.println(rub + " рубля");
                    break padej;
                }
                if (rub % 10 == 3 && rub % 100 != 13) {
                    System.out.println(rub + " рубля");
                    break padej;
                }
                if (rub % 10 == 4 && rub % 100 != 14) {
                    System.out.println(rub + " рубля");
                    break padej;
                }
                //для третьей группы окончаний
                else System.out.println(rub + " рублей");
            }
        }
    }
}
