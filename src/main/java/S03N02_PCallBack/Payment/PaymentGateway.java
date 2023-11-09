package S03N02_PCallBack.Payment;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod,PaymentCallBack callBack){
        //simulando el procesamiento de pago
        boolean paymentSuccessful = paymentMethod.processPayment();
        String message = "El pago se ha completado con éxito.";

        if(!paymentSuccessful){
            message = "El pago ha fallado. Por favor, inténtelo de nuevo.";
        }

        //llamando al Callback para notificar el resultado del pago
        callBack.paymentCompleted(paymentSuccessful, message );
    }
}

/*pasarela de pago que aceptará un objeto de método de pago y un Callback*/