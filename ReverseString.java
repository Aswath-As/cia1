public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
