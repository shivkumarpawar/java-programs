public class ReverseString {
    public static void main(String[] args) {
        
        String inputString = "MaDam";

        String reversed = "";

        //This is simple logic
        for(int i=inputString.length()-1; i>=0; i--){
            reversed = reversed + inputString.charAt(i);
        }
        System.out.println(reversed.toLowerCase()); 
        System.out.println(reverse(inputString)); 
        
        
        //some thing differernt approach
        reversed = new StringBuilder(inputString).reverse().toString(); 
        System.out.println(reversed);

        if(reversed.toLowerCase().equals(inputString.toLowerCase())){
            System.out.println("string is palindrome");
        }
        else System.out.println("string is not palindrome");
    }

// added method for reverse string using stringbuilder toCharArray method
    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }

}
