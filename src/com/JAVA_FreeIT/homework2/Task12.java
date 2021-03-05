package src.com.JAVA_FreeIT.homework2;

/*Задание 12
        Найдите сумму первых n целых чисел, которые делятся на 3.*/

public class Task12 {
    public static void main(String[] args) {

//допустим нам по большому секрету после долгих уговоров и сбора справок сообщили число n:
        int n = (int) (Math.random() * 100);
        int sum = 0;
        int counter =0;
// посчитаем же сумму n целых положительных чисел, которые имеют смелость делиться на 3 без остатка
        for (int i = 1; i <= 1000_000_000; i++) {

            if (i % 3 == 0) {
                sum = sum + i;
                counter++;}
            if (counter == n) break;
        }

        System.out.println("Число n: " + n);
        System.out.println("Искомая сумма: " + sum);
    }
}
