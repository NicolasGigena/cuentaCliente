/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Hashtable;


public class ExceptionsMensajes {
    
    private Hashtable<String, String> errores = new Hashtable<String, String>();
    
    public void setError(String idError,String error){
    this.errores.put(idError, error);
    }
    
    public Hashtable getError(){
    return this.errores;
    }
    
    

    
    
}
