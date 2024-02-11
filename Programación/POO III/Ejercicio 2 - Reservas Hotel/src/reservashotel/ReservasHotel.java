package reservashotel;
class Habitacion {
    private int numero;
    private String tipo;
    private boolean ocupada;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void reservar() {
        ocupada = true;
        System.out.println("Habitación " + numero + " reservada.");
    }

    public void cancelarReserva() {
        ocupada = false;
        System.out.println("Reserva de habitación " + numero + " cancelada.");
    }
}

class Hotel {
    private Habitacion[] habitaciones;

    public Hotel(int numHabitaciones) {
        habitaciones = new Habitacion[numHabitaciones];
        for (int i = 0; i < numHabitaciones; i++) {
            if (i % 3 == 0) {
                habitaciones[i] = new Habitacion(i + 1, "Suite");
            } else if (i % 2 == 0) {
                habitaciones[i] = new Habitacion(i + 1, "Doble");
            } else {
                habitaciones[i] = new Habitacion(i + 1, "Simple");
            }
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Estado de las habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("Habitación " + habitacion.getNumero() + ": " +
                    (habitacion.isOcupada() ? "Ocupada" : "Disponible"));
        }
    }

    public void reservarHabitacion(int numeroHabitacion) {
        if (numeroHabitacion > 0 && numeroHabitacion <= habitaciones.length) {
            if (!habitaciones[numeroHabitacion - 1].isOcupada()) {
                habitaciones[numeroHabitacion - 1].reservar();
            } else {
                System.out.println("La habitación " + numeroHabitacion + " ya está ocupada.");
            }
        } else {
            System.out.println("Número de habitación inválido.");
        }
    }

    public void cancelarReservaHabitacion(int numeroHabitacion) {
        if (numeroHabitacion > 0 && numeroHabitacion <= habitaciones.length) {
            if (habitaciones[numeroHabitacion - 1].isOcupada()) {
                habitaciones[numeroHabitacion - 1].cancelarReserva();
            } else {
                System.out.println("La habitación " + numeroHabitacion + " no está ocupada.");
            }
        } else {
            System.out.println("Número de habitación inválido.");
        }
    }
}