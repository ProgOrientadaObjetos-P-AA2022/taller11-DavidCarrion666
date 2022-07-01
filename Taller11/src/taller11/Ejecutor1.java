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
        MenuNinios menuNinios1 = new MenuNinios("Ninio 01", 2.00, 1.00, 1.50);
        menuNinios1.establecerValorInicialM(2.00);
        menuNinios1.establecerValorCancelarTotal();

        // -------------------------------------------------------------------
        MenuNinios menuNinios2 = new MenuNinios("Ninio 02", 3.00, 1.00, 1.50);
        menuNinios2.establecerValorCancelarTotal();

        // ------------------------------------------------------------------
        MenuEconomico menuEco = new MenuEconomico("Econo 001", 4.00, 25.00);
        menuEco.establecerValorCancelarTotal();

        // -------------------------------------------------------------------
        MenuDia menuDia1 = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        menuDia1.establecerValorCancelarTotal();

        // -------------------------------------------------------------------
        MenuCarta menucarta = new MenuCarta("Carta 001", 6.0, 1.50, 2.00, 10.00);
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
