package S03N02_PCallBack.Store;

import S03N02_PCallBack.Payment.PaymentCallBack;
import S03N02_PCallBack.Payment.PaymentGateway;
import S03N02_PCallBack.Payment.PaymentMethod;
import S03N02_PCallBack.Paymentmethods.CreditCardPayment;

public class ShoeStore {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();

        //Eligiendo el método de pago, probamos con Tarjeta de crédito
        PaymentMethod paymentMethod = new CreditCardPayment();

        //Realizando el pago a través de la pasarela de pago
        paymentGateway.processPayment(paymentMethod, new PaymentCallBack() {
            @Override
            public void paymentCompleted(boolean success, String message) {
                if(success){
                    System.out.println("Pago exitoso: " + message);
                }else{
                    System.out.println("Error en el pago: " + message);
                }
            }
        });

    }
}

/*Nivel 2 Patrón Callback
Simula una pasarela de pago que reciba un objeto encapsulador del método de pago a efectuar: tarjeta de crédito, Paypal o deuda en cuenta bancaria.
La pasarela invocará el pago sin conocer la forma y devolviendo el control a la clase de origen.
La clase que invoca la pasarela de pago será una tienda de zapatos.
*/
