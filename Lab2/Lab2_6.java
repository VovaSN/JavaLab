import java.util.Scanner;
public class Lab2_6 {
    public static int NumberSum(int number){
        int sum = 0;
        while(number > 0)
        {
            sum += number % 10;
            number /= 10;
        } return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int minSum = 99999, count = 0;
        for(int i = m; i <= n; ++i){
            if(minSum >= NumberSum(i)){
                minSum = NumberSum(i);
                if(minSum == NumberSum(i))
                ++count;
            }
        }
        System.out.println(count);
    }
}
