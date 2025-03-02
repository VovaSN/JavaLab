import java.util.Scanner;

public class Lab2_7 {
    public static int Pow(int x, int n){
        int result = 1;
        for(int i = 1; i <= n; ++i){
            result *= x;
        } return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(Pow(x,n) % m);
    }
}
