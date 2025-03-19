import java.util.Scanner;
public class Lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int l = sc.nextInt();
        int k = sc.nextInt();

        int V = l * w *h;
        int result = V/k;
        if(V % k !=0)
        result++;
        System.out.println(result);
    }
}
