package SEM_2;

/**
 * public String buildString(char c1, char c2, int n) {
 * 
 * n - четное
 * Создать строку, которая состоит из символов c1c2c1c2c1c2…c1c2, причем длина
 * этой строки равна n
 * return null;
 * }
 */

// Вариант 1.
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Insert char 1: ");
        char ch1 = iScanner.next().charAt(0);
        System.out.print("Insert char 2: ");
        char ch2 = iScanner.next().charAt(0);
        System.out.print("Insert number: ");
        int number = iScanner.nextInt();
        String ans = buildStr(ch1, ch2, number);
        System.out.println(ans);
        iScanner.close();
    }

    public static String buildStr(char c1, char c2, int n) {
        String ans = new String();
        if (n % 2 == 0 && n != 0) {
            for (int i = 0; i < n / 2; i++) {
                ans = ans + c1 + c2;
            }
            return ans;
        } else {
            return null;
        }
    }
}

/**
 * в Терминале:
 * Insert char 1: 2 (Вводим цифру)
 * Insert char 2: 3 (Вводим цифру)
 * Insert number: 8 (Вводим цифру)
 * 23232323 (Получаем ответ)
 */

// // Вариант 2.
// public class task_1 {
//     public static void main(String[] args) {
//         System.out.println(buildString('q', 'p', 20));
//     }

//     // п - четное
//     // Создать строку, которая состоит из символов c1c2c1c2c1c2…c1c2,
//     // причем длина этой строки равна п
//     public static String buildString(char c1, char c2, int n) {
//         String res = "";
//         for (int i = 0; i < n / 2; i++) {
//             res += String.valueOf(c1) + String.valueOf(c2);
//         }

//         return res;
//     }
// }

// /**
//  * в Терминале:
//  * qpqpqpqpqpqpqpqpqpqp
//  */