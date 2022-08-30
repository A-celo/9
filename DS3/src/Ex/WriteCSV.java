package Ex;

import java.util.*;
import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws IOException {

        Scanner keyb = new Scanner(System.in);

        String cve = null;
        String name = null;
        String dob = null;
        String zona = null;

        System.out.println("Clave: ");
        cve = keyb.nextLine();

        System.out.println("Nombre: ");
        name = keyb.nextLine();

        System.out.println("Fecha de nacimiento: ");
        dob = keyb.nextLine();

        System.out.println("Zona: ");
        zona = keyb.nextLine();

        System.out.printf("%s, %s, %s, %s%n", cve, name, dob, zona);

        FileWriter fileWriter;
        PrintWriter outputFile = null;

        fileWriter = new FileWriter("Vendor.csv");
        outputFile = new PrintWriter(fileWriter);
        outputFile.printf("%s, %s, %s, %s%n",cve, name, dob, zona);
        outputFile.close();

    }
}
