package EjercicioHerenciaCDs;

/**
 * El CDMp3 será una de las clases hijo de CD la cual se encaragará de almacenar archivos mp3
 */
public class CDMp3 extends CD{
    //declaramos los atributos especificos de los CD que contienen archivps mp3
    protected String nombre;
    protected int cantidad;

    public CDMp3(){

    }

    /**
     * constructor del objeto mp3 que heredará de la clase padre "CD"
     * @param nom el nombre del archivo mp3
     * @param cant la cantidad de archivos que habrá
     * @param capacidad la capacidad del disco en MB
     */
    public CDMp3(String nom, int cant, int capacidad){
        super(capacidad, "CDMp3");
        nombre = nom;
        cantidad = cant;
    }


    /**
     * metodo que mostrará todos los datos del objeto
     */
    public void mostrarDatos(){
        System.out.println("Tipo: " + tipo + ", Capacidad: " + capacidad + ", nombre: " + nombre +", cantidad: " + cantidad);
    }

    //Setters y getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
