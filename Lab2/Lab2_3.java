import java.util.Scanner;

public class Lab2_3{
    public static int Fib(int n){
            return n == 0 ? 1 : (n == 1) ? n : Fib(n-1) + Fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Fib(n));
    }
}