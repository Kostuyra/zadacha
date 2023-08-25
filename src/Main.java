public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str = "fasdsaf";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int j = str.length() - 1;
        int i = 0;
        while (i < j) {
            if (str.charAt(i) != (str.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}