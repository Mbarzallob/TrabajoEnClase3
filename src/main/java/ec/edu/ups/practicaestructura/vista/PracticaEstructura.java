/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practicaestructura.vista;

import ec.edu.ups.practicaestructura.modelo.Agenda;
import ec.edu.ups.practicaestructura.modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author SOPORTETICS
 */
public class PracticaEstructura {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner in = new Scanner(System.in);
        int opcion = 21341;
        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto por nombre");
            System.out.println("3. Eliminar contacto por nombre");
            System.out.println("4. Salir");
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    String nombre = in.nextLine();
                    System.out.println("Ingrese el telefono del contacto: ");
                    String telefono = in.nextLine();
                    agenda.agregarContacto(new Contacto(nombre, telefono));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto a buscar: ");
                    String nombreABuscar = in.nextLine();
                    Contacto contactoEncontrado = agenda.buscarPorNombre(nombreABuscar);
                    System.out.println(contactoEncontrado);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto a eliminar");
                    String nombreAEliminar = in.nextLine();
                    agenda.eliminarPorNombre(nombreAEliminar);
                    break;
                case 4:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 4);

    }
}
