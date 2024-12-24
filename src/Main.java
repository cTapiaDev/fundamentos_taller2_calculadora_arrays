public class Main {
    public static void main(String[] args) {

        Calculadora calculator = new Calculadora();

        double[] numbersForAddition = {1.5, 2, 3.7, 5.1, 10};
        double[] numbersForSubtraction = { 10, 2, 3.7, 2, 0.5 };
        double[] numbersForMultiplication = { 10, 5, 3.7, 2, 0.5 };
        double[] numbersForDivision = {  };

        System.out.println("Suma: " + calculator.sum(numbersForAddition));
        System.out.println("Resta: " + calculator.subtract(numbersForSubtraction));
        System.out.println("Multiplicación: " + calculator.multiply(numbersForMultiplication));
        System.out.println("Division: " + calculator.divide(numbersForDivision));

    }
}