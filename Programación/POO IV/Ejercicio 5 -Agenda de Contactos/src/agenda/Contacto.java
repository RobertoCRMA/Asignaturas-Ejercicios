package agenda;
public class Contacto {
    private String nombre, telefono, email;
    public String dame_nombre() {
        return nombre;
    }
    public void establece_nombre(String nombre) {
        this.nombre = nombre;
    }
    public String dame_telefono() {
        return telefono;
    }
    public void establece_telefono(String telefono) {
        this.telefono = telefono;
    }
    public String dame_email() {
        return email;
    }
    public void establece_email(String email) {
        this.email = email;
    }
}