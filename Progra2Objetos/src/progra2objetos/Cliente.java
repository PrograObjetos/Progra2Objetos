
package progra2objetos;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String genero;
    private String email;
    private String contraseña;
    private String checkContraseña;
    private int edad;

    public Cliente(String nombre, String apellidos, String genero, String email, String contraseña, String checkContraseña, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
        this.contraseña = contraseña;
        this.checkContraseña = checkContraseña;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCheckContraseña() {
        return checkContraseña;
    }

    public void setCheckContraseña(String checkContraseña) {
        this.checkContraseña = checkContraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
