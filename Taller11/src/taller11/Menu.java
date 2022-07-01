/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario iTC
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombre, double valor){
        nombrePlato = nombre;
        valorInicialMenu = valor;
    }
    public void establecerNomPlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorMenu(double v) {
        valorMenu = v;
    }

    public void establecerValorInicialM(double v) {
        valorInicialMenu = v;
    }

    public abstract void establecerValorCancelarTotal();

    public String obtenerNombPlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicialM() {
        return valorInicialMenu;
    }

    @Override
    public String toString() {
        String c = String.format(""
                + "\tNombre del plato: %s\n"
                + "\tValor del menu inicial: %.2f\n",
                 obtenerNombPlato(),
                 obtenerValorInicialM());
        return c;
    }
}
