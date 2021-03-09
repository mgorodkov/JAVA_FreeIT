package src.com.JAVA_FreeIT.homework3;

/*Задание 19
        Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
        текста также могут быть пробелы, но могут и отсутствовать.*/

public class Task19 {

    public static void main(String[] args) {
        String string = "      Имеется строка с текстом. Подсчитать   количество слов в тексте  ";
        string = string.trim();
        String[] words = string.split("[\\s,.:!?-]+");
        int n = 0;
        for(String word :words)
            if (word.length() == 1) n++;
        System.out.println("В предложении " + words.length + " слов, среди них предлогов " + n + " шт.");

    }
}
