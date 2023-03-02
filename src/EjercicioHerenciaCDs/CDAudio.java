package EjercicioHerenciaCDs;

/**
 * El CDAudio será una de las clases hijo de CD la cual se encaragará de almacenar audios
 */
public class CDAudio extends CD {
    //declaramos los atributos especificos de los CD que contienen audio
    protected String titulo;
    protected String interprete;

    public CDAudio() {

    }

    /**
     * constructor del objeto CDAudio que heredatá los atributos de la clase padre CD con "Super"
     * @param tit el titulo del audio
     * @param inter el interprete del audio
     * @param capacidad la capacidad de almacenamiento del disco
     */
    public CDAudio(String tit, String inter, int capacidad) {
        super(capacidad, "CDAudio");
        titulo = tit;
        interprete = inter;
    }

    /**
     * metodo que mostrará todos los datos del objeto
     */
    public void mostrarDatos(){
        System.out.println("Tipo: " + tipo + ", Capacidad: " + capacidad + ", titulo: " + titulo +", interprete: " + interprete);
    }

    //Setters y getters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInterprete() {
        return interprete;
    }
}
