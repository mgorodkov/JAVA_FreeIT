package src.com.JAVA_FreeIT.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.security.spec.RSAKeyGenParameterSpec.F0;

/*Задание 22
        Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
        записаных по правилам Java, с помощью регулярных выражений и вывести их на
        страницу.*/
public class Task22 {
    public static void main(String[] args) {
        String string = "asdf 0x7FFFпарапр 0X7AAF 0x5A3 3x4645";


        Pattern pattern = Pattern.compile("0[xX][A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
