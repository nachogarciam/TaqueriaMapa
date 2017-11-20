/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaMapa;

import Mapa.Mapa;
import Interfaz.IMapas;
import Maps.Geocoding;
import Maps.ShowMaps;
import java.awt.geom.Point2D;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nacho
 */
public class PersistenciaMapa implements IMapas {

    private Geocoding ObjGeocoding = new Geocoding();
    private ShowMaps ObjShowMaps = new ShowMaps();

    @Override
    public void ConsultarUbicacion(String[] args, String direccion) {
        try {
            Point2D.Double resultado = ObjGeocoding.getCoordinates(direccion);
            String direccionMapa = ObjShowMaps.getURLMap(resultado.x, resultado.y);
            
            Mapa mapa=new Mapa();
            mapa.setDireccion(direccionMapa);
            mapa.main(args, direccionMapa);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PersistenciaMapa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(PersistenciaMapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
