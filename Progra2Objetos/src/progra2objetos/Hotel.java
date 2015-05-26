package progra2objetos;
import java.util.Date;


public class Hotel {
    private String nombre;
    private String direccion;
    private String pais;
    private int telefono;
    private int numeroEstrellas;
    private String tipoHospedaje;
    private String tamanoHotel;
    private Date horaCheckIn;
    private Date hoaCheckOu;
    private String requisitosCheckIn;
    private String serviciosOfrece;
    private Date añoConstruccion;

    public Hotel(String nombre, String direccion, String pais, int telefono, int numeroEstrellas, String tipoHospedaje, String tamanoHotel, Date horaCheckIn, Date hoaCheckOu, String requisitosCheckIn, String serviciosOfrece, Date añoConstruccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.telefono = telefono;
        this.numeroEstrellas = numeroEstrellas;
        this.tipoHospedaje = tipoHospedaje;
        this.tamanoHotel = tamanoHotel;
        this.horaCheckIn = horaCheckIn;
        this.hoaCheckOu = hoaCheckOu;
        this.requisitosCheckIn = requisitosCheckIn;
        this.serviciosOfrece = serviciosOfrece;
        this.añoConstruccion = añoConstruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumeroEstrellas() {
        return numeroEstrellas;
    }

    public void setNumeroEstrellas(int numeroEstrellas) {
        this.numeroEstrellas = numeroEstrellas;
    }

    public String getTipoHospedaje() {
        return tipoHospedaje;
    }

    public void setTipoHospedaje(String tipoHospedaje) {
        this.tipoHospedaje = tipoHospedaje;
    }

    public String getTamanoHotel() {
        return tamanoHotel;
    }

    public void setTamanoHotel(String tamanoHotel) {
        this.tamanoHotel = tamanoHotel;
    }

    public Date getHoraCheckIn() {
        return horaCheckIn;
    }

    public void setHoraCheckIn(Date horaCheckIn) {
        this.horaCheckIn = horaCheckIn;
    }

    public Date getHoaCheckOu() {
        return hoaCheckOu;
    }

    public void setHoaCheckOu(Date hoaCheckOu) {
        this.hoaCheckOu = hoaCheckOu;
    }

    public String getRequisitosCheckIn() {
        return requisitosCheckIn;
    }

    public void setRequisitosCheckIn(String requisitosCheckIn) {
        this.requisitosCheckIn = requisitosCheckIn;
    }

    public String getServiciosOfrece() {
        return serviciosOfrece;
    }

    public void setServiciosOfrece(String serviciosOfrece) {
        this.serviciosOfrece = serviciosOfrece;
    }

    public Date getAñoConstruccion() {
        return añoConstruccion;
    }

    public void setAñoConstruccion(Date añoConstruccion) {
        this.añoConstruccion = añoConstruccion;
    }
    
}

