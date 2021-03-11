package src.com.JAVA_FreeIT.Xogame;

/*
написать игру крестики нолики (двумерный массив размерностью 3х3).
        Для этой задачи сделайте отдельную ветку

        1. Не используя классы и методы - все в методе main
        2. Не используя утильные классы (Arrays и Math)
        3. Игра должна продолжаться до тех пор, пока не будет выявлен победитель (три "О" или три "Х" в ряд или по диагонали) или пока не закончатся свободные клетки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class XOGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Pattern pattern = Pattern.compile("\\d{1}");
        Matcher matcher;
        char[][] arr = {{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};  //игровое поле
        int[][] num = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};  //нумерация ячеек игрового поля
        int moveCounter = 0;
        int cell = 0;  //для ввода номера ячейки куда делать ход
        int row = 0, col = 0; // для доступа в ячейку по индексу
        boolean moveMaker = true; //передача хода



        System.out.println("За нолики ходит скайнет, за крестики человек");
        System.out.println("Что бы сделать ход вводите номер пустой ячейки(принимаются только целые числа  от 1 до 9)");

        gameBody:{while (true) {

// Ход Х
            while (moveMaker) {
                //Вывод
                                for (int i = 0; i < 3; i++) {

                    if (i == 0) System.out.println("Игра:    Нумерация:");

                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.print("   ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(num[i][j] + " ");
                    }
                    System.out.println();
                }
                //Ввод
                do {
                    // ввод и проверка от 1 до 9
                    System.out.println("Крестики, ходите:");
                    matcher = pattern.matcher(scanner.nextLine().trim());
                    if (matcher.matches()) {

                        cell = Integer.parseInt(matcher.group());
                        if (cell < 1 || cell > 9) {
                            System.out.println("Упс! Косяк, нет такой ячейки. Что ж, попробуй еще раз, авось теперича сдюжишь:");
                            System.out.println();
                        }
                    } else System.out.println("Нет нужного числа, вводи еще раз. И без фокусов тут!");


                } while (cell < 1 || cell > 9);
                //Распознавание индекса массива
                switch (cell) {
                    case (1):
                        row = 2;
                        col = 0;
                        break;
                    case (2):
                        row = 2;
                        col = 1;
                        break;
                    case (3):
                        row = 2;
                        col = 2;
                        break;
                    case (4):
                        row = 1;
                        col = 0;
                        break;
                    case (5):
                        row = 1;
                        col = 1;
                        break;
                    case (6):
                        row = 1;
                        col = 2;
                        break;
                    case (7):
                        row = 0;
                        col = 0;
                        break;
                    case (8):
                        row = 0;
                        col = 1;
                        break;
                    case (9):
                        row = 0;
                        col = 2;
                        break;
                }
                //Проверка можно ли сделать ход в ячейку
                if (arr[row][col] != '*') {
                    System.out.println();
                    System.out.println("Нельзя войти в одну реку дважды: ячека уже занята!");
                    System.out.println("Но так и быть, попробуй еще раз, шалунишка.");
                    System.out.println();
                    continue;
                } else {
                    arr[row][col] = 'X';
                    moveCounter++;
                    moveMaker = false;
                }
                //Проверка на победу Х
                if (((arr[0][0] == 'X') && (arr[0][1] == 'X') && (arr[0][2] == 'X')) ||
                        ((arr[1][0] == 'X') && (arr[1][1] == 'X') && (arr[1][2] == 'X')) ||
                        ((arr[2][0] == 'X') && (arr[2][1] == 'X') && (arr[2][2] == 'X')) ||
                        ((arr[0][0] == 'X') && (arr[1][0] == 'X') && (arr[2][0] == 'X')) ||
                        ((arr[0][1] == 'X') && (arr[1][1] == 'X') && (arr[2][1] == 'X')) ||
                        ((arr[0][2] == 'X') && (arr[1][2] == 'X') && (arr[2][2] == 'X')) ||
                        ((arr[0][0] == 'X') && (arr[1][1] == 'X') && (arr[2][2] == 'X')) ||
                        ((arr[0][2] == 'X') && (arr[1][1] == 'X') && (arr[2][0] == 'X'))) {
                    System.out.println("Та-Дам!!!");
                    System.out.println(String.format("Крестики выиграли на %d ходе:", moveCounter));
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Нолики в печали заедают поражение дешевой шоколадкой");
                                        break gameBody;
                }

                //Проверка на ничью. Считаем ходы в moveCounter и если уже 9 ходов и нет победителя - завершаем игру с ничьей
                if (moveCounter == 9) {
                    System.out.println("Никода такого не было, и вот опять:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Ничья, расходимся");
                    break gameBody;
                }
            }
// Ход О
            moveMaker = true;
            while (moveMaker) {
                //Вывод
                    for (int i = 0; i < 3; i++) {
                    if (i == 0) System.out.println("Игра:    Нумерация:");

                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.print("   ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(num[i][j] + " ");
                    }
                    System.out.println();
                }
                //Ввод
                do {
                    // ввод и проверка от 1 до 9
                    System.out.println("Кампуктер скрипя кремниевыми мозгами делает ход:");

                    cell = (random.nextInt(8) + 1); //получаем число от 1 до 9

                } while (cell < 1 || cell > 9);
                //Распознавание индекса массива
                switch (cell) {
                    case (1):
                        row = 2;
                        col = 0;
                        break;
                    case (2):
                        row = 2;
                        col = 1;
                        break;
                    case (3):
                        row = 2;
                        col = 2;
                        break;
                    case (4):
                        row = 1;
                        col = 0;
                        break;
                    case (5):
                        row = 1;
                        col = 1;
                        break;
                    case (6):
                        row = 1;
                        col = 2;
                        break;
                    case (7):
                        row = 0;
                        col = 0;
                        break;
                    case (8):
                        row = 0;
                        col = 1;
                        break;
                    case (9):
                        row = 0;
                        col = 2;
                        break;
                }
                //Проверка можно ли сделать ход в ячейку
                if (arr[row][col] != '*') {
                        continue;
                } else {
                    arr[row][col] = 'O';
                    moveCounter++;
                    moveMaker = false;
                }
                //Проверка на победу O
                if (((arr[0][0] == 'O') && (arr[0][1] == 'O') && (arr[0][2] == 'O')) ||
                        ((arr[1][0] == 'O') && (arr[1][1] == 'O') && (arr[1][2] == 'O')) ||
                        ((arr[2][0] == 'O') && (arr[2][1] == 'O') && (arr[2][2] == 'O')) ||
                        ((arr[0][0] == 'O') && (arr[1][0] == 'O') && (arr[2][0] == 'O')) ||
                        ((arr[0][1] == 'O') && (arr[1][1] == 'O') && (arr[2][1] == 'O')) ||
                        ((arr[0][2] == 'O') && (arr[1][2] == 'O') && (arr[2][2] == 'O')) ||
                        ((arr[0][0] == 'O') && (arr[1][1] == 'O') && (arr[2][2] == 'O')) ||
                        ((arr[0][2] == 'O') && (arr[1][1] == 'O') && (arr[2][0] == 'O'))) {
                    System.out.println("У-ХА-ХА-ХА!!!");
                    System.out.println("Нолики победили:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Крестики с с досадой утирают сопли");
                    break gameBody;
                }

                //Проверка на ничью. Считаем ходы в moveCounter и если уже 9 ходов и нет победителя - завершаем игру с ничьей
                if (moveCounter == 9) {
                   System.out.println("Никода такого не было, и вот опять:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Ничья, расходимся");
                    break gameBody;
                }

            }
            moveMaker = true;
        }
    }
        System.out.println("Игра окончена, работать пора");
    }

}

