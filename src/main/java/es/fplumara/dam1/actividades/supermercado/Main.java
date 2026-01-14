package es.fplumara.dam1.actividades.supermercado;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> escaneos = List.of(
                "Leche", "pan", "HUEVOS", "pan", "  leche  ", "ARROZ", "Pan",
                "yogur", "manzanas", "MANZANAS", "peras", "Peras", "  peras ",
                "tomate", "tomate", "Tomate", "aceite", "ACEITE", "harina", "HARINA",
                "sal", "sal", "sal", "azúcar", "azucar", "azúcar ",
                "café", "CAFE", "cafe", "pasta", "PASTA", "pasta ",
                "chocolate", "CHOCOLATE", "chocolate", "galletas", "Galletas",
                "cereales", "CEREALES", "cereales  ", "atun", "ATÚN", " atún ",
                "agua", "AGUA", "Agua ", "arroz", "ARROZ", "arroz ",
                "pan integral", "PAN INTEGRAL", "pan  integral ", "queso", "Queso", "QUESO"
        );
        Actividad actividad = new Actividad();
        actividad.procesarEscaneos(escaneos);
    }
}
