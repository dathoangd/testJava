package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","
 * <p>
 * Display to screen the whole list of number in decreasing sorting order.
 * <p>
 * If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".
 * <p>
 * Requirements:
 * •The program must read a string of numbers from the keyboard.
 * •The readData method is to read numbers from the keyboard
 * •The readData method must contain a try-catch block.
 * •The sortNumber method is to sorting list of numbers into decreasing order.
 * •The readData method calls sortNumber method.
 * •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */

public class Task1 {
    public static void readData() throws IOException {
        System.out.print("Nhập chuỗi số cần sắp xếp, cách nhau bởi dấu ,: ");
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = null;
        try {
            // Reading data using readLine
            numbers = Arrays.stream(reader.readLine()
                    .split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toList());
            // Printing the read line
            System.out.println("Chuỗi sau khi sắp xếp: ");
            System.out.println(numbers);
        } catch (NumberFormatException ex) {
            System.out.println("Chuỗi nhập phải là dãy số");
        }
    }

    public List<Integer> sortNumberList(List<Integer> list) {
        return null;
    }

    public static void main(String[] args) throws IOException {
        readData();
    }
}



