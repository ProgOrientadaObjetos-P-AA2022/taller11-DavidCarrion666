/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario iTC
 */
public class MenuEconomico extends Menu {

    protected double descuento;

    public double obtenerDescuento() {
        return descuento;
    }

    public void establecerDescuento(double d) {
        descuento = (d * valorInicialMenu) / 100;
    }

    @Override
    public void establecerValorCancelarTotal() {
        valorMenu = valorInicialMenu - descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s\n", super.toString());

        cadena = String.format("%s\n"
                + "Descuento: %.2f\n",
                cadena,
                descuento);
        return cadena;
    }
}
