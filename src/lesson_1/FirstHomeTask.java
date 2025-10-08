package lesson_1;

public class FirstHomeTask {
    public static void main(String[] args){
        GetCalculationResult();// Задание 1
        GetDigitsSum();// Задание 2
        GetDigitSumThree();// Задание 3
        GetRound();// Задание 4
        GetDivisionResult();// Задание 5
        GetSwitchResult();// Дополнительное задание
    }

    public static void GetCalculationResult(){
        //Задача 1:
        // Написать приложение, которое будет вычислять и выводить значение по формуле:
        // a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
        //CODE
        int b=7;
        int c=2;
        double a=4*(b+c-1)/2;
        System.out.println("Задание 1");
        System.out.println("При b="+b+" и c="+c);
        System.out.println("Значение a=4*(b+c-1)/2="+a);
    }

    public static void GetDigitsSum(){
        //Задача 2:
        // В переменной n хранится двузначное число. Создайте программу, вычисляющую и
        // выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8 (2+6).
        //CODE
        int n=69;
        int FirstDigit=n/10;
        int SecondDigit=n%10;
        int DigitSum=FirstDigit+SecondDigit;
        System.out.println("Задание 2");
        System.out.println("Если n="+n+" ,то сумма цифр числа n="+DigitSum);
    }

    public static void GetDigitSumThree(){
        //Задача 3:
        // В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
        // выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить 9 (1+2+6).
        //CODE
        int n=334;
        int GetHundred=n/100;
        int GetTen=(n%100)/10;
        int GetUnit=n%10;
        int DigitSum=GetHundred+GetTen+GetUnit;
        System.out.println("Задание 3");
        System.out.println("Если n="+n+" ,то сумма цифр числа n="+DigitSum);
    }

    public static void GetRound(){
        //Задача 4:
        // В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
        // программу, округляющую число n до ближайшего целого и выводящую результат на экран.
        //CODE
        double n = 8.5;
        long rounded = Math.round(n);
        System.out.println("Задание 4");
        System.out.println("Значение переменной n=" + n);
        System.out.println("Тогда округленное значение для n будет=" + rounded);
    }

    public static void GetDivisionResult(){
        //Задача 5:
        // В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
        // на экран результат деления q на w с остатком. Пример вывода программы (для случая,
        // когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
        //CODE
        int q=6;
        int w=5;
        int GetDivResult=q/w;
        int GetRemainder=q%w;
        //вывод результата
        System.out.println("Задание 5");
        System.out.println("Если q="+q+" и w="+w+" то q/w="+GetDivResult+" и "+GetDivResult+" в остатке");
    }

    public static void GetSwitchResult(){
        //Задача *:
        // Написать программу которая будет менять местами значение целочисленных переменных.
        // Пример: int a = 1; int b = 2;
        // /код (ваше решение)
        // sout(a); //выведет 2
        // sout(b); //выведет 1
        // Усовершенствовать программу, использовать только 2 входные переменные (a,b);
        //CODE
        int a=128;
        int b=1;
        System.out.println("Задание Дополнительное");
        System.out.println("Первоначальные значения переменных a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Измененные значения переменных a="+a+" b="+b);
    }
}