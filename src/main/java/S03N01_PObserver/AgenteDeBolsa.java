package S03N01_PObserver;

import java.util.ArrayList;
import java.util.List;

//Objeto que esta siendo observado
public class AgenteDeBolsa {
    // Atributos para mantener el valor de la Bolsa y una lista de agencias de bolsa registradas
    private double valorBolsa;
    private List<AgenciaDeBolsa> agencias = new ArrayList<AgenciaDeBolsa>();

    // Método para agregar una agencia a la lista de observadores
    public void agregarAgencia(AgenciaDeBolsa agencia){
        agencias.add(agencia);
    }

    // Método para eliminar una agencia de la lista de observadores
    public void eliminarAgencia(AgenciaDeBolsa agencia){
        agencias.remove(agencia);
    }

    // Método para actualizar el valor de la Bolsa y notificar a todas las agencias registradas
    public void actualizarValorBolsa(double nuevoValor){
        valorBolsa = nuevoValor;
        notificarAgencias();
    }

    // Método privado para notificar a todas las agencias registradas
    private void notificarAgencias(){
        for(AgenciaDeBolsa agencia:agencias){
            agencia.actualizar(valorBolsa);
        }
    }
}
