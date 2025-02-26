import java.util.Scanner;

public class Lab1_4 {
    public static int f(int m, int n)
    {
        if(m == 0 || m == n)
        {
            return 1;
        }
        return f(m-1,n-1) + f(m,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        sc.close();
        System.out.println(f(m,n));
    }
}
