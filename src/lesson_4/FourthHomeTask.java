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

        //System.out.println("\n=== РЕЗУЛЬТАТЫ ==="); // Выполняем все задачи
        //task1(array); // Задача 1: Прямой и обратный порядок
        //task2(array); // Задача 2: Минимальный и максимальный элементы
        //task3(array); // Задача 3: Индексы минимального и максимального элементов
        //task4(array); // Задача 4: Количество нулевых элементов
        //task5(array); // Задача 5: Поменять местами элементы
        //task6(array); // Задача 6: Проверить на возрастающую последовательность
        //scanner.close();
        //}
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
}
