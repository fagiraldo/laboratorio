/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabian.giraldo
 */
public class Servidor {
    public static void main(String arg[]){
        try {
            //Apertura del socket
            ServerSocket servidor = new ServerSocket(8090);
            //Escucha de peticiones
            while(true){
              Socket cliente = servidor.accept();
              Hilo hilo = new Hilo(cliente);
              //Creando nuevo hilo de ejecucion
              Thread ejecutar = new Thread(hilo);
              System.out.println("Iniciando nuevo hilo");
              ejecutar.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
