package EjercicioHerenciaCDs;

import java.util.ArrayList;
import java.util.Scanner;


public class UsoCD {
    //declaramos la coleccion fuera del main para que sea accesible desde todos los metodos incluido el main
    static ArrayList<CD> coleccion = new ArrayList<CD>();
    static Scanner sc = new Scanner(System.in);

    /**
     * Metodo que imprimirá el menu de opciones
     */
    public static void menu() {
        System.out.println("**Menu de opciones**");
        System.out.println("0. Crear y añadir un CDAudio");
        System.out.println("1. Crear y añadir un CDMp3");
        System.out.println("2. Crear y añadir un CDSoftware");
        System.out.println("3. Crear y añadir un CDDatos");
        System.out.println("4. Mostrar la coleccion");
        System.out.println();
    }

    /**
     * Metodo para crear y añadir un CD de tipo Audio a la coleccion
     */
    public static void CDAudio() {
        //pedimos y almacenamos los datos introducidos por pantalla
        System.out.println("Has escogido crear y añadir CDAudio");
        System.out.println("Introduce el titulo de la cancion");
        String titulo = sc.nextLine();
        System.out.println("Introduce el interprete de la cancicion");
        String interprete = sc.nextLine();
        System.out.println("Introduce la capacidad del CD (MB)");
        int capacidad = -1;
        //Verificamos que el dato introducido es un numero
        do {
            try {
                capacidad = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (capacidad < 1);
        //llamamos al constructor para crear un nuevo objeto con los datos previamente almacenados
        CDAudio audio1 = new CDAudio(titulo, interprete, capacidad);
        //lo añadimos a la coleccion
        coleccion.add(audio1);
        System.out.println();
    }

    /**
     * Metodo para crear y añadir un CD de tipo mp3 a la coleccion
     */
    public static void CDMp3() {
        //pedimos y almacenamos los datos introducidos por pantalla
        System.out.println("Has escogido crear y añadir CDMp3");
        System.out.println("Introduce el nombre del tipo de musica");
        String nombre = sc.nextLine();
        System.out.println("Introduce la cantidad de canciciones");
        int cantidad = -1;
        //Verificamos que el dato introducido es un numero
        do {
            try {
                cantidad = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (cantidad < 1);
        System.out.println("Introduce la capacidad del CD (MB)");
        int capacidad = -1;
        //Verificamos que el dato introducido es un numero
        do {
            try {
                capacidad = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (capacidad < 1);
        //llamamos al constructor para crear un nuevo objeto con los datos previamente almacenados
        CDMp3 audio1 = new CDMp3(nombre, cantidad, capacidad);
        //lo añadimos a la coleccion
        coleccion.add(audio1);
        System.out.println();
    }

    /**
     * Metodo para crear y añadir un CD de tipo Datos a la coleccion
     */
    public static void CDDatos() {
        //pedimos y almacenamos los datos introducidos por pantalla
        System.out.println("Has escogido crear y añadir CDDatos");
        System.out.println("Introduce el identificador");
        String identificador = sc.nextLine();
        System.out.println("Introduce el tipo de datos");
        String tipo = sc.nextLine();
        System.out.println("Introduce la capacidad del CD (MB)");
        int capacidad = -1;
        //Verificamos que el dato introducido es un numero
        do {
            try {
                capacidad = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (capacidad < 1);
        //llamamos al constructor para crear un nuevo objeto con los datos previamente almacenados
        CDDatos audio1 = new CDDatos(identificador, tipo, capacidad);
        coleccion.add(audio1);
        //lo añadimos a la coleccion
        System.out.println();
    }

    /**
     * Metodo para crear y añadir un CD de tipo software a la coleccion
     */
    public static void CDSoftware() {
        //pedimos y almacenamos los datos introducidos por pantalla
        System.out.println("Has escogido crear y añadir CDSoftware");
        System.out.println("Introduce el identificador");
        String identificador = sc.nextLine();
        System.out.println("Cuantas aplicaciones quieres añadir?");
        int anadir = -1;
        //Verificamos que el dato introducido es un numero
        do {
            try {
                anadir = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (anadir < 1);

        //Creamos un arraylist donde almacenaremos las aplicaciones
        ArrayList<String> software = new ArrayList<String>();

        //le pedimos al usuario que introduzca el nombre de las aplicaciones (tantas como previamente haya establecido)
        for (int i = 0; i < anadir; i++) {
            System.out.println("Aplicacion numero " + i);
            String aplicacion = sc.nextLine();
            software.add(aplicacion);
        }


        System.out.println("Introduce la capacidad del CD (MB)");
        int capacidad = -1;
        //Verificamos que el dato introducido es un numero
        do {
            try {
                capacidad = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (capacidad < 1);
        //llamamos al constructor para crear un nuevo objeto con los datos previamente almacenados
        CDSoftware audio1 = new CDSoftware(identificador, software, capacidad);
        //lo añadimos a la coleccion
        coleccion.add(audio1);
        System.out.println();
    }

    /**
     * metodo para mostrar la coleccion en un orden predeterminado
     */
    public static void mostrarColeccion() {
        System.out.println("**Imprimiendo coleccion**");
        //verificamos el tipo de datos que hay y los imprimimos en orden llamando al metodo mostrar datos
        for (CD i : coleccion) {
            if (i.getTipo().equals("CDAudio")) {
                i.mostrarDatos();
            }
        }
        for (CD i : coleccion) {
            if (i.getTipo().equals("CDMp3")) {
                i.mostrarDatos();
            }
        }
        for (CD i : coleccion) {
            if (i.getTipo().equals("CDSoftware")) {
                i.mostrarDatos();
            }
        }
        for (CD i : coleccion) {
            if (i.getTipo().equals("CDDatos")) {
                i.mostrarDatos();
            }
        }
        System.out.println();
    }

    /**
     * Metodo main
     *
     * @param args
     */
    public static void main(String[] args) {
        int valor = -1;

        //creamos un buble "infinito" en el cual introducimos un menu de opciones
        do {
            System.out.println("Que quieres hacer?");
            //llamamos al menu
            menu();
            //verificamos que el valor introducido es un numero valido
            do {
                try {
                    valor = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Valor introducido no valido, tiene que ser un numero entre el 0 y el 4, intentalo de nuevo");
                }
            } while (valor < 0 || valor > 4);

            //el menu con sus correspondientes metodos
            switch (valor) {
                case 0:
                    CDAudio();
                    break;
                case 1:
                    CDMp3();
                    break;
                case 2:
                    CDSoftware();
                    break;
                case 3:
                    CDDatos();
                    break;
                case 4:
                    mostrarColeccion();
                    break;
                case 5:
                    System.out.println("Terminando el sistema");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (valor != 5);

    }
}
