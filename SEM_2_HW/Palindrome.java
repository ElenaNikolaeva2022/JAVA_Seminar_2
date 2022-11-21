/**
 * 1. Напишите метод, который принимает на вход строку (String) и 
 * определяет является ли строка палиндромом (возвращает boolean значение).
 */


package SEM_2_HW;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-bA-Z1-8]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Привет!"));
    }
}
