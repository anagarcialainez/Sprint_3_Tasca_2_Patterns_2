package S03N03_PDependencyInjection.service;

import S03N03_PDependencyInjection.model.Articulo;

import java.util.List;

public class PrecioArticuloEnVariasMonedas {
    private ConvertidorDeMoneda convertidorDeMoneda;

    public PrecioArticuloEnVariasMonedas(ConvertidorDeMoneda convertidorDeMoneda) {
        this.convertidorDeMoneda = convertidorDeMoneda;
    }

    public void mostrarPrecioEnDiferentesMonedas(Articulo articulo, List<String> monedasDestino){
        System.out.println("Precio en diferentes monedas para el artículo " + articulo.getNombre() + ":");

        for(String moneda : monedasDestino){
            double precioConvertido = convertidorDeMoneda.convertir(articulo.getPrecio(), moneda);
            System.out.println(moneda + ": " + precioConvertido);
        }
    }
}
