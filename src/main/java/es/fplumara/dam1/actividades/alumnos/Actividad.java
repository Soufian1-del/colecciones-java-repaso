package es.fplumara.dam1.actividades.alumnos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actividad {

    public void procesar(List<Alumno> alumnosEntrada) {
        Set<List<Alumno>> alumnosOrdenados = new HashSet<>();
        for (Alumno alumnos: alumnosEntrada){
            alumnosOrdenados.add(alumnosEntrada);

        }
        alumnosOrdenados.forEach(alumnos -> System.out.println(alumnosOrdenados));
    }


}