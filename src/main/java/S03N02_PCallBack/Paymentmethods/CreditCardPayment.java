package S03N02_PCallBack.Paymentmethods;

import S03N02_PCallBack.Payment.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean processPayment() {
        //implementar lógica del procesamiento de la tarjeta de credito
        System.out.println("Procesando el pago con tarjeta de crédito...");
        return true; //suponiendo que el pago fue exitoso
    }
}
