public class Palindrome{
public static void main(String[] args) {

    String str1 = "abcd";
    String str2 = "dcba";

    String newstr1 = str1.toLowerCase();
    String newstr2 = str2.toLowerCase();

    for(int i = 0; i < newstr1.length(); i++) {
        for(int j = newstr2.length() - 1; j > 0; j--) {

            if (newstr1.charAt(i) == newstr2.charAt(j)) {
                System.out.println("Is Palindrome.");
            } else {
                System.out.println("Not Palindrome.");
            }
        }

    }
}
}