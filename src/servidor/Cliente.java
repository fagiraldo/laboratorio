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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabian.giraldo
 */
public class Cliente {
  public static void main(String arg[]){
      try {
          String cadenaUsuario="";
          //Establecimiento conexion.
          Socket cliente = new Socket("localhost",8090);
          
          //Apertura de los flujos
          //Apertura de flujos
            InputStream flujoEntrada = cliente.getInputStream();
            OutputStream flujoSalida = cliente.getOutputStream();
            
            //Flujos modo caracter
            BufferedReader lectura = new BufferedReader(new InputStreamReader(flujoEntrada));
            PrintWriter salida = new PrintWriter(flujoSalida);
            
            //lectura de datos de los usuarios.
            BufferedReader lecturaUsuario = new BufferedReader(new InputStreamReader(System.in));
            
            while(true){
                System.out.println("Texto a enviar:" );
                cadenaUsuario = lecturaUsuario.readLine();
                System.out.println("Texto a enviar: " + cadenaUsuario);
                //Enviando datos
                salida.println(cadenaUsuario);
                salida.flush();
                
                //Recepcion de datos
                cadenaUsuario = lectura.readLine();
                System.out.println(cadenaUsuario);
                        
            }
          
      } catch (IOException ex) {
          Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
      }
    
  
  }    
}
