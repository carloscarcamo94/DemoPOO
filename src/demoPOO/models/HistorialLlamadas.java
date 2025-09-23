package demoPOO.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class HistorialLlamadas {

    // Clase interna para representar una llamada
    private class Llamada {
        String numero;
        LocalDateTime fechaHora;

        Llamada(String numero) {
            this.numero = numero;
            this.fechaHora = LocalDateTime.now(); // fecha y hora actual
        }

        @Override
        public String toString() {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return "Número: " + numero + " | Fecha y hora: " + fechaHora.format(formato);
        }
    }

    // Lista para guardar las llamadas realizadas
    private ArrayList<Llamada> llamadas;

    // Constructor
    public HistorialLlamadas() {
        llamadas = new ArrayList<>();
    }

    // Registrar una nueva llamada
    public void registrarLlamada(String numero) {
        llamadas.add(new Llamada(numero));
        System.out.println("📞 Llamada registrada al número: " + numero);
    }

    // Mostrar todo el historial
    public void mostrarHistorial() {
        System.out.println("\n--- Historial de Llamadas ---");
        if (llamadas.isEmpty()) {
            System.out.println("No hay llamadas registradas.");
        } else {
            for (Llamada llamada : llamadas) {
                System.out.println(llamada);
            }
        }
    }
}
