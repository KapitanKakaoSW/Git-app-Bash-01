public class Main {

    public static void main(String[] args) {
        System.out.println("App calculator");
        System.out.println("Version 1.0");

        double firstNumber = 5;
        double secondNumber = 7;

        double resultAdd = add(firstNumber, secondNumber);
        System.out.println(resultAdd);

        double resultMultiply = multiply(firstNumber, secondNumber);
        System.out.println(resultMultiply);
    }

    private static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
