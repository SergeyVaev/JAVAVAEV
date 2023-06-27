
// Вывести все простые числа от 1 до 1000
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

