import java.util.ArrayList;
import java.util.Scanner;

public class Computador {
    private String marca;
    private String modelo;
    public ArrayList<RAM> memoriasRam = new ArrayList<>();

    public Computador() {
        asignarMarca();
        asignarModelo();
        asignarRAM();

    }

    private void asignarMarca() {
        System.out.println("Ingrese la marca");
        String nombre = leerNombre();
        nombre = this.marca;
    }

    private void asignarModelo() {
        System.out.println("Ingrese el modelo");
        String nombre = leerNombre();
        nombre = this.modelo;
    }

    private void asignarRAM() {
        System.out.println("¿Que memoria quiere agregar?");

    }

    public static String leerNombre() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}