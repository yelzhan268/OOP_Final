package Calculator.impl;

public class ComplexNumber {
    private double real;
    private double image;

    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getRealNumber() {
        return real;
    }

    public double getImageNumber() {
        return image;
    }
}
