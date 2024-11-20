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
    }
}