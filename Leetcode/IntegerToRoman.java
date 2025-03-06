public class IntegerToRoman {
    public static void main(String[] args) {
        int numbers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbols[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int number = 19;
        if(number > 3999)
        return;
        String result = "";
        for(int i = 0; i < numbers.length; i++)
        {
            while(number >= numbers[i])
            {
                result += symbols[i];
                number -=numbers[i];
            }
        }
        System.out.println(result);
    }
}
