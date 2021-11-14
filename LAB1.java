import java.util.Scanner;
public class LAB1 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 5 чисел.");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int d = console.nextInt();
        int e = console.nextInt();
        int max = a;
        int min = a;
        if (b>=max) {
            max = b;
        }
        if (c>=max) {
            max = c;
        }
        if (d>=max) {
            max = d;
        }
        if (e>=max) {
            max = e;
        }
        if (b<=min) {
            min = b;
        }
        if (c<=min) {
            min = c;
        }
        if (d<=min) {
            min = d;
        }
        if (e<=min) {
            min = e;
        }
        System.out.println("Наибольшее из данных чисел =" + " "+max);
        System.out.println("Наименьшее из данных чисел =" + " "+min);

    }
}
