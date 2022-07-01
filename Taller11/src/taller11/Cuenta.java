/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Cuenta {

    protected String nombreCliente;
    protected double iva;
    protected double valorCancelarTotal;
    protected double subtotal;
    protected ArrayList<Menu> menu;

    public double obtenerSubtotal() {
        return subtotal;
    }

    public void establecerSubtotal(double s) {
        subtotal = s;
    }

    public ArrayList<Menu> obtenerMenu() {
        return menu;
    }

    public void EstablecerMenu(ArrayList<Menu> m) {
        menu = m;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva() {
        iva = 0.10;
    }

    public double obtenerValorCancelarTotal() {
        return valorCancelarTotal;
    }

    public void establecerValorCancelar() {
        for (int i = 0; i < menu.size(); i++) {
            subtotal = subtotal + menu.get(i).obtenerValorMenu();
        }
        iva = subtotal * iva;
        valorCancelarTotal = subtotal + iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos De la cuenta\n"
                + "Nombre del cliente: %s\n",
                obtenerNombreCliente());

        for (int i = 0; i < obtenerMenu().size(); i++) {
            cadena = String.format("%s%s\n",
                    cadena,
                    obtenerMenu().get(i));
        }

        cadena = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Valor Del IVA: %.2f\n"
                + "Total a pagar: %.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelarTotal());

        return cadena;
    }
}
