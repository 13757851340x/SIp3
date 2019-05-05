package p3.p3.utils;

import p3.p3.model.DataTable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    List<DataTable> dataTables = new ArrayList<>();

    File archivo1 = new File("src/Practica_3_SSII_hechos1.csv");
    FileReader fr1 = new FileReader(archivo1);
    BufferedReader bf1 = new BufferedReader(fr1);

    File archivo2 = new File("src/Practica_3_SSII_hechos2.csv");
    FileReader fr2 = new FileReader(archivo2);
    BufferedReader bf2 = new BufferedReader(fr2);

    File archivo3 = new File("src/Practica_3_SSII_hechos3.csv");
    FileReader fr3 = new FileReader(archivo3);
    BufferedReader bf3 = new BufferedReader(fr3);


    String[] parts;


    public void separar_hecho1() {
        try {
            String lines;
            if ((lines = bf1.readLine()) != null) {
            }
            while ((lines = bf1.readLine()) != null) {
                DataTable c1 = new DataTable();
                parts = lines.split(";");
                c1.setId(Integer.parseInt(parts[0]));
                c1.setApellido(parts[2]);
                c1.setNombre(parts[1]);
                c1.setEmail(parts[3]);
                c1.setDia(Integer.parseInt(parts[4]));
                c1.setMes(parts[5]);
                c1.setAnyo(Integer.parseInt(parts[6]));
                c1.setPais(null);
                c1.setCapital(parts[7]);
                c1.setHabitantes(null);
                c1.setItem(parts[8]);
                c1.setDescripcion(parts[9]);
                c1.setImporte(Integer.parseInt(parts[10]));
                c1.setValoracion(Integer.parseInt(parts[11]));
                c1.setFechaPedido(parts[12]);
                dataTables.add(c1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void separar_hecho2() {
        try {
            String lines;
            if ((lines = bf2.readLine()) != null) {
            }
            while ((lines = bf2.readLine()) != null) {
                DataTable c2 = new DataTable();
                parts = lines.split(";");
                String[] apellidoNombre = parts[0].split(" ");
                c2.setApellido(apellidoNombre[1]);
                c2.setNombre(apellidoNombre[0]);
                c2.setEmail(parts[1]);
                String[] diaMesAnyo = parts[2].split(" de ");
                c2.setDia(Integer.parseInt(diaMesAnyo[0]));
                c2.setMes(diaMesAnyo[1]);
                c2.setAnyo(Integer.parseInt(diaMesAnyo[2]));
                c2.setPais(parts[3]);
                c2.setCapital(parts[4]);
                c2.setHabitantes(null);
                c2.setItem(parts[5]);
                c2.setDescripcion(parts[6]);
                c2.setImporte(Integer.parseInt(parts[8]));
                c2.setValoracion(Integer.parseInt(parts[7]));
                c2.setFechaPedido(parts[9]);
                dataTables.add(c2);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void separar_hecho3() {
        try {
            String lines;
            if ((lines = bf3.readLine()) != null) {
            }
            while ((lines = bf3.readLine()) != null) {
                DataTable c3 = new DataTable();
                parts = lines.split(";");
                String[] apellidoNombre = parts[0].split(",");

                c3.setApellido(apellidoNombre[0]);
                c3.setNombre(apellidoNombre[1].substring(1));
                c3.setEmail(parts[1]);
                c3.setDia(Integer.parseInt(parts[2]));
                c3.setMes(this.toMonth(parts[3]));
                c3.setAnyo(Integer.parseInt(parts[4]));
                c3.setPais(parts[5]);
                c3.setCapital(parts[6]);
                c3.setHabitantes(Integer.parseInt(parts[7]));
                c3.setItem(parts[8]);
                c3.setDescripcion(parts[9]);
                c3.setImporte(Integer.parseInt(parts[10]));
                c3.setValoracion(Integer.parseInt(parts[11]));
                c3.setFechaPedido(parts[12]);
                dataTables.add(c3);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Wrapper() throws FileNotFoundException, IOException {
    }

    public List<DataTable> getDataTables() {
        return this.dataTables;
    }

    private String toMonth(String mes) {
        switch (mes) {
            case "Ene.":
                return "enero";
            case "Feb.":
                return "febrero";
            case "Mar.":
                return "marzo";
            case "Abr.":
                return "abril";
            case "May.":
                return "mayo";
            case "Jun.":
                return "junio";
            case "Jul.":
                return "julio";
            case "Ago.":
                return "agosto";
            case "Sep.":
                return "septiembre";
            case "Oct.":
                return "octubre";
            case "Nov.":
                return "noviembre";
            case "Dic.":
                return "diciembre";
        }
        return "Error";
    }
}
