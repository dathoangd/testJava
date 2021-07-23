package Task;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 1. Use the keyboard to enter the number N.
 * <p>
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 * <p>
 * 3. Find the minimum among the list items: the getMinimum method.
 * <p>
 * Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args) {
        //write your code here
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        System.out.print("Nhập số lượng số cần kiểm tra: ");
        int size = Integer.parseInt(scanner.next());
        System.out.print("Nhập dãy số cần kiểm tra, các số cách nhau bởi dấu ,: ");
        List<Integer> numbers = getIntegerList(scanner.next());
        if (numbers.size() > size) {
            System.out.println("Số phẩn tử cần nhập phải = " + size);
            return;
        }
        System.out.println("Giá trị nhỏ nhất của dãy số là: " + getMinimum(numbers));
        scanner.close();

    }

    public static int getMinimum(List<Integer> array) {
        return array.stream().min(Integer::compareTo).orElse(0);
    }

    public static List<Integer> getIntegerList(String data) {
        // write your code here
        try {
            return Arrays.stream(data
                    .split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toList());
        } catch (NumberFormatException ex) {
            System.out.println("Chuỗi nhập có ký tự khác số!!!");
            return new ArrayList<>();
        }
    }
}
