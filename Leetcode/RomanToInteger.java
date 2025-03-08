public class RomanToInteger {
    public static int RomanToInt(String s){
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(i + 1 < s.length() && getNumber(s.charAt(i)) < getNumber(s.charAt(i+1)))
            ans -= getNumber(s.charAt(i));
            else
            ans += getNumber(s.charAt(i));
        } return ans;
    }
    public static boolean isValidNumber(String s){
        return s.contains("IIII") || s.contains("VV") || s.contains("XXXX") || s.contains("LL") || s.contains("CCCC") || s.contains("DD")|| s.contains("MMMM");
    }
    public static int getNumber(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        String s = "VV";
        if(isValidNumber(s)){
            System.out.println("Error invalid Roman number");
        return;}
        System.out.println(RomanToInt(s));
    }
}
