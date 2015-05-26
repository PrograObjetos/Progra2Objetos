package progra2objetos;

public class Habitacion {
    private String nombreCliente;
    private String apellidosCliente;
    private int cantidadAdultos;
    private int cantidadNiños;
    private String tipoHabitacion;

    public Habitacion(String nombreCliente, String apellidosCliente, int cantidadAdultos, int cantidadNiños, String tipoHabitacion) {
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.cantidadAdultos = cantidadAdultos;
        this.cantidadNiños = cantidadNiños;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public int getCantidadAdultos() {
        return cantidadAdultos;
    }

    public void setCantidadAdultos(int cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }

    public int getCantidadNiños() {
        return cantidadNiños;
    }

    public void setCantidadNiños(int cantidadNiños) {
        this.cantidadNiños = cantidadNiños;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
}
