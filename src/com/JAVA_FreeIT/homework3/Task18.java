package src.com.JAVA_FreeIT.homework3;

/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
        общее их количество.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {


        String string = "!\"№%:?{}[]\'*(\\),\n" + // произвольные символы
                ". точка,\n" +                  // знаки препинания в Русском языке согласно википедии
                "! восклицательный знак,\n" +
                "? вопросительный знак,\n" +
                "...многоточие,\n" +
                ", запятая,\n" +
                "; точка с запятой,\n" +
                ": двоеточие,\n" +
                "- тире,\n" +
                "\" и ' кавычки.\n";

        getMarksFromList(string);
        getPunktMarks(string);
        getNotCharDigitMarks(string);


    }

    public static void getMarksFromList(String string) {
        int n = 0;
        char[] helloArray = string.toCharArray();
        for (char i : helloArray) {
            if (i == '.' || i == '!' || i == '?' || i == ',' || i == ';' || i == ':' || i == '-' || i == '\"' || i == '\'')
                n++;
        }

        System.out.println("У нас есть " + n + " знаков препинания из заданного списка [.!?,;:-]");
    }


    public static void getPunktMarks(String string) {
        String regex = "\\p{Punct}";
        int n = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            n++;
        }
        System.out.println("У нас есть " + n + " знаков препинания по мнению класса pattern");
    }

    public static void getNotCharDigitMarks(String string) {
        int n = 0;
        Pattern p = Pattern.compile("\\W", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(string);
        while (m.find()) {
            n++;
        }
        System.out.println("У нас есть " + n + " не буквенных и  не числовых знаков, которые могут трактоваться как знаки препинанания");

    }

}
