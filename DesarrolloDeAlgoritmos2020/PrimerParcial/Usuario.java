package PrimerParcial;

public class Usuario {
    private String nombre;
    private String clave;
    private String tipo;
    private int duracionPermanencia;
    private boolean esPreferencial;

    // Constructores
    public Usuario(String clave) {
        this.clave = clave;
    }

    public Usuario(String nom, String clave, String tipo, int duracion, boolean preferencial) {
        this.nombre = nom;
        this.clave = clave;
        this.tipo = tipo;
        this.duracionPermanencia = duracion;
        this.esPreferencial = preferencial;
    }

    // Metodos Observadores
    public String getNombre() {
        return this.nombre;
    }

    public String getClave() {
        return this.clave;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getDuracionPermanencia() {
        return this.duracionPermanencia;
    }

    public boolean getEsPreferencial() {
        return this.esPreferencial;
    }

    public String toString() {
        return "Nombre: " + getNombre() + "Clave: " + getClave() + "\n" + "Tipo: " + getTipo() + "\n"
                + "Duracion en horas de permanencia: " + getDuracionPermanencia() + "\n" + "¿Es preferencial? " + getEsPreferencial();
    }

    public boolean equals(Usuario u) {
        return this.clave == u.clave;
    }

    // Metodos Modificadores
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDuracionPermanencia(int duracion) {
        this.duracionPermanencia = duracion;
    }

    public void setEsPreferencial(boolean preferencial) {
        this.esPreferencial = preferencial;
    }

}