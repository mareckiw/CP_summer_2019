import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Homework4 {

    public static void main(String[] args) throws IOException {
        //String path = ".." + File.separator + "MYDIR/SUBDIR/myfile.txt";
        String path1 = "C:/Users/Marek/Desktop/Computer Programming/Homework4/GOOG.csv";
        String path2 = "C:/Users/Marek/Desktop/Computer Programming/Homework4/nowyplik/GOOG.csv";

        File plik = new File(path1); //???
        //typ nazwa
        File nowyplik = new File(path2);

        String cwd = System.getProperty("user.dir");

        String temp = System.getenv("TEMP");
        System.out.println(temp);
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(cwd);
        //nie wpływa na program

        Scanner fileScanner = new Scanner(plik);
        fileScanner.nextLine();
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine(); //wczytuje cala linijke
            String[] cells = line.split(","); //tablica, dzieli linijki przecinkami
            //System.out.println(cells[1]); //drukuje druga pozycje po przecinku
            //System.out.println(line); //drukuje cala wczytaną linie
            //obliczenia 4-1/1

           Double zmiana = (Double.valueOf(cells[4]) - Double.valueOf(cells[1]))/Double.valueOf(cells[1]);
            System.out.println(zmiana.toString());


            //BufferedWritter - metoda append albo coś podobnego - nie latwiej bd w innym pliku?
            // Overwrite existing file or append to it
            FileWriter fw = new FileWriter(nowyplik, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(line + "," + zmiana.toString());
            bw.newLine();
            bw.close();

        }

        System.out.println("Ilość znaków: ".concat(Long.toString(plik.length()))); //lepsza metoda niż "xxx" +

        System.out.println(plik.getAbsolutePath());
        System.out.println(plik.getCanonicalPath());
        System.out.println(plik.getParentFile());

        // file.


    }
}