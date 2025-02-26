import java.util.Scanner;

public class Lab1_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int result = 1;
        for(int i = 0; i < n; i++)
        {
            result *= x;
        }
        System.out.println(result);
    }
}
