import java.util.Scanner;

public class Lab1_8 {
    public static int nod(int a, int b)
    {
        return (b == 0) ? a : nod(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(nod(a,b));
    }
}
