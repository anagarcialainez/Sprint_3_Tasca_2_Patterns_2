package S03N01_PObserver;

//Observador para ser notificado cuando este cambia su estado
public class AgenciaDeBolsa {
    private String nombre;

    public AgenciaDeBolsa(String nombre){
        this.nombre = nombre;
    }

    // Método para recibir y procesar actualizaciones del valor de la Bolsa
    public void actualizar (double valorBolsa){
        System.out.println(nombre + " ha sido notificada: El valor de la Bolsa es $" + valorBolsa);
    }
}
