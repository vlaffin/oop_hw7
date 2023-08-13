import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexCalculator implements Calculator {
    private final Logger logger;

    public ComplexCalculator() {
        logger = Logger.getLogger(ComplexCalculator.class.getName());
    }

    @Override
    public ComplexNumber summa(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() + b.getRealPart();
        double imaginaryPart = a.getImaginaryPart() + b.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Summa is: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryPart = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Multiplication is: " + result.getRealPart() + " + " +
                result.getImaginaryPart() + "i");
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
        double realPart = (a.getRealPart() * b.getRealPart() +
                a.getImaginaryPart() * b.getImaginaryPart()) / denominator;
        double imaginaryPart = (a.getImaginaryPart() * b.getRealPart() -
                a.getRealPart() * b.getImaginaryPart()) / denominator;
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Division is: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
        return result;
    }
}