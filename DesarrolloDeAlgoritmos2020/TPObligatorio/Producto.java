package TPObligatorio;

public class Producto {
    private int codigo;
    private int cantEnStock;
    private String nombre;
    private String marca;
    private double precio;
    private boolean enOferta;

    // Constructores
    public Producto(int cod, int cant, String nom, String mar, double p) {
        this.codigo = cod;
        this.cantEnStock = cant;
        this.nombre = nom;
        this.marca = mar;
        this.precio = p;
        this.enOferta = revisarOferta();
    }

    public Producto(int cod) {
        this.codigo = cod;
    }

    // Metodos Observadores
    public int getCodigo() {
        return this.codigo;
    }

    public int getCantEnStock() {
        return this.cantEnStock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getPrecio() {
        return this.precio;
    }

    public boolean getEnOferta() {
        return this.enOferta;
    }

    public String toString() {
        return "Codigo: " + getCodigo() + "\n" + "Cant. en stock: " + getCantEnStock() + "\n" + "Nombre: " + getNombre() + "\n" + "Marca: " + getMarca() + "\n"
                + "Precio: $" + getPrecio() + "\n" + "Oferta: " + getEnOferta();
    }

    public boolean equals(Producto p) {
        return this.codigo == p.codigo;
    }

    // Metodos Modificadores
    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public void setCantEnStock(int cant) {
        this.cantEnStock = cant;
        setEnOferta();
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setMarca(String mar) {
        this.marca = mar;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }

    public void setEnOferta() {
        this.enOferta = revisarOferta();
    }

    // Metodos Propios del Tipo
    public void actualizarStock(int cant) {
        this.cantEnStock += cant;
        if (!getEnOferta()) {
            setEnOferta();
        }
    }

    public String hacerPedido() {
        String retorno = "";
        if (getCantEnStock() < 10) {
            retorno = "Codigo: " + getCodigo() + "\n" + "Nombre: " + getNombre() + "\n" + "Marca: " + getMarca();
        }
        return retorno;
    }

    public boolean vender(int cant) {
        boolean exito = false;
        if (this.cantEnStock - cant >= 0) {
            this.cantEnStock -= cant;
            exito = true;
            if (getEnOferta()) {
                setEnOferta();
            }
        }
        return exito;
    }

    private boolean revisarOferta() {
        boolean oferta = false;
        if (getCantEnStock() > 50) {
            oferta = true;
        }
        return oferta;
    }
}
