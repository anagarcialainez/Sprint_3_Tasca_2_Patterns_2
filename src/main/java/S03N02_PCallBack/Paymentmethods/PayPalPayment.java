package S03N02_PCallBack.Paymentmethods;

import S03N02_PCallBack.Payment.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
    @Override
    public boolean processPayment() {
        //implementar el procesamiento de la tarjeta de credito
        System.out.println("Procesando el pago con PayPal...");
        return true; //suponiendo un pago exitoso
    }
}
