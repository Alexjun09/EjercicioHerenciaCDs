package EjercicioHerenciaCDs;

/**
 * La clase CD será un objeto abstracto el cual el resto de objetos heredarán
 */
public abstract class CD {
    //declaramos los atributos del objeto y los hacemos protected para que las clases hijo puedan acceder a ellos
    protected int capacidad;
    protected String tipo;

    public CD() {

    }

    /**
     * constructor del objeto CD
     * @param cap la capacidad que tiene el disco de alamacenar datos
     * @param tip el tipo de datos que almacenará el disco
     */
    public CD(int cap, String tip) {
        capacidad = cap;
        tipo = tip;
    }

    /**
     * declaramos el metodo mostrardatos para que luego los metodos de las clases hijo funcionen
     */
    public void mostrarDatos(){};

    //setters y getters para acceder a los datos

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }
}
