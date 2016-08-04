/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import datos.Person;

/**
 * Se debe adaptar los tipos de retorno y los parametros de acuerdo a los requerimientos.
 * @author fabian.giraldo
 */
public interface IBaseDatos {
    public void almacenar(Person person);
     public void buscar();
}
