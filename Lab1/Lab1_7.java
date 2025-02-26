import java.util.Scanner;

public class Lab1_7 {
    public static int Factorial(int n)
    {
        return n<= 0 ? 1 : n * Factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt();
        sc.close();
         int result = Factorial(n) / (Factorial(n-k) * Factorial(k));
        System.out.println(result);
    }
}
