package Task;

import java.util.Scanner;

/**
 * Write a method readString that reads a string from the keyboard.
 * <p>
 * Write a method upperCaseString to change the first letter of each word to uppercase
 * <p>
 * Display the result on the screen.
 * <p>
 * Example input:
 * sam i am.
 * <p>
 * Example output:
 * Sam I Am.
 * <p>
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */
public class Task3 {
    public static String readString() {
        //write your code here
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi cần chuyển đổi: ");
        str = scanner.nextLine();
        return str;
    }

    public static void upperCaseString(String s) {
        //write your code here

        String[] words = s.split("\\s");
        StringBuilder capitalizeStr = new StringBuilder();
        for (String word : words) {
            // Capitalize first letter
            String firstLetter = word.substring(0, 1);
            // Get remaining letter
            String remainingLetters = word.substring(1);
            capitalizeStr.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
        }
        System.out.println(capitalizeStr);
    }

    public static void main(String[] args) {
        String newStr = readString();
        upperCaseString(newStr);
    }

}
