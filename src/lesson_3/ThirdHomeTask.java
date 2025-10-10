package lesson_3;

import java.util.Scanner;

public class ThirdHomeTask {
    public static void main(String[] args) {
        GetParityResult();// Задача 1
        GetTempResults();// Задача 2
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

    public static void GetTempResults(){
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
}
