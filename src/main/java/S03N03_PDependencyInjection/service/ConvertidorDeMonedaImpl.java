package S03N03_PDependencyInjection.service;

import java.util.Map;

public class ConvertidorDeMonedaImpl implements ConvertidorDeMoneda {
    private Map<String, Double> tasasDeCambio;

    public ConvertidorDeMonedaImpl(Map<String, Double> tasasDeCambio) {
        this.tasasDeCambio = tasasDeCambio;
    }

    @Override
    public double convertir(double monto, String monedaDestino) {
        if(tasasDeCambio.containsKey(monedaDestino)){
            double tasaDeCambio = tasasDeCambio.get(monedaDestino);
            return monto * tasaDeCambio;
        }else{
            System.out.println("No se encontró una tasa de cambio para la moneda " + monedaDestino);
            return monto; // Devuelve el monto original si la moneda de destino no está en las tasas de cambio
        }
        }

    }




