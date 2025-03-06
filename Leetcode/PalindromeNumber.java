public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
    int reverse = 0;
    int buff = x;
    while(x > 0){
        reverse = reverse * 10 + x % 10;
        x /= 10;
    }
    if(reverse == buff)
    System.out.println("is Palindrome");
    else
    System.out.println("is not Palindrome");
    }
}
