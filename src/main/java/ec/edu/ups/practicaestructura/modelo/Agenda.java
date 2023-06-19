/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicaestructura.modelo;

/**
 *
 * @author SOPORTETICS
 */
public class Agenda<T> {

    private ListaEnlazadaGenerico listaEnlazadaGenerico;

    public Agenda() {
        listaEnlazadaGenerico = new ListaEnlazadaGenerico<>();

    }

    public void agregarContacto(Contacto contacto) {
        listaEnlazadaGenerico.agregar(contacto);
    }

    public Contacto buscarPorNombre(T nombre) {
        NodoGenerico<Contacto<T>> nodoActual = listaEnlazadaGenerico.getCabeza();
        while (nodoActual != null) {
            Contacto<T> contacto = nodoActual.getElemento();
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }

    public void eliminarPorNombre(T nombre) {
        NodoGenerico<Contacto<T>> nodoAnterior = null;
        NodoGenerico<Contacto<T>> nodoActual = listaEnlazadaGenerico.getCabeza();

        while (nodoActual != null) {
            Contacto<T> contacto = nodoActual.getElemento();

            if (contacto.getNombre().equals(nombre)) {
                if (nodoAnterior == null) {
                    listaEnlazadaGenerico.setCabeza(nodoActual.getSiguiente());
                } else {
                    nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                }
                listaEnlazadaGenerico.setTamaño(listaEnlazadaGenerico.getTamaño() - 1);
                return;
            }

            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        }

    }

}
