package S03N02_PCallBack.Payment;

public interface PaymentCallBack {
    void paymentCompleted(boolean success, String message);
}

/*definamos una interfaz de Callback para que la pasarela de pago pueda notificar a la tienda de zapatos
 una vez que se complete el pago*/
