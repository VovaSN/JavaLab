import java.util.Scanner;

public class Lab2_4 {
    public static int grad(int n){
        int maxValue = n;
       while(n != 1){
        if(n > maxValue)
        maxValue = n;
        if(n % 2 == 0)
            n /= 2;
        else
            n = n * 3 + 1;
       } 
       return maxValue;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i < t; i++){
            System.out.print(i+1 + " ");
            int n = sc.nextInt();
            System.out.println(i+1 + " " + grad(n));
        } 
        sc.close();
    }
}
