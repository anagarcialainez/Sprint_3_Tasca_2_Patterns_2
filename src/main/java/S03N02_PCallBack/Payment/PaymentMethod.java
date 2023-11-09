package S03N02_PCallBack.Payment;

public interface PaymentMethod {
    boolean processPayment();
}

/*representa la estructura común para todos los métodos de pago.
Esta interfaz declara un único método processPayment, que cualquier método de pago específico debe implementar.*/
