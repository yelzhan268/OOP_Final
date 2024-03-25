package Calculator.Reader;

import Calculator.Remove.Remove;
import Calculator.impl.ComplexNumber;
import Calculator.impl.operations.*;

public class Reader<E extends Opirations> {
    Remove n;
    E model;

    public Reader(Remove n, E model) {
        this.n = n;
        this.model = model;
    }

    public void run() {
        int choise = n.getChoise();
        Double real;
        Double image;

        real = n.inputReal("Введите действительную часть 1 комплексного числа: ");
        image = n.InputImage("Введите мнимую часть 1 комплексного числа: ");
        ComplexNumber num1 = new ComplexNumber(real, image);
        real = n.inputReal("Введите действительную часть 2 комплексного числа: ");
        image = n.InputImage("Введите мнимую часть 2 комплексного числа: ");
        ComplexNumber num2 = new ComplexNumber(real, image);

        switch (choise) {
            case 1:
                Addition addition = new Addition();
                addition.calculate(num1, num2);
                System.out.println(addition);
                break;
            case 2:
                Subtraction subtraction = new Subtraction();
                subtraction.calculate(num1, num2);
                System.out.println(subtraction);
                break;
            case 3:
                Multiplication multiplication = new Multiplication();
                multiplication.calculate(num1, num2);
                System.out.println(multiplication);
                break;
            case 4:
                Division division = new Division();
                division.calculate(num1, num2);
                System.out.println(division);
                break;
        }
    }
}
