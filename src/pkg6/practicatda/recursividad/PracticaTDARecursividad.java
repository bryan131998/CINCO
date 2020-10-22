package pkg6.practicatda.recursividad;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diaz
 */
public class PracticaTDARecursividad {

    public static void main(String[] args) {
        PracticaTDARecursividad objEsc = new PracticaTDARecursividad ();
        objEsc.bajarEscalera(6);
        
        
       
    }
    
    //creando el metodo para bajar una escalara de manera recursiva
    public void bajarEscalera(int escalones){
        if (escalones<0){
            System.out.println("no hay mas escalones para bajar...");
        }else {
            try{
                Thread.sleep(500); //hára hacer un retardo de medio segundo
                //dominio = escalones - 1
                System.out.println("bajando escalon"+ escalones);
                
                //haciendo uso de la recursividad par bajar el escalon
                bajarEscalera(escalones-1);
            }catch(InterruptedException ex){
                Logger.getLogger(PracticaTDARecursividad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

