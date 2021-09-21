package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        // precisa implementar as classes Closeable ou Autocloseable
        // são chamados na ordem inversa, neste exemplo Leitor2, Leitor1
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
