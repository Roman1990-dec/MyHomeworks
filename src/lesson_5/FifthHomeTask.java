package lesson_5;

import java.util.Scanner;

public class FifthHomeTask {
    public static void main(String[] args){
        System.out.println("\n--- Задача 1: Работа двумерным массивом ---");
        NumberSum();
        System.out.println("\n--- Задача 2: Шахматная доска ---");
        ChessBoard();
    }
    public static void NumberSum(){
        Scanner scanner= new Scanner(System.in);
        int rows=4;
        int colums=4;
        int[][] array=new int[rows][colums];
        System.out.println("Заполняем массив случайными числами от 1 до 100:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                array[i][j] = (int)(Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\nВведите число, которое нужно добавить к каждому элементу: ");
        int userValue = scanner.nextInt();
        System.out.println("Массив после добавления " + userValue + ":");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                array[i][j] += userValue;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("\nСумма всех элементов: " + sum);

    }

    public static void ChessBoard(){
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

}
