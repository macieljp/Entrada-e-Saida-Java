/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author macieljp
 */
public class BufferedTest {

    public static void main(String[] args) throws IOException {

        File file = new File("arquivo.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file));
             BufferedReader bw = new BufferedReader(new FileReader(file))) {

            // escrevendo no arquivo
            br.write("escrevendo em arquivo ");
            br.newLine();
            br.write("e pulando uma linha");
            br.flush();

            // lendo no arquivo
            String s = null;
            while ((s = bw.readLine()) != null) {
                System.out.println(s);

            }

        } catch (Exception e) {
        }

//        try {
//
//// escrevendo no arquivo
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter br = new BufferedWriter(fw);
//
//            br.write("escrevendo em arquivo ");
//            br.newLine();
//            br.write("e pulando uma linha");
//            br.flush();
//            br.close();
//
//// lendo no arquivo
//            FileReader fr = new FileReader(file);
//            BufferedReader bw = new BufferedReader(fr);
//
//            String s = null;
//            while ((s = bw.readLine()) != null) {
//                System.out.println(s);
//
//            }
//
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
    }

}
