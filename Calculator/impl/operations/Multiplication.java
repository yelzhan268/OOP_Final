package Calculator.impl.operations;

import Calculator.impl.ComplexNumber;

public class Multiplication extends OpirationsClass { // умножение *
   private double resultReal;
   private double resultImage;

    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        resultReal = (num1.getRealNumber() * num2.getRealNumber()) - (num1.getImageNumber() * num2.getImageNumber());
        resultImage = (num1.getRealNumber() * num2.getImageNumber()) + (num1.getImageNumber() * num2.getRealNumber());
        return  new ComplexNumber(resultReal, resultImage);
    }

    @Override
    public String toString() {
        if (resultImage > 0) {
            return "Result: " + resultReal + " + " + resultImage + "i";
        } else return "Result: " + resultReal + " " + resultImage + "i";
    }
}
