package SEM_2;
/**
 * Написать метод, который превращает строку, например, "aaaabbbcdd" в -> "a4b3c1d2",
 * т.е. метод смотрит на символы и все повторяющиеся записывает как символ + количество.
*/
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "ibm866");
        System.out.println("Введите исходную строку: ");
        String inp = iScanner.nextLine();
        if (inp.length() != 0) {
            System.out.println(strCompr(inp));
        } else {
            System.out.println("Результат: ");
        }
        iScanner.close();
    }

// aaaabbbcdd -> a4b3c1d2
    public static String strCompr(String a) {
/** 
 * Подсказка:
 * Заводим счетчик.
 * Итерируемся по строке.
 * Если текущий символ совпадает с предыдущим, то увеличиваем счетчик.
 * Если нет, то сохранили в какую-то (результирующую) строку и обнулили счечик.
 * В конце вернули результирующую строку.
*/
        char[] chars = a.toCharArray();
        int count = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                builder.append(count);
                count = 1;
                builder.append(chars[i]);
            }
        }
        builder.append(count);
        return builder.toString();
    }
}

/**
 * в Терминале:
 * Введите исходную строку: 
 * AAAbbCeeeeWW (ВВодим людое количество букв)
 * A3b2C1e4W    (Получаем ответ)
 */