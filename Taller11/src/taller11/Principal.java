/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> menus = new ArrayList<>();
        Cuenta c = new Cuenta();

        c.EstablecerMenu(menus);
        c.establecerNombreCliente("David Carrion");

        //-------------------------------------------------------------------
        MenuNinios menuNinios1 = new MenuNinios();
        MenuNinios menuNinios2 = new MenuNinios();
        menuNinios1.establecerNomPlato("Cajita Feliz");
        menuNinios1.establecerValorInicialM(7);
        menuNinios1.establecerValorHelado(1.50);
        menuNinios1.establecerValorPastel(2.50);
        menuNinios1.establecerValorCancelarTotal();

        menuNinios2.establecerNomPlato("Croquetas");
        menuNinios2.establecerValorInicialM(3.50);
        menuNinios2.establecerValorHelado(1.50);
        menuNinios2.establecerValorPastel(2.50);
        menuNinios2.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        MenuEconomico menuEcono = new MenuEconomico();
        menuEcono.establecerNomPlato("Camarones");
        menuEcono.establecerValorInicialM(1);
        menuEcono.establecerDescuento(20);
        menuEcono.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        MenuDia menuDia = new MenuDia();
        menuDia.establecerNomPlato("Tacos");
        menuDia.establecerValorInicialM(4);
        menuDia.establecerValorPostre(2);
        menuDia.establecerValorBebida(1.50);
        menuDia.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        MenuCarta menuCarta = new MenuCarta();
        menuCarta.establecerNomPlato("Asado Argentino");
        menuCarta.establecerValorInicialM(5);
        menuCarta.establecerValorPorcionGuarnicio(4.50);
        menuCarta.establecerValorBebida(1);
        menuCarta.establecerPorcentajeAdicional(15);
        menuCarta.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        menus.add(menuCarta);
        menus.add(menuDia);
        menus.add(menuNinios1);
        menus.add(menuNinios2);
        menus.add(menuEcono);
        c.establecerValorCancelar();
        System.out.println("------------------------------------------------");
        System.out.println(c);
    }
}
