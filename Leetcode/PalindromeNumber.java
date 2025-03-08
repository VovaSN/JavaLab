public class PalindromeNumber {
    public static boolean PalindromeNum(int x) {
        int reverse = 0;
        int buff = x;
        while(x > 0){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse == buff;
    }
    public static void main(String[] args) {
        int x = 121;
    System.out.println(PalindromeNum(x));
    }
}
