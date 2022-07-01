/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class Ejecutor1 {

    public static void main(String[] args) {

        ArrayList<Menu> menus = new ArrayList<>();
        Cuenta c = new Cuenta();

        c.EstablecerMenu(menus);
        c.establecerNombreCliente("Rene Elizalde");

        // -------------------------------------------------------------------
        MenuNinios menuNinios1 = new MenuNinios();
        menuNinios1.establecerNomPlato("Ninio 01");
        menuNinios1.establecerValorInicialM(2.00);
        menuNinios1.establecerValorHelado(1.00);
        menuNinios1.establecerValorPastel(1.50);
        menuNinios1.establecerValorCancelarTotal();

        // -------------------------------------------------------------------
        MenuNinios menuNinios2 = new MenuNinios();
        menuNinios2.establecerNomPlato("Ninio 02");
        menuNinios2.establecerValorInicialM(3.00);
        menuNinios2.establecerValorHelado(1.00);
        menuNinios2.establecerValorPastel(1.50);
        menuNinios2.establecerValorCancelarTotal();

        // ------------------------------------------------------------------
        MenuEconomico menuEco = new MenuEconomico();
        menuEco.establecerNomPlato("Econo 001");
        menuEco.establecerValorInicialM(4.00);
        menuEco.establecerDescuento(25.00);
        menuEco.establecerValorCancelarTotal();

        // -------------------------------------------------------------------
        MenuDia menuDia1 = new MenuDia();
        menuDia1.establecerNomPlato("Dia 001");
        menuDia1.establecerValorInicialM(5.00);
        menuDia1.establecerValorPostre(1.00);
        menuDia1.establecerValorBebida(1.00);
        menuDia1.establecerValorCancelarTotal();

        // -------------------------------------------------------------------
        MenuCarta menucarta = new MenuCarta();
        menucarta.establecerNomPlato("Carta 001");
        menucarta.establecerValorInicialM(6.0);
        menucarta.establecerValorPorcionGuarnicio(1.50);
        menucarta.establecerValorBebida(2.00);
        menucarta.establecerPorcentajeAdicional(10.00);
        menucarta.establecerValorCancelarTotal();

        menus.add(menuNinios1);
        menus.add(menuNinios2);
        menus.add(menuEco);
        menus.add(menuDia1);
        menus.add(menucarta);
        c.establecerSubtotal();
        c.establecerIva(10);
        c.establecerValorCancelar();
        System.out.println("------------------------------------------------");
        System.out.println(c);

    }
}
