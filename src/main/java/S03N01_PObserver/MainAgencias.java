package S03N01_PObserver;

public class MainAgencias {
    public static void main(String[] args) {
        //Instacia de AgenteDeBolsa
        AgenteDeBolsa agente = new AgenteDeBolsa();

        //creando 2 instancias de AgenciaDeBolsa
        AgenciaDeBolsa agencia1 = new AgenciaDeBolsa("Agencia 1");
        AgenciaDeBolsa agencia2 = new AgenciaDeBolsa("Agencia 2");

        //registramos las agencias con el agente
        agente.agregarAgencia(agencia1);
        agente.agregarAgencia(agencia2);

        //actualizamos el valor de la bolsa y notificamos a las agencias
        agente.actualizarValorBolsa(500.0);
        agente.actualizarValorBolsa(550.0);

       //eliminamos una agencia en la lista de observadores
        agente.eliminarAgencia(agencia2);

        //actualizamos el valor de la bolsa nuevamente y notificamos a las agencias restantes
        agente.actualizarValorBolsa(600.0);
    }
}

/*Nivel 1
En todos los ejercicios, crea un proyecto Gradle con una clase Main que demuestre el uso del patrón (con las invocaciones que se necesiten).
Patrón Observer:
Diseña un sistema en el que un Agente de Bolsa (Observable) notifica a varias agencias de Bolsa (Observers) cambios cuando la Bolsa sube o baja.
Es necesario que el objeto Observable mantenga referencias a los Observadores.
*/
