public class FindFirstRepetitiveCharFromString {
    public static void main(String[] args) {
        String inputString = "qwert yuiop asdfg hjkl";

        char[] stringArray = inputString.toLowerCase().replaceAll("\\s+", "").toCharArray();

        System.out.println(stringArray.length);
        boolean findRepetitiveCharacter = false;
        for(int i = 0 ; i<stringArray.length-1;i++){
            for(int j=i+1; j<stringArray.length; j++){
            if(stringArray[i] == stringArray[j]){
                System.out.println("first repetative charcter " + stringArray[i]);
                findRepetitiveCharacter = true;
                break;
            }
        }
         if(findRepetitiveCharacter){
            break;
         }
        }
    }
}
