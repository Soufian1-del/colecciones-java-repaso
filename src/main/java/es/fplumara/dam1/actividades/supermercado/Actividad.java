package es.fplumara.dam1.actividades.supermercado;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actividad {

    public void procesarEscaneos(List<String> escaneos) {
        //creamos un nuevo set para almacenar todos los productos que sean **UNICOS**, el hashset sirve para almacenar solo los que sean únicos, este no garantiza un orden, además, se crea un TotalRepetidos, para mas tarde almacenar todos los productos que se repitan
        Set<String> conjuntoEscaneos = new HashSet<String>();
        int totalRepetidos = 0;

        //El for sirve para recorrer todos los escaneos, usamos el trim y tolowercase para normalizar, es decir para eliminar todos los espacios en blanco y pasarlo todo a mínuscula, se tiene que usar un String escaneoFormateado para guardar y imprimir los nuevos escaneos
        for (String escaneo : escaneos) {
            String escaneoFormateado = escaneo.trim().toLowerCase();
            System.out.println(escaneo + " -> " + escaneoFormateado);

            //con el add, se guardan todos los productos ya formateados y como este tiene un hashset, se guardan solo los Únicos
            conjuntoEscaneos.add(escaneoFormateado);

            //queremos saber cuáles están añadidos o repetidos
            if (conjuntoEscaneos.add(escaneoFormateado)) {
                System.out.println("Añadido " + escaneoFormateado);
            } else {
                System.out.println("Repetido " + escaneoFormateado);
                totalRepetidos++;
            }

        }
        //simplemente imprimir los resultados
        System.out.printf("total escaneos: %d\n", escaneos.size());
        System.out.printf("total escaneos repetidos: %d\n", totalRepetidos);
        System.out.printf("total de productos distintos: %d\n", conjuntoEscaneos.size());
        System.out.println("Listado final de productos:");
        conjuntoEscaneos.forEach(escaneo -> System.out.println("  - " + escaneo));
    }
}
