import java.util.Scanner;
public class dopolnitelnoe {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число месяца.");
        int x = console.nextInt();
        if (x<1 | x>12) {
            System.out.println("Введите число месяца от 1 до 12.");
        }
        if (x == 1 | x == 2 | x == 12) {
            System.out.println("Зима!");
        }
        if (x == 3 | x == 4 | x == 5) {
            System.out.println("Весна!");
        }
        if (x == 6 | x == 7 | x == 8) {
            System.out.println("Лето!");
        }
        if (x == 9 | x == 10 | x == 11) {
            System.out.println("Осень!");
        }
    }
}

