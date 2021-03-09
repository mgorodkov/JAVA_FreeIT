package src.com.JAVA_FreeIT.homework3;

public class Task23 {

/*
    Задание 23
    Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
    которых есть параметры, например <p id=”p1”>, и замену их на простые теги
    абзацев <p>.
*/

    public static void main(String[] args) {

        String string ="<p>11asdfsd</p> 22jasldfj;sldfjl<p id=”p1”> 33asdfasdfasdfasd </p> 44sdafsadf <p id=”p2”> 55gfjhjdfgn</p> end.";
        String regex ="\\<p.*?>";

        System.out.println("Исходная строка: " + string);
        System.out.println("Итоговая строка: " + string.replaceAll(regex,"<p>"));

    }
}
