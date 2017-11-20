package Mapa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Nacho
 */
public class Mapa extends Application {

    static String direccion;

//    public Mapa(String dir){
//        direccion=dir;
//        Application.launch(args);
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, String dir) {
        // TODO code application logic here
       direccion = dir;
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        WebView mw = new WebView();
        WebEngine e = mw.getEngine();
        e.load(direccion);

        VBox root = new VBox();
        root.getChildren().addAll(mw);

        Scene sc = new Scene(root, 800, 800);
        stage.setScene(sc);
        stage.show();
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

}
