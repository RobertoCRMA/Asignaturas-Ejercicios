package relojalarma;
import java.time.LocalTime;
public class RelojAlarma {
    private LocalTime horaAlarma;
    private LocalTime horaActual;
    private boolean alarmaActivada;
    public void establecerHoraAlarma(String horaAlarma) {
        this.horaAlarma = LocalTime.parse(horaAlarma);
    }
    public void activarDesactivarAlarma(boolean activar) {
        this.alarmaActivada = activar;
    }
    public void actualizarHoraActual(String horaActual) {
        this.horaActual = LocalTime.parse(horaActual);
    }
    public void comprobarHoraAlarma() {
        if (alarmaActivada && horaActual.equals(horaAlarma)) {
            System.out.println("Alarma sonando");
        }
    }
}