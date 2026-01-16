package es.fplumara.dam1.actividades.alumnos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actividad {

    public void procesar(List<Alumno> alumnosEntrada) {
        Set<Alumno> alumnosOrdenados = new HashSet<Alumno>();
        for (Alumno alumno: alumnosEntrada){
            alumnosOrdenados.add(alumno);
        }
        alumnosOrdenados.forEach(alumno -> System.out.println(alumno));
        System.out.println(alumnosOrdenados.size());
    }


}