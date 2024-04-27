public class VowelPresentInString {
    public static void main(String[] args) {
        
        System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false

        String input = "hello";
        boolean vowelPresent = false;

        for(int i=0 ; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u"){
                vowelPresent = true;
                break;
            }
           
        }
	}

	
    public static boolean stringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
