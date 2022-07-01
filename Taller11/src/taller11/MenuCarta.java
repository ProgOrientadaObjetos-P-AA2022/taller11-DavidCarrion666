/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario iTC
 */
public class MenuCarta extends Menu {

    private double valorPorcionGuarnicio;
    private double valorBebida;
    private double porcentajeAdicional;

    public double obtenerValorPorcionGuarnicio() {
        return valorPorcionGuarnicio;
    }

    public void establecerValorPorcionGuarnicio(double v) {
        valorPorcionGuarnicio = v;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double v) {
        valorBebida = v;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void establecerPorcentajeAdicional(double p) {
        porcentajeAdicional = (p * obtenerValorMenu()) / 100;
    }

    @Override
    public void establecerValorCancelarTotal() {
        valorMenu = (valorInicialMenu + valorPorcionGuarnicio + valorBebida)
                + porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la carta\n%s", super.toString());

        cadena = String.format("%s"
                + "\tValor porcion guarnicion: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor Del Menu: %.2f\n"
                + "------------------------------------------------------------",
                cadena,
                valorPorcionGuarnicio,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }

}
