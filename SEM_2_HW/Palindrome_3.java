/**
 * Является ли строка палиндромом(пишется одинаково в обе стороны).
 * Метод определяет является ли строка палиндромом. Решение в одну строчку.
 * replaceAll("\\W",""): убираем из строки все не нужные символы 
 * (знаки препинания, пробелы и т.д.);
 * new StringBuilder: создаем вторую строку, 
 * но пересортированную в обратном порядке с помощью метода reverse();
 * equalsIgnoreCase: сравниваем их между собой, игнорируя регистр.
 */

package SEM_2_HW;

import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_3 {
    public static void main(String[] args) {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Sample input: ");
            String input = inputStream.readLine();
            System.out.print("Sample output: ");
            System.out.print(isPalindrome(input));

        } catch (IOException exception) {
            System.err.println("Input error");
        }
    }

    public static boolean isPalindrome(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find())
            builder.append(matcher.group());

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if (result.compareToIgnoreCase(reverseResult) == 0)
            return true;
        return false;
    }
}
