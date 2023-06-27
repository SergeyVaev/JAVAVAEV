import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        
        try (Scanner calc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num = calc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = calc.nextDouble();

            System.out.print("Choose an operation(+,-,*,/): )");
            char user = calc.next().charAt(0);

            double result;

            switch (user){
                case '+':
                    result = num+num2;
                    break;
                case'-':
                    result = num-num2;
                    break;
                case '*':
                    result = num*num2;
                    break;
                case '/':
                    result = num/num2;
                    break;
                default:
                 System.out.println("error!");
                 return;

            }
            System.out.println(num + " " + user + " " + num2 + "=" + result);
        }
    }
    
}