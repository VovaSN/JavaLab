import java.util.Scanner;
public class Lab3_4 {
    public static int Squart(int a){
        return a * a;
    }
    public static int Cube(int a){
        return a * a * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i <= b;i++)
            System.out.print(Squart(i) + " ");

        System.out.println(" ");

        for(int i = b; i >= a;i--)
            System.out.print(Cube(i) + " ");
    }
}
