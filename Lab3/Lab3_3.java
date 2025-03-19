import java.util.Scanner;
public class Lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int menRooms = n / k;
        if(n % k != 0)
        menRooms++;
        
        int womenRooms = m / k;
        if(m % k != 0)
        womenRooms++;

        System.out.println(menRooms + womenRooms);
    }
}
