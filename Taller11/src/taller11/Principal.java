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
        MenuNinios menuNinios1 = new MenuNinios("Cajita Feliz", 7, 1.50, 2.50);
        menuNinios1.establecerValorCancelarTotal();
        
        MenuNinios menuNinios2 = new MenuNinios("Croquetas",3.50,1.50,2.50);
        menuNinios2.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        MenuEconomico menuEcono = new MenuEconomico("Camarones",1,20);
        menuEcono.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        MenuDia menuDia = new MenuDia("Tacos",4,2,1.50);
        menuDia.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        MenuCarta menuCarta = new MenuCarta("Asado Argentino",5,4.50,1,15);
        menuCarta.establecerValorCancelarTotal();

        //-------------------------------------------------------------------
        menus.add(menuCarta);
        menus.add(menuDia);
        menus.add(menuNinios1);
        menus.add(menuNinios2);
        menus.add(menuEcono);
        c.establecerSubtotal();
        c.establecerIva(10);
        c.establecerValorCancelar();
        System.out.println("------------------------------------------------");
        System.out.println(c);
    }
}
