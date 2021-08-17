package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FilerLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FilerLoader filerLoader = new FilerLoader();
        databaseLoader.load();
        filerLoader.load();
    }

}
