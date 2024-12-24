public class Calculadora {

    // TODO: SUMAR
    public double sum(double[] numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    // TODO: RESTAR
    public double subtract(double[] numbers) {
        if (numbers.length == 0) return 0;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    // TODO: MULTIPLICAR
    public double multiply(double[] numbers) {
        if (numbers.length == 0) return 0;
        double result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    // TODO: DIVIDIR
    public double divide(double[] numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("No podemos dividir un array vacío");
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) throw new ArithmeticException("No se puede dividir por cero.");
            result /= numbers[i];
        }
        return result;
    }



}
