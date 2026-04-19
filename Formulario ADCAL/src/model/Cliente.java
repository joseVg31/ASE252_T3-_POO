package model;

public class Cliente {
    private String nombreRazonSocial;
    private String correo;
    private String telefono;
    private String rucDni;
    private String departamento;
    private String distrito;
    private String provincia;
    private String comoNosConocio;
    private String mensaje;

    public Cliente(String nombreRazonSocial, String correo, String telefono,
                   String rucDni, String departamento, String distrito,
                   String provincia, String comoNosConocio, String mensaje) {
        this.nombreRazonSocial = nombreRazonSocial;
        this.correo            = correo;
        this.telefono          = telefono;
        this.rucDni            = rucDni;
        this.departamento      = departamento;
        this.distrito          = distrito;
        this.provincia         = provincia;
        this.comoNosConocio    = comoNosConocio;
        this.mensaje           = mensaje;
    }

    public String getNombreRazonSocial() { return nombreRazonSocial; }
    public String getCorreo()            { return correo; }
    public String getTelefono()          { return telefono; }
    public String getRucDni()            { return rucDni; }
    public String getDepartamento()      { return departamento; }
    public String getDistrito()          { return distrito; }
    public String getProvincia()         { return provincia; }
    public String getComoNosConocio()    { return comoNosConocio; }
    public String getMensaje()           { return mensaje; }

    @Override
    public String toString() {
        return "=== DATOS ADCAL ===\n" +
                "Nombre/Razón Social: " + nombreRazonSocial + "\n" +
                "Correo: "              + correo            + "\n" +
                "Teléfono: "            + telefono          + "\n" +
                "RUC/DNI: "             + rucDni            + "\n" +
                "Departamento: "        + departamento      + "\n" +
                "Distrito: "            + distrito          + "\n" +
                "Provincia: "           + provincia         + "\n" +
                "¿Cómo nos conoció?: "  + comoNosConocio    + "\n" +
                "Mensaje: "             + mensaje;
    }
}