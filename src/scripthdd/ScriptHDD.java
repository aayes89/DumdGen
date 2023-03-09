/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scripthdd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class ScriptHDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre para la imagen del HDD");
        FileWriter fw = null;
        try {
            fw = new FileWriter(in.nextLine());
            int granular = 516096;
            System.out.println("Ingrese el tamanno deseado de la imagen en bytes");
            int size = in.nextInt();
            if (size % granular != 0) {
                size = ((size / granular) + 1) * granular;
            }
            System.out.println("Tamanno establecido a: " + size);
            while(size!=0){
                fw.write('\0');
                size--;
            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
