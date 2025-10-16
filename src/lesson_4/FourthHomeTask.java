package lesson_4;

import java.util.Scanner;

public class FourthHomeTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (простое целое число): ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Выберете способ заполнения массива: ");
        System.out.println("1 - автоматически (Math.random())");
        System.out.println("2 - вручную");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

      if (choice == 1) {
           fillArrayRandom(array);
           System.out.println("Массив заполнен автоматически:");
        } else {
           fillArrayManual(array, scanner);
           System.out.println("Массив заполнен вручную:");
        }
        printArray(array);

        System.out.println("\n=== РЕЗУЛЬТАТЫ ===");
        taskOne(array);
        taskTwo(array);
        taskThree(array);
        taskFour(array);
        taskFive(array);
        taskSix(array);
        scanner.close();
    }

    //Метод для автоматического заполнения массива случайными числами
    public static void fillArrayRandom(int[] array){
        for (int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*100);
        }
    }

    //Метод для заполнения массива ручным способом
    public static void fillArrayManual(int[] array, Scanner scanner){
        System.out.println("Введите элементы массива");
        for (int i=0;i<array.length;i++){
            System.out.print("Элемент "+i+": ");
            array[i] = scanner.nextInt();
        }
    }

    //Метод для вывода массива на экран
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    //Задача 1: Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void taskOne(int[] array){
        System.out.println("\n--- Задача 1: Прямой и обратный порядок ---");
        System.out.print("Прямой порядок: ");

        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Обратный порядок: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Задача 2: Найти минимальный-максимальный элементы и вывести в консоль.
    public static void taskTwo(int[] array){
        System.out.println("\n--- Задача 2: Минимальный и максимальный элементы ---");
        int min = array[0];
        int max = array[0];

        for (int i=0;i< array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    //Задача 3: Найти индексы минимального и максимального элементов и вывести в консоль.
    public static void taskThree(int[] array){
        System.out.println("\n--- Задача 3: Индексы минимального и максимального элементов ---");

        int minIndex=0;
        int maxIndex=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }

    //Задача 4: Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    //сообщение, что их нет.
    public static void taskFour(int[] array){
        System.out.println("\n--- Задача 4: Количество нулевых элементов ---");

        int zeroCount=0;
        for (int i=0;i< array.length;i++){
            if (array[i]==0){
                zeroCount++;
            }
        }
        if (zeroCount==0){
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        }
    }

    //Задача 5: Пройти по массиву и поменять местами элементы первый и последний, второй и
    //предпоследний и т.д.
    public static void taskFive(int[] array){
        System.out.println("\n--- Задача 5: Зеркальная перестановка ---");
        System.out.print("Исходный массив: ");
        printArray(array);

        for (int i=0;i< array.length/2;i++){
            int variable=array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = variable;
        }
        System.out.print("Массив после перестановки: ");
        printArray(array);
    }

    //Задача 6: Проверить, является ли массив возрастающей последовательностью (каждое следующее
    //число больше предыдущего)
    public static void taskSix(int[] array){
        System.out.println("\n--- Задача 6: Проверка на возрастающую последовательность ---");
        if (array.length<=1){ //если пустой или один элемент, то считаем возрастающим
            System.out.println("Массив является возрастающей последовательностью");
            return;
        }
        boolean isIncreasing=true;
        for (int i=1;i<array.length;i++){
            if (array[i]<=array[i-1]){
                isIncreasing=false;
                break;
            }
        }
        if (isIncreasing){
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является возрастающей последовательностью");
        }
    }

}
