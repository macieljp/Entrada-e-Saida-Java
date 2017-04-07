/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author macieljp
 */
public class FileWriterReaderTest {

    public static void main(String[] args) throws IOException {

        File file = new File("arquivo.txt");

        try (FileWriter fw = new FileWriter(file); //escreve no arquivo.txt
                FileReader fr = new FileReader(file)) { //le o arquivo.txt

// escrevendo no arquivo
            fw.write("escrevendo em arquivo \n e pulando uma linha");
            fw.flush();
//            fw.close();

// lendo no arquivo
            char[] in = new char[500];
            int size = fr.read(in);  // fr.read() retorna 
            System.out.print("Tamanho:" + size + "\n"); //mostrar o tamanho do array de char

            for (char c : in) {

                System.out.print(c);

            }
//            fr.close();

        } catch (IOException e) {
            e.getStackTrace();
        }

    }

}
