package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class VuelosUtils {
    // Funcion filtrado por fecha.
    public static List<Vuelo> filtrarPorFecha(List<Vuelo> vuelos, LocalDate fechaDesde, LocalDate fechaHasta) {
        return vuelos.stream()
                // Añadimos el plusDays(1) y minusDays para que filtre las fechas icluyendo los dias seleccionados.
                .filter(v -> (fechaHasta == null || v.getFechaInicio().isBefore(fechaHasta.plusDays(1)))
                        && (fechaDesde == null || v.getFechaInicio().isAfter(fechaDesde.minusDays(1))))
                .sorted(Comparator.comparing(Vuelo::getFechaInicio)).toList();
    }
}
