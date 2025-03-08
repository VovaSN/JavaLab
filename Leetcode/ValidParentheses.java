import java.util.Stack;

public class ValidParentheses {
    private static boolean isPair(char curr, char last){
        return (curr == '}' && last == '{') ||
               (curr == ']' && last == '[') ||
               (curr == ')' && last == '(');
    }
    public static boolean isValid(String s) {
        Stack<Character> cs = new Stack<>();
    for(int i = 0; i < s.length();i++){
        char curr = s.charAt(i);
        if(!cs.empty()) {
            char last = cs.peek();
            if(isPair(curr, last)){
                    cs.pop();
                    continue;
                }

        }
        cs.push(curr);
    }
    return cs.isEmpty();
}
    public static void main(String[] args) {
        String s = "[]";
        System.out.println(isValid(s));
}
}
