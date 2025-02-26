import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();
        int sum = 0; 
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}