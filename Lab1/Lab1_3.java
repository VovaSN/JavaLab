import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int factorial = 1;
        for(int i = 2; i <= number; i++)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
