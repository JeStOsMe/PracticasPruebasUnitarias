package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    
    public Long subtract(Long number1, Long number2) {
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Double divide(Double number1, Double number2) {
        logger.info( "Dividing {} / {}", number1, number2 );
        try{
            return number1 / number2;
        } catch(Exception ex){
            ex.printStackTrace();
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
    }
}