package project;

public class StringManagement {

    public String stringreverse(String str) {
        String result = "";
        for (int i = 1; i < str.length()+1; i++) {
            result = result + str.charAt(str.length()-i);
        }
        return result;
    }

    public String Captilize(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.insert(i, Character.toUpperCase(str.charAt(i)));
        }
        return result.toString();
    }

    public String ToLowerCase(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.insert(i, Character.toLowerCase(str.charAt(i)));
        }
        return result.toString();
    }
}
