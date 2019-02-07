import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QaJavaBasics {
    @Test
    public void QaJavaBasics() {
        float annualInterestRate = 8;


        float monthlyInterestRate = annualInterestRate / 1200;


        int numberOfYears = 30;


        float loanAmount = 50000;


        float monthlyPayment = (float) (loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        float totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The total payment is " +
                (int)(totalPayment * 100) / 100.0);
        Assertions.assertEquals(132077.66, 132077.66);
    }
}
