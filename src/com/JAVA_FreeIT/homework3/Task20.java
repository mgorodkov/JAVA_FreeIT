package src.com.JAVA_FreeIT.homework3;

/*Задание 20
        Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/

public class Task20 {

    public static void main(String[] args) {
        String string = "      Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.  ";
        string = string.trim();
        String[] words = string.split("[\\s,.:!?-]+");
        String result = "";
        for (String word : words)
            result += String.valueOf(word.charAt(word.length() - 1));


        System.out.println(result);

    }
}
