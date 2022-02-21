public class Main {

    public static void main(String[] args) {
        System.out.println("App calculator");
        System.out.println("Version 1.0");

        double firstNumber = 8.4;
        double secondNumber = 5.9;

        double resultAdd = add(firstNumber, secondNumber);
        System.out.println(resultAdd);

        double resultMultiply = multiply(firstNumber, secondNumber);
        System.out.println(resultMultiply);

        double resultSubtract = subtract(firstNumber, secondNumber);
        System.out.println(resultSubtract);

        double resultDivide = divide(firstNumber, secondNumber);
        System.out.println(resultDivide);
    }

    private static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
