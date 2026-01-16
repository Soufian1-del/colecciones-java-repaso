package es.fplumara.dam1.actividades.inventario;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Actividad {

    public void procesarMovimientos(List<String> movimientos) {
        Map<String, Integer> movimientosMap = new TreeMap<>();
        for (String movimiento : movimientos){
            String[] separarMovimientos = movimiento.split(" ");
            String objeto = separarMovimientos[0];
            Integer valorObjeto = Integer.parseInt(separarMovimientos[1]);
            Integer cantidadPorDefecto = movimientosMap.getOrDefault(objeto, 0);
            movimientosMap.put(objeto, valorObjeto + cantidadPorDefecto);
        }
    }
}
