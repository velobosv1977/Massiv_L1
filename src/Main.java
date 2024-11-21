import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Massive. Lesson 1");
        int[] box = {3, 6, 7,};
        System.out.println(box[0]);
        System.out.println("");
        // Создаём массив на 12 ячеек
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        // Запуск цикла по выводу массива
        for (int i = 0; i < 12; i++) {
            System.out.println(weights[i]);
        }
        System.out.println("");
        int[] houses = new int[7];
        houses[0] = 5;
        houses[1] = 7;
        houses[6] = 10;
        System.out.println(houses[0]);
        System.out.println(houses[1]);
        System.out.println(houses[6]);
        System.out.println("");
        //создадим массив arr с переменными типа int из 10 ячеек (массив длинной 10 ячеек):
        int[] arr = new int[10];
        //положим в ячеку 0 значение 5:
        arr[0] = 5;
        //можно пложить в массив значение из ранее созданной переменной (типы переменной и массива должны совпадать!):
        //задали перменную i=7:
        int i = 7;
        //положили пременную i в ячейку 1 масива arr:
        arr[1] = i;
        //извлечение данных из массива:
        //положим в ячейку 5 значение 10:
        arr[5] = 10;
        //присвоим переменной k значение из 5-й ячейки массива arr:
        int k = arr[5];
        //вывод значения из 5-й ячейки:
        System.out.println("Значение 5-й ячейки массива arr равно " + k);
        //Определение размера массива:
        int arrSize = arr.length;
        //Важно: значение arr.length всегда будет иметь индекс последнего элемента + 1. Т. е. последний элемент лежит по индексу в ячейке 9, а length хранит в себе 10.
        arr[9] = 123;
        arr[8] = 756;
        //Доступ к последней ячейке, в котором определяется длина массива:
        int l = arr[arr.length - 1];
        System.out.println("Значение последней ячейки массива arr равно " + l);
        //можно сразу заполнять массив данными, причём размер массива можно не указывать:
        int[] arr2 = {5, 6, 7};
        //массивы удобно заполнять циклами (ранее был создан массив arr мз 10 ячеек):
        for (int index = 0; index < arr.length; index++) {
            if (index==arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " ; ");
        }
        //Если формат вывода элементов массива непринципиален, удобнее воспользоваться методом Arrays.toString. С его помощью мы печатаем массив без дополнительного написания циклов.
        int[]arr3=new int[10];
        System.out.println(Arrays.toString(arr3));
        arr[11]=1;



    }
}