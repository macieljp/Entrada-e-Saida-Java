/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macieljp
 */
public class TesteFile {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\macieljp\\Desktop\\Arquivos java\\arquivo.txt");

        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("arquivo ja existe? " + exists);
            System.out.println("Permisão de leitura? " + file.canRead());
            System.out.println("Diretorio: " + file.getPath());
            System.out.println("diretorio absoluto: " + file.getAbsolutePath());
            System.out.println("Diretorio: " + file.isDirectory());
            System.out.println("ultima motificação no arqivo: " + new Date(file.lastModified()));  // file.lastModified() retorna um longe, fazemos um casting para capturar a Data

            if (file.exists()) {
                System.out.println(file.delete());
            }
        } catch (IOException ex) {
            Logger.getLogger(TesteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
