import java.util.Random;
import java.util.Scanner;

class A implements ArrayInterface {

    private static Random random_obj = new Random();
    private static Scanner scanner_obj = new Scanner(System.in);
    private int[] m;

    public A() {
        this.m = new int[15];
    }

    public void method_one() {
        int a = scanner_obj.nextInt();
        int b = scanner_obj.nextInt();

        for (int i=0; i<15; i++) {
            int random_num = random_obj.nextInt(b-a) + a;
            m[i] = random_num;
        }
    }

    public int method_two() {
        int sum = 0;

        for (int i=0; i<15; i++) {
            if (m[i] < i) sum = sum + m[i];
        }

        return sum;
    }

    public int method_three() {
        int product = 1;

        for (int i=0; i<15; i++) {
            if (m[i] > i) product = product * i;
        }

        return product;
    }

    public void print_evens() {
        for (int i=0; i<15; i++) {
            if (m[i] % 2 == 0) System.out.println(m[i]);
        }
    }

}