import java.util.Scanner;
//import java.util.Math;

public class SimpleCalculator {
    private double numberOne;
    private double numberTwo;
    private char operator;
    private double result;
    private boolean validOperator;

    public double getNumberOne() {
        return this.numberOne;
    }

    public double getNumberTwo() {
        return this.numberTwo;
    }

    public char getOperator() {
        return this.operator;
    }

    public double getResult() {
        return this.result;
    }

    public boolean getValidOperator() {
        return this.validOperator;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setValidOperator(boolean validOperator) {
        this.validOperator = validOperator;
    }



    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);

        SimpleCalculator calc = new SimpleCalculator();

        System.out.print("Enter the first number: ");
        calc.setNumberOne(scanner.nextDouble());

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        calc.setOperator(scanner.next().charAt(0));

        System.out.print("Enter the second number: ");
        calc.setNumberTwo(scanner.nextDouble());

        calc.setValidOperator(true);

        switch(calc.getOperator()) {
            case '+' -> calc.setResult(calc.getNumberOne() + calc.getNumberTwo());
            case '-' -> calc.setResult(calc.getNumberOne() - calc.getNumberTwo());
            case '*' -> calc.setResult(calc.getNumberOne() * calc.getNumberTwo());
            case '/' -> {
                if (calc.getNumberTwo() == 0) {
                    calc.setValidOperator(!true);
                    System.out.println("You cannot divide by zero");
                }
                else calc.setResult(calc.getNumberOne() / calc.getNumberTwo());
            }
            case '^' -> calc.setResult(Math.pow(calc.getNumberOne(), calc.getNumberTwo()));
            default -> {
                calc.setValidOperator(!true);
                System.out.println("This is an invalid operator");
            }
        }
        if(calc.getValidOperator()) {
            System.out.println(calc.getResult());
        }

        scanner.close();
    }
}
