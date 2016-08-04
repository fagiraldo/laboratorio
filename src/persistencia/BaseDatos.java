/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import datos.Person;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Se debe completar para realizar un CRUD
 *  C: Create
 *  R: Read
 *  U: Update Como van a actualizar la informacion que ya esta almacenada en los archivos
 *  D: Delete Como van a eliminar la informacion que ya esta almacenado en los archivo.
 * @author B106 PC-11
 */
public class BaseDatos implements IBaseDatos{
    
    /**
     * Se debe adaptar basado en la universidad que se esta gestionando.
     * @param person Persona que se va a persistir 
     */
    public void almacenar(Person person){
        FileWriter escritura = null;
        try {
            //Se debe adaptar basado en la informacion de la universidad sobre la cual se va a trabajar.
            File archivo = new File("hola.txt");
            if(archivo.exists()){
                System.out.println("existe");
            }else{
              archivo.createNewFile();
            }   
        //Escritura modo Append (Adicionar al final del archivo)     
        escritura = new FileWriter(archivo,true);
        escritura.write(person.toString() + "\n");
        escritura.flush();
        escritura.close();
           
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                escritura.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    
    }
    
    /**
     * Se debe proponer esquemas de almacenamiento basado en el uso de estructuras de datos.
     * Ejemplo: Que pasa si almaceno como una lista enlazada vrs un arbol.
     * Deben pensar como agilizar el proceso de busqueda basado en lo aprendido en estructuras de datos.
     * Que pasa si al mismo tiempo, se estan insertando y se esta buscando. Como se puede resolver esto.
     */
    public void buscar(){
    
    
    }
    
}
