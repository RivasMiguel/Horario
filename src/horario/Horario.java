/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;
import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una hora, y te dire el horario");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora == 6){
                System.out.println("Despertar a las " + hora + " de la mañana");
            } else if(hora == 7){
                System.out.println("Entrar a la clase de administracion a las " + hora + " de la mañana");
            } else if(hora >= 8 && hora < 10){
                System.out.println("Entrar a la clases de organizacion Computacional de las 8 de la mañana hasta las 10 de la mañana");
            } else if(hora >= 10 && hora < 12){
                System.out.println("Entrar a clase de Fisica de las 10 de la mañana hasta las 12 de la mañana");
            } else if(hora == 12){
                System.out.println("Entrar a la clase de Herramientas Comutacionales a las " + hora + " de la tarde");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Comer y hacer tarea Desde la 1 pm hasta a las 3 pm");
            } else if(hora == 15){
                System.out.println("Dormir a las 3 de la tarde");
            } else if(hora >= 16 && hora < 18 ){
                System.out.println("Jugar videojuegos de las 4 de la tarde hasta a las 5 de la tarde");
            } else if(hora >= 18 && hora < 20){
                System.out.println("Leer y ayudar en los quehaceres de la casa desde las 5 hasta las 8 dela tarde");
            } else if(hora == 20){
                System.out.println("Cenar a partir de las 8 de la noche");
            } else if(hora >= 21 && hora < 23){
                System.out.println("Tres horas libres desde las 9 de la noche hasta las 12 de la noche");
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("Dormir desde las 12 de la noche, hasta las 6:30 de la mañana");
            }
        } else {
            System.out.println("Porfavor introduce una hora correcto, de 1 a 24 horas");
        }
    }
}
    
   
