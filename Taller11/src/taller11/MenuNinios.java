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

    public MenuNinios(String nombrePlato, double valorMenu, double vH, double vP) {
        super(nombrePlato, valorMenu);
        valorHelado = vH;
        valorPastel = vP;
    }

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
        String cadena = String.format("Menu Para Ninios\n%s", super.toString());

        cadena = String.format("%s"
                + "\tValor Helado: %.2f\n"
                + "\tValor Pastel: %.2f\n"
                + "\tValor Del Menu:  %.2f\n"
                + "------------------------------------------------------------",
                cadena,
                valorHelado,
                valorPastel,
                valorMenu);
        return cadena;
    }

}
