// Programa realizado para la clase de Arquitectura de Software 
// Por Sara López Marín
// Junio 2025

import java.util.Scanner;       
import java.io.FileWriter;      // pa escribir en el archivo
import java.io.IOException;    

public class Arq_Soft_Tutorial_001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        String archivo = "nombresTarea.txt";

        try {
            // abrir el archivo pa agregar texto sin borrar lo ade antes
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.write(nombre + "\n");
            escritor.close();
            System.out.println("Nombre guardado exitosamente");
        } 
        catch (IOException e) {
            System.out.println("Hubo un error");
        }
        scanner.close();
    }
}
