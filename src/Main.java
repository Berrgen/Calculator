import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CalculateException{
        Scanner sc = new Scanner(System.in);
        Calculate calc = new Calculate();
        while(true) {
                calc.parser(sc.nextLine());
                calc.setRes();
                calc.printResult();
        }

    }
}
