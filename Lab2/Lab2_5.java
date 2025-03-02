import java.util.Scanner;

public class Lab2_5 {

    public static int minSumNumber(int[] numbers){
        int minSum = 99999999;
        int minNumber = numbers[0];
        for(int i = 0; i < numbers.length; ++i){
            if(minSum >= NumberSum(numbers[i])){ 
                minSum = NumberSum(numbers[i]);
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }

    public static int NumberSum(int number){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        } 
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i < n; ++i) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(minSumNumber(numbers));
        sc.close();
    }
}
