package lesson_3;

import java.util.Scanner;

public class ThirdHomeTask {
    public static void main(String[] args) {
        GetParityResult();// Задача 1
        GetTempResult();// Задача 2
        GetSquareResult();// Задача 3
        GetSequenceResult();// Задача 4
        GetSumResult();// Задача Дополнительная
    }
    public static void GetParityResult(){
            //Задача 1:
            //Напишите программу, которая будет принимать на вход число из консоли и на выход
            //будет выводить сообщение четное число или нет. Для определения четности числа
            //используйте операцию получения остатка от деления (операция выглядит так: '% 2').
            //CODE
        System.out.println("Задача 1");
        System.out.print("Введите целочисленное число -> ");
        Scanner input= new Scanner(System.in);
        int value=input.nextInt();
        if (value % 2 == 0){
            System.out.println("Число "+value+" является чётным");
        }
        else {
            System.out.println("Число "+value+" является нечётным");
        }
    }

    public static void GetTempResult(){
        //Задача 2:
        //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
        //CODE
        System.out.println("Задача 2");
        System.out.print("Введите температуру на улице -> ");
        Scanner temp= new Scanner(System.in);
        int tempValue=temp.nextInt();
        if (tempValue > -5){
            System.out.println("Warm");
        } else if (tempValue > -20){
            System.out.println("Normal");
        } else{
            System.out.println("Cold");
        }
    }

    public static void GetSquareResult(){
        //Задача 3:
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        //CODE
        System.out.println("Задание 3");
        System.out.println("Квадраты чисел от 10 до 20:");

        for (int value = 10; value <= 20; value++) {
            int squareValue = value * value;
            System.out.println("Квадрат числа "+value + " = " + squareValue);
        }
    }

    public static void GetSequenceResult(){
        //Задача 4:
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
        //CODE
        System.out.println("Результат выполнения программы должен быть:");
        System.out.println("7 14 21 28 35 42 49 56 63 70 77 84 91 98");
        System.out.println("Результат:");
        int firstNumber=7;

        while (firstNumber <= 98){
            System.out.print(firstNumber+" ");
            firstNumber +=7;
        }
    }

    public static void GetSumResult(){
        //Задача *:
        //Напишите программу, где пользователь вводит любое целое положительное число. А
        //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        //ввести некорректные данные.
        //CODE
        System.out.println();
        System.out.println("Задача Дополнительная");
        Scanner input= new Scanner(System.in);
        int number=0;
        boolean validImput=false;
        //Организация проверки, что введено любое целое положительное число
        while (!validImput){
            System.out.print("Введите любое целое положительное число -> ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    validImput = true;
                } else {
                    System.out.println("Ошибка: число должно быть положительным");
                }
            } else {
                    System.out.println("Ошибка: введены некорректные данные. Введите целое " +
                            "положительное число ");
                    input.next();
                }
            }
        //вычисление суммы
        int sum=0;
        for (int startValue=1;startValue <= number;startValue++){
            sum +=startValue;
        }
        System.out.println("---Программа суммирования всех чисел от 1 до введенного пользователем---");
        System.out.println("Результат выполнения= "+sum);
    }
}
