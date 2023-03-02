package EjercicioHerenciaCDs;

import java.util.ArrayList;

/**
 * El CDSoftware será una de las clases hijo de CD la cual se encaragará de almacenar software
 */
public class CDSoftware extends CD {
    //declaramos los atributos especificos de los CD que contienen software
    protected String identificador;
    protected ArrayList<String> listaAplicaciones = new ArrayList<>();

    public CDSoftware() {

    }

    /**
     * constructor del objeto software que heredará de la clase padre "CD"
     *
     * @param iden el identificador del software
     * @param lista la lista de aplicaciones
     * @param capacidad la capacidad de almacenamiento del disco
     */
    public CDSoftware(String iden, ArrayList lista, int capacidad) {
        super(capacidad, "CDSoftware");
        identificador = iden;
        listaAplicaciones = lista;
    }

    /**
     * metodo que mostrará todos los datos del objeto
     */
    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo + ", Capacidad: " + capacidad + ", identificador: " + identificador + ", Lista de Aplicaciones: " + listaAplicaciones);
    }

    //setters y getters
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setListaAplicaciones(ArrayList<String> listaAplicaciones) {
        this.listaAplicaciones = listaAplicaciones;
    }

    public String getIdentificador() {
        return identificador;
    }

    public ArrayList<String> getListaAplicaciones() {
        return listaAplicaciones;
    }
}
