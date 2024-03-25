package Calculator;

import Calculator.Reader.Reader;
import Calculator.Remove.Remove;
import Calculator.impl.operations.OpirationsClass;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader(new Remove(), new OpirationsClass());
        reader.run();
    }
}
