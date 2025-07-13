import entities.Vuelo;
import utils.VuelosUtils;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    // Definir dos constantes de fecha inicio y fin.
    public static LocalDate fechaHasta;
    public static LocalDate fechaDesde;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear lista 10 vuelos.
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("HKJ-014V", "Ryanair", "Valencia", "Roma", LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 1)));
        vuelos.add(new Vuelo("HJT-096M", "Iberia", "Valencia", "Aosta", LocalDate.of(2025, 8, 1), LocalDate.of(2025, 8, 1)));
        vuelos.add(new Vuelo("HTK-054S", "Ryanair", "Valencia", "Dublín", LocalDate.of(2025, 7, 1), LocalDate.of(2025, 7, 1)));
        vuelos.add(new Vuelo("RSM-072L", "Air Europa", "Alicante", "Amsterdam", LocalDate.of(2025, 8, 10), LocalDate.of(2025, 8, 11)));
        vuelos.add(new Vuelo("JLK-024P", "Lufthansa", "Valencia", "Eindhoven", LocalDate.of(2025, 11, 10), LocalDate.of(2025, 11, 10)));
        vuelos.add(new Vuelo("HLM-043E", "Turkish Airlines", "Madrid", "Munich", LocalDate.of(2025, 10, 9), LocalDate.of(2025, 10, 10)));
        vuelos.add(new Vuelo("VAL-214L", "Iberia", "Sevilla", "Mallorca", LocalDate.of(2025, 8, 15), LocalDate.of(2025, 8, 15)));
        vuelos.add(new Vuelo("ALL-321P", "Air Europar", "Alicante", "Liverpool", LocalDate.of(2025, 11, 14), LocalDate.of(2025, 11, 14)));
        vuelos.add(new Vuelo("BAR-056V", "Ryanair", "Barcelona", "Berlin", LocalDate.of(2025, 10, 11), LocalDate.of(2025, 10, 11)));
        vuelos.add(new Vuelo("MAD-044M", "Iberia", "Madrid", "Paris", LocalDate.of(2025, 9, 12), LocalDate.of(2025, 9, 12)));

        vuelos.forEach(System.out::println);
        System.out.println("-----------------------");

        System.out.println("Introduzca la fecha de inicio: ");
        fechaDesde = solicitarFecha();
        System.out.println("Introduzca la fecha de final: ");
        fechaHasta = solicitarFecha();

        try {
            List<Vuelo> vuelosFiltrados = VuelosUtils.filtrarPorFecha(vuelos, fechaDesde, fechaHasta);
            System.out.println("Vuelos Filtrados: ");
            vuelosFiltrados.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Hay un error: " + e.getMessage());
        }
    }

    public static LocalDate solicitarFecha() {
        while (true) {
            String fechaTexto = sc.nextLine();
            if (fechaTexto.isBlank()) return null;
            try {
                return LocalDate.parse(fechaTexto);
            } catch (Exception e) {
                System.err.println("Formato de fecha no valido: introduzca un valor aaaa-mm-dd" + e.getMessage());
            }
        }
    }
}