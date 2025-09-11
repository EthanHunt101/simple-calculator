import java.util.Scanner;

public class SimpleCalculator {
    private int numberOne;
    private int numberTwo;
    private char operator;

    public int getNumberOne() {
        return this.numberOne;
    }

    public int getNumberTwo() {
        return this.numberTwo;
    }

    public char getOperator() {
        return this.operator;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.println("e");




        scanner.close();
    }
}
