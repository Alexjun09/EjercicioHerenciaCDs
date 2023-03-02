package EjercicioHerenciaCDs;

/**
 * El CDDatos será una de las clases hijo de CD la cual se encaragará de almacenar datos
 */
public class CDDatos extends CD {
    //declaramos los atributos especificos de los CD que contienen datos
    protected String identificador;
    protected String tipoDatos;

    public CDDatos() {

    }

    /**
     * constructor del objeto datos que heredará de la clase padre "CD"
     * @param iden el identificador de los datos
     * @param tipo el dipo de datos
     * @param capacidad la capacidad de alamacenamiendo
     */
    public CDDatos(String iden, String tipo, int capacidad) {
        super(capacidad, "CDDatos");
        identificador = iden;
        tipoDatos = tipo;
    }

    /**
     * metodo que mostrará todos los datos del objeto
     */
    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo + ", Capacidad: " + capacidad + ", identificador: " + identificador + ", Tipo de Datos: " + tipoDatos);
    }

    //setters y getters
    public String getIdentificador() {
        return identificador;
    }

    public String getTipoDatos() {
        return tipoDatos;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setTipoDatos(String tipoDatos) {
        this.tipoDatos = tipoDatos;
    }
}
