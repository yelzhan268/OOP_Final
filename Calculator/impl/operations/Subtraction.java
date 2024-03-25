package Calculator.impl.operations;

import Calculator.impl.ComplexNumber;

public class Subtraction extends OpirationsClass { // вычитание -
    private double resultReal;
    private double resultImage;

    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        resultReal = num1.getRealNumber() - num2.getRealNumber();
        resultImage = num1.getImageNumber() - num2.getImageNumber();
        return new ComplexNumber(resultReal, resultImage);
    }

    @Override
    public String toString() {
        if (resultImage > 0) {
            return "Result: " + resultReal + " + " + resultImage + "i";
        } else return "Result: " + resultReal + " " + resultImage + "i";
    }
}
