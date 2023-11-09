package S03N02_PCallBack.Paymentmethods;

import S03N02_PCallBack.Payment.PaymentMethod;

public class BankAccountPayment implements PaymentMethod {
    @Override
    public boolean processPayment() {
        // Implementar lógica del procesamiento de la deuda en cuenta bancaria
        System.out.println("Procesando el pago con deuda en cuenta bancaria...");
        return false; //suponiendo que el pago falló en este caso
    }
}
