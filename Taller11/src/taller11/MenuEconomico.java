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

    private double descuento;

    public double obtenerDescuento() {
        return descuento;
    }

    public void establecerDescuento(double d) {
        descuento = d;
    }

    @Override
    public void establecerValorCancelarTotal() {

        valorMenu = valorInicialMenu - ((descuento * valorInicialMenu) / 100);
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s", super.toString());

        cadena = String.format("%s"
                + "\tDescuento: %.2f\n"
                + "\tValor Del Menu: %.2f\n"
                + "------------------------------------------------------------",
                cadena,
                obtenerDescuento(),
                valorMenu);
        return cadena;
    }
}
