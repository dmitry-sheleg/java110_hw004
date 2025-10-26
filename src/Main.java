import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int days = scanner.nextInt();
            if (days == countDays(year)) {
                count++;
            }else {
                System.out.println("Неправильно! В этом году " + countDays(year) + " дней!");
                System.out.println("Набрано очков: " + count);
                break;
            }
        }
    }

    public static int countDays(int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}

