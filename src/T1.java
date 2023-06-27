// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class T1 {
    public static void main(String[] args) {
        int n = 5;
        int triangle = triangleNumber(n);
        int factorial = factorial(n);
        System.out.println("Triangle number: " + triangle);
        System.out.println("Factorial: " + factorial);
    }

    public static int triangleNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}