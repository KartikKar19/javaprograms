import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {
        try {
            File file = new File("sample.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                int javaExp = Integer.parseInt(data[2]);
                int dataExp = Integer.parseInt(data[3]);
                String location = data[4];

                internship.checkEligibility(name, age, javaExp, dataExp, location);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}




