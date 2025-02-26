import java.util.Scanner;

public class Lab2_1 {
    public static int nod(int a, int b){
        return (b == 0) ? a : nod(b, a % b);
    }
    public static int nok(int a, int b){
        return a * b / nod(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(nok(a,b));
    }
}
