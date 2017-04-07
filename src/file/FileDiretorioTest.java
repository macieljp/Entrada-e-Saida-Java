/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;

/**
 *
 * @author macieljp
 */
public class FileDiretorioTest {

    public static void main(String[] args) {

        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio criado: " + mkdir);
        

        buscaArquivos();

    }

    public static void buscaArquivos() {
        File file = new File("C:\\Users\\macieljp\\Documents\\NetBeansProjects\\EntradaESaida");

        String[] list = file.list();

        for (String a : list) {
            System.out.println(a);
        }
    }

}
