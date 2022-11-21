
/**
 * Является ли строка палиндромом(пишется одинаково в обе стороны).
 * Нужно определить является ли строка палиндромом. 
 * Палиндромом называется строка, которая пишется одинаково слева направо 
 * и справа налево (в том числе пустая). 
 * При определении "палиндромности" строки должны учитываться 
 * только буквы и цифры. А пробелы, знаки препинания, 
 * а также регистр символов должны игнорироваться.
 * Sample Input: Madam, I'm Adam!
 * Sample Output: true
 * 
 * убрать пробелы можно с помощью .replace(" ",""); 
 * а как отфильтровать строку от знаков препинания? 
 * общий код который работает на строки без знаков препинания:
 */
package SEM_2_HW;

// import java.util.Arrays;

public class Palindrome_2 {
    public Boolean vozvrat(String A) {

        String B = "";
        String C = A.replace(" ", "");
        char[] mass = C.toCharArray();
        char[] mass2 = new char[mass.length];
        for (int i = mass.length - 1; i >= 0;) {
            for (int j = 0; j < mass2.length; j++) {

                mass2[j] = mass[i];
                i--;

                B += mass2[j];

            }

        }
        System.out.println(B);
        System.out.println(C);
        return B.equalsIgnoreCase(C);

    }

    public static void main(String args[]) {
        Palindrome_2 C = new Palindrome_2();
        System.out.println(C.vozvrat("Madam'      I'm Adam"));
    }
}
