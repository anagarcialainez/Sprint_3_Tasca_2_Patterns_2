package S03N03_PDependencyInjection;

import S03N03_PDependencyInjection.model.Articulo;
import S03N03_PDependencyInjection.service.ConvertidorDeMoneda;
import S03N03_PDependencyInjection.service.ConvertidorDeMonedaImpl;
import S03N03_PDependencyInjection.service.PrecioArticuloEnVariasMonedas;

import java.util.*;

public class MainDependecyInjection {
    public static void main(String[] args) {
        // Crear un convertidor de moneda con tasas de cambio
        Map<String, Double> tasasDeCambio = new HashMap<>();
        tasasDeCambio.put("USD", 1.0);
        tasasDeCambio.put("EUR", 0.85);
        tasasDeCambio.put("JPY", 110.0);
        ConvertidorDeMoneda convertidor = new ConvertidorDeMonedaImpl(tasasDeCambio);

        //creamos un artículo
        Articulo articulo = new Articulo("Laptop", 1000.0);

        //Crear un objeto PrecioArticuloEnVariasMonedas
        PrecioArticuloEnVariasMonedas precioArticulo = new PrecioArticuloEnVariasMonedas(convertidor);

        //Definiendo las monedas para probar precio
        List<String> monedaDestino = new ArrayList<>();
        monedaDestino.add("USD");
        monedaDestino.add("EUR");
        monedaDestino.add("JPY");

        //Mostrar el precio en diferentes monedas
        precioArticulo.mostrarPrecioEnDiferentesMonedas(articulo,monedaDestino);

    }
}

/*Nivel 3
Dependency Injection
Diseña una clase que muestre en pantalla el precio de varios artículos.
Ya que tendrá que mostrarlos también en varios tipos de moneda.
Importante :Asegúrate de añadirle como Inyección de Dependencia una clase Convertidor de Moneda que
efectúe la corrección del precio en función del cambio de divisa.
*/
