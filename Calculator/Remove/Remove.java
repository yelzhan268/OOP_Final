package Calculator.Remove;

import java.util.Scanner;

public class Remove {
    Scanner scanner = new Scanner(System.in);

    public double inputReal(String msg) {
        System.out.println(msg);
        return scanner.nextDouble();
    }

    public double InputImage(String msg) {
        System.out.println(msg);
        return scanner.nextDouble();
    }

    public int getChoise() {
        System.out.println("Choice operation:");
        System.out.println("\t1) Addition;");
        System.out.println("\t2) Subtraction;");
        System.out.println("\t3) Multiplication;");
        System.out.println("\t4) Division.");
        return scanner.nextInt();
    }
}
