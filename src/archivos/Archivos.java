/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre [] = {
            "Ricardo",
            "Jorge",
            "Pedro",
            "Fernnado",
            "Juan",
            "Oscar",
            "Angel",
            "Eduardo",
            "Maria",
            "Paola",
            "Alejandra",
            "Alba",
            "Sonia",
            
        };
                for(int nom = 0; nom < nombre.length; nom++){
        try {
        //imprimimos los nombres en el archivo
        Files.write(Paths.get("nombres.txt"),
                ( nombre[nom] + "\r\n").getBytes(),
                StandardOpenOption.APPEND);
        //System.out.println(nombres[nom]);
        }catch (IOException e){}   
         }
             
         
        try{
            //Todo code application logic here
            Scanner in = new Scanner(
            new FileReader("Archivo.txt"));
       while(in.hasNext()){
           System.out.println(in.nextLine());
       }
       in.close();
    } catch (FileNotFoundException ex) {
            System .err.println("NO SE ENCONTRO EL ARCHIVO");
           
    }      
     //Escribir en el archivo
     try{
         Files.write(
                Paths.get("Archivo.txt"),
                 ("\r\n" + "Luis Alberto Gonzalez Ramirez").getBytes(),
                 StandardOpenOption.APPEND);
     }catch (IOException e) {
         //exception handling left as an exercise for the reader
     }
     
     
}
}
        
        
    
    
    
    


