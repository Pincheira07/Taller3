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


    private void registrarFrecuencia() {
        System.out.println("Ingrese la frecuencia en GHZ: ");



    }

    private void registrarCapacidad() {
        System.out.println("Ingrese la capacidad de la RAM: ");

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
        return 0 <= numero && numero <= 255;
    }

    public String getMarca() {
        return marca;
    }


}

