package src.com.JAVA_FreeIT.homework2;

/*Задание 7
        Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
        полностью закрыть круглой картонкой радиусом r.*/

public class Task7 {
    public static void main(String[] args) {
        /* гипотенуза треуголька со сторонами a b равна 2r, квадрат гипотенузы равен сумме квадратов катетов:
         2r*2r=a*a + b*b
         следовательно что бы круглая картонка закрыла прямоигольник со сторонами a b ее радиус должен быть >=r/2 */

        // задаем стороны прямоугольника двузначными, +1 добавляем что бы избежать нулевого значения
        int a = (int) (Math.random() * (100) + 1);
        int b = (int) (Math.random() * (100) + 1);
        double r = Math.sqrt(a * a + b * b) / 2;

        System.out.println("Для прямоугольника со сторонами " + a + " и " + b);
        System.out.println("Минимальный радиус круглой картонки = " + r);

    }
}
