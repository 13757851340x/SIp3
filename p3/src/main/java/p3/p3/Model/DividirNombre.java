package p3.p3.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DividirNombre {

    List<Hecho> hechos2 = new ArrayList<>();
    List<Hecho> hechos3 = new ArrayList<>();

    File archivo3 = new File ("Data/Practica_3_SSII_hechos3.csv");
    FileReader fr3 = new FileReader (archivo3);
    BufferedReader bf3 = new BufferedReader(fr3);

    File archivo2 = new File ("Data/Practica_3_SSII_hechos2.csv");
    FileReader fr2 = new FileReader (archivo2);
    BufferedReader bf2 = new BufferedReader(fr2);

    String[] parts;
    String[] apellidoNombre;
    String[] diaMesAnyo;


    public List<Hecho> separar_hecho2() {
        try {
            String lines;
            Hecho h2 = new Hecho();
            while ((lines = bf2.readLine()) != null) {
                System.out.println(lines);
                parts = lines.split(";");
                apellidoNombre = parts[0].split(" ");
                h2.setApellido(apellidoNombre[1]);
                h2.setNombre(apellidoNombre[0]);
                h2.setEmail(parts[1]);
                diaMesAnyo = parts[2].split(" de ");
                h2.setDia(Integer.parseInt(diaMesAnyo[0]));
                h2.setMes(diaMesAnyo[1]);
                h2.setAnyo(Integer.parseInt(diaMesAnyo[2]));
                h2.setPais(parts[3]);
                h2.setCapital(parts[4]);
                h2.setPoblacion(null);
                h2.setItem(parts[5]);
                h2.setDescripcion(parts[6]);
                h2.setImporte(Integer.parseInt(parts[8]));
                h2.setValoracion(Integer.parseInt(parts[7]));
                h2.setFechaPedido(parts[9]);
                hechos3.add(h2);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.hechos2;
    }

    public List<Hecho> separar_hecho3() {
        try {
            String lines;
            if((lines=bf3.readLine())!=null){}
            while ((lines = bf3.readLine()) != null) {
                Hecho h3 = new Hecho();
                parts = lines.split(";");
                apellidoNombre = parts[0].split(",");
                
                h3.setApellido(apellidoNombre[0]);
                h3.setNombre(apellidoNombre[1].substring(1));
                h3.setEmail(parts[1]);
                h3.setDia(Integer.parseInt(parts[2]));
                h3.setMes(parts[3]);
                h3.setAnyo(Integer.parseInt(parts[4]));
                h3.setPais(parts[5]);
                h3.setCapital(parts[6]);
                h3.setPoblacion(Integer.parseInt(parts[7]));
                h3.setItem(parts[8]);
                h3.setDescripcion(parts[9]);
                h3.setImporte(Integer.parseInt(parts[10]));
                h3.setValoracion(Integer.parseInt(parts[11]));
                h3.setFechaPedido(parts[12]);
                hechos3.add(h3);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.hechos3;
    }

    public DividirNombre() throws FileNotFoundException, IOException {
    }




}
