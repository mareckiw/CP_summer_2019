
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCount_Homework6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String OUT_PATH = "C:/Users/Marek/Desktop/Computer Programming/dok1.txt";
        File dok1 = new File(OUT_PATH);

        Map m1 = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader(dok1))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split(" ");//wyjęcie poszczególnych wyrazów
                for (int i = 0; i < words.length; i++) {
                    if (m1.get(words[i]) == null) {
                        m1.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
                        newValue++;
                        m1.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }
        Map <String,String> sorted = new TreeMap<String,String>(m1);
        for (Object key : sorted.keySet()) {
            System.out.println("Wyraz:" + key + " Ilość:" + m1.get(key));
        }
    }
}