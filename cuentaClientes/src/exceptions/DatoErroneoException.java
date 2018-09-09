/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import exceptions.ExceptionsMensajes;

/**
 *
 * @author nicol
 */
        //hash
        // constructor de error normal
public class DatoErroneoException extends Exception{

    private ExceptionsMensajes exceptionsMensajes;
    
    public DatoErroneoException(ExceptionsMensajes exceptionsMensajes) {
        super();
        
        this.exceptionsMensajes = exceptionsMensajes;
        
    }

    public ExceptionsMensajes getExceptionsMensajes() {
        return exceptionsMensajes;
    }    
    
}
