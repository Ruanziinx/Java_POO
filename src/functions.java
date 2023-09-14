import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        int higher = max(a, b, c, d);

        showResult(higher);
    }

    public static int max(int x, int y, int z, int p){
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z && y > p) {
            aux = y;
        }else aux = Math.max(z, p);
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Higher = " +  value);
    }
}
