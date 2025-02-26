import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close(); 
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
         }
        System.out.println(count);
    }
}
