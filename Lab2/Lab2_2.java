import java.util.Scanner;

public class Lab2_2 {
    public static int nod(int a, int b){
        return (b == 0) ? a : nod(b, a % b);
    }
    public static int NodNumbers(int[] numbers){
        int result = numbers[0];
        for(int i = 0; i < numbers.length; i++)
            result = nod(result, numbers[i]);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        sc.close();
        System.out.println(NodNumbers(numbers));
    }
}
