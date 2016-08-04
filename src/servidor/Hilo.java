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
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabian.giraldo
 */
public class Hilo implements Runnable{
    private Socket cliente; 
    private BufferedReader lectura;
    private PrintWriter  salida;
    public Hilo (Socket cliente){
      this.cliente = cliente;
      InputStream flujoEntrada = null;
      OutputStream flujoSalida = null;
      try {
           flujoEntrada = cliente.getInputStream();
           flujoSalida = cliente.getOutputStream();
      } catch (IOException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
      }
          
       //Flujos modo caracter
      this.lectura = new BufferedReader(new InputStreamReader(flujoEntrada));
      this.salida = new PrintWriter(flujoSalida);
      
    }
    @Override
    public void run() {
        char[] chbuff = new char[1024];
        try {
        this.lectura.read(chbuff);
         System.out.println(chbuff);
         //Interpretacion del mensaje
         
         
        } catch (IOException ex) {
              Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Logica de Negocio
        //Respuesta al usuario.
        salida.println(chbuff);
        salida.flush();
      
        //Cerrar los flujos
        try{
        this.lectura.close();
        this.salida.close();
        cliente.close();
        }catch(Exception e){
          e.printStackTrace();
        }
    }
    
}
