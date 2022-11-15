package criacao;

public class Loan {
    public static int getTwoPayment() {
        return 2;
    }

    public static int getThreePayment() {
        return 3;
    }

    public static double getTwoPaymentFee() {
        return 0.3;
    }

    public static double getThreePaymentFee() {
        return 0.45;
    }

    public static void calculate(double value, int payment) {
        if (payment == 2) {
            double finalValue = value + (value * getTwoPaymentFee());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + finalValue);
        } else if (payment == 3) {
            double finalValue = value + (value * getThreePaymentFee());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + finalValue);
        } else {
            System.out.println("Quantidade de parcelas nao aceita");
        }

    }

}
