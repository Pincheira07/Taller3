import java.util.Scanner;

public class RAM {
    private String marca;
    private int capacidad;
    private int frecuencia;

    public RAM() {
        registrarMarca();
        registrarCapacidad();
        registrarFrecuencia();
    }

    public RAM(String marca, int capacidad, int frecuencia) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
    }

    private void registrarFrecuencia() {

        int cantidad =0;
        do {
            System.out.println("Ingrese la frecuencia en GHZ: ");
            cantidad = leerDatos();
        }while (!validarFrecuencia(cantidad));
        cantidad = this.frecuencia;
    }

    private void registrarCapacidad() {

        int cantidad =0;
        do {
            System.out.println("Ingrese la capacidad de la RAM: ");
            cantidad = leerDatos();
        }while (!validarCapacidad(cantidad));
        cantidad = this.capacidad;

    }

    @Override
    public String toString() {
        return "RAM{" + "marca:" + marca + ", capacidad:" + capacidad + ", frecuencia:" + frecuencia + '}';
    }

    private void registrarMarca() {
        String nombre = leerNombre();
        nombre = this.marca;

    }
    public static String leerNombre() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la marca de la RAM");
        return input.nextLine();
    }

    public static int leerDatos() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static boolean validarFrecuencia(int numero){
        return 1500 <= numero && numero <= 5000;
    }
    public static boolean validarCapacidad(int numero){
        return 2 <= numero && numero <= 32;
    }


    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getFrecuencia() {
        return frecuencia;
    }
}

