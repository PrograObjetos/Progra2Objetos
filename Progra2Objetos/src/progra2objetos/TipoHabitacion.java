package progra2objetos;


public class TipoHabitacion {
    private String tipoCama;
    private int numeroMaxPersonas;
    private String tipoHabitacion;
    private String descripcion;
    private boolean salon;
    private boolean terraza;
    private boolean vistaMar;
    private boolean todoIncluido;
    private boolean fumar;

    public TipoHabitacion(String tipoCama, int numeroMaxPersonas, String tipoHabitacion, String descripcion, boolean salon, boolean terraza, boolean vistaMar, boolean todoIncluido, boolean fumar) {
        this.tipoCama = tipoCama;
        this.numeroMaxPersonas = numeroMaxPersonas;
        this.tipoHabitacion = tipoHabitacion;
        this.descripcion = descripcion;
        this.salon = false;
        this.terraza = false;
        this.vistaMar = false;
        this.todoIncluido = false;
        this.fumar = false;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public int getNumeroMaxPersonas() {
        return numeroMaxPersonas;
    }

    public void setNumeroMaxPersonas(int numeroMaxPersonas) {
        this.numeroMaxPersonas = numeroMaxPersonas;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isSalon() {
        return salon;
    }

    public void setSalon(boolean salon) {
        this.salon = salon;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public boolean isVistaMar() {
        return vistaMar;
    }

    public void setVistaMar(boolean vistaMar) {
        this.vistaMar = vistaMar;
    }

    public boolean isTodoIncluido() {
        return todoIncluido;
    }

    public void setTodoIncluido(boolean todoIncluido) {
        this.todoIncluido = todoIncluido;
    }

    public boolean isFumar() {
        return fumar;
    }

    public void setFumar(boolean fumar) {
        this.fumar = fumar;
    }
    
}
