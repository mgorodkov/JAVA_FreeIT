package src.com.JAVA_FreeIT.homework3;

/*Задание 21
        Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
всех слов.*/

public class Task21 {

    public static void main(String[] args) {



        long startTime = System.nanoTime();
        String string = "";
        for (int i = 0; i < 100_000; i++) string += i;
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("string  " + elapsedNanos);

        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) builder.append(i);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("builder " + elapsedNanos);

        startTime = System.nanoTime();
        StringBuffer buffer= new StringBuffer();
        for (int i = 0; i < 100_000; i++) buffer.append(i);
        elapsedNanos = System.nanoTime() - startTime;
        System.out.println("buffer  " + elapsedNanos);




    }
}
