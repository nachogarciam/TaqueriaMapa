/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import PersistenciaMapa.PersistenciaMapa;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nacho
 */
public class mainprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        PersistenciaMapa pm=new PersistenciaMapa();
//        pm.ConsultarUbicacion(args, "Rio colorado 645 obregon");
        Mapa m = new Mapa();
        

        m.main(args,"https://www.google.com/");
    }

}
