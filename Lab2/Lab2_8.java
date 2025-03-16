import java.util.Scanner;

public class Lab2_8 {
    public static long nod(long a, long b){
        return (b == 0) ? a : nod(b, a % b);
    }
    public static long nok(long a, long b){
        return a * b / nod(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long result = 1;
        for(int i = 2; i <= n; ++i){
            result = nok(result,i);
        }
        System.out.println(result);
    }
}
