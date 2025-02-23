public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Все целые числа по возрастанию " + i);
        }
        System.out.println("Задача 2");
        for (int o = 10; o > 0; o--) {
            System.out.println("Все целые числа по убыванию " + o);
        }
        System.out.println("Задача 3");
        for (int t = 0; t < 17; t = t + 2) {
            System.out.println("Четные числа " + t);
        }
        System.out.println("Задача 4");
        for (int y = 10; y >= -11; y--) {
            System.out.println("Числа от 10 до -10 " + y);
        }
        System.out.println("Задача 5");
        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println("Все високосные года " + e);
        }
        System.out.println("Задание 6");
        for (int v = 7; v <= 98; v = v + 7) {
            System.out.println("Последовательность чисел " + v);
        }
        System.out.println("Задание 7");
        for (int n = 1; n <= 512; n = n * 2) {
            System.out.println("Последовательность чисел " + n);
        }
        System.out.println("Задание 8");
        int payday =  29000;
        int allCash = 0;
        for ( int m = 1; m <= 12; m++) {
            allCash = allCash+payday;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + allCash + " рублей");
        }
        System.out.println("Задача 9");
        int cash = 29000;
        int total = 0;
        for (int k = 1; k <=12; k++) {
            total = total + total/100;
            total = cash+total;
            System.out.println("Месяц " + k + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 10");
        for ( int g = 2; g <= 20; g = g+g*1) {
            System.out.println("Таблица умножения на 2 " + g);
        }
    }
}
