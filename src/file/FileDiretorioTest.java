/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author macieljp
 */
public class FileDiretorioTest {

    public static void main(String[] args) {

        File diretorio = new File("folder"); //criar obj diretorio
        boolean mkdir = diretorio.mkdir(); //caso diretorio ja esteja criado retorna false
        System.out.println("Diretorio criado: " + mkdir);

        File arquivo = new File(diretorio, "arquivo.txt");

        try {
            boolean newFile = arquivo.createNewFile();
            System.out.println("Arquivo criado? " + newFile);

            File arquivoRenomado = new File("arquivo renomado.txt");
            boolean renamed = arquivo.renameTo(arquivoRenomado); //renomeia arquivo
            System.out.println("Renomeado? " + renamed);

            File diretorioRenomado = new File("diretorioRenomado"); // 
            boolean diretorioRenamed = diretorio.renameTo(diretorioRenomado);
            System.out.println("Diretorio renomado? " + diretorioRenamed); //renomeia diretorio

        } catch (IOException e) {
            e.getStackTrace();
        }

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
