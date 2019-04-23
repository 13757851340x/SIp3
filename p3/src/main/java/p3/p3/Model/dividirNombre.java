package p3.p3.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class dividirNombre {


    File archivo = new File ("./../Data/Practica_3_SSII_hechos3.csv");
    FileReader fr = new FileReader (archivo);
    BufferedReader br = new BufferedReader(fr);

    public dividirNombre() throws FileNotFoundException {
    }
}
