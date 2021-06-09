import java.util.ArrayList;
import java.util.Scanner;

public class Computador {
    private String marca;
    private String modelo;
    public ArrayList<RAM> memoriasRam = new ArrayList<>();

    public Computador() {
        asignarMarca();
        asignarModelo();
        agregarRAM();

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

    private void agregarRAM() {
        System.out.println("¿Que memoria quiere agregar?");
        do {
            memoriasRam.add(new RAM());
        }while (numeroMaximoMemorias());
    }
    private void eliminarRAM(){
        for (int i = 0; i < memoriasRam.size(); i++) {

        }
    }

    private void mostrarMemorias(){
        for (int i = 0; i < memoriasRam.size(); i++) {
            System.out.println(i);
        }
    }
    private boolean numeroMaximoMemorias(){
        return 1<= memoriasRam.size() && memoriasRam.size()<=6;
    }

    public static String leerNombre() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}