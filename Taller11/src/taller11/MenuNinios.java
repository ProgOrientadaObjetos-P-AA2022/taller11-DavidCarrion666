/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario iTC
 */
public class MenuNinios extends Menu {

    private double valorHelado;
    private double valorPastel;

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public void establecerValorHelado(double v) {
        valorHelado = v;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    public void establecerValorPastel(double v) {
        valorPastel = v;
    }

    @Override
    public void establecerValorCancelarTotal() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Para Ninios\n%s\n", super.toString());

        cadena = String.format("%s\n"
                + "Valor Helado: %.2f\n"
                + "Valor Pastel: %.2f\n"
                + "------------------------------------------------------------",
                cadena,
                valorHelado,
                valorPastel);
        return cadena;
    }
}
