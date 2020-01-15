package fi.academy;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderTurbo {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File file = new File("tiedosto.txt");
        Scanner lukija = new Scanner(file);

        while (lukija.hasNextLine()) {

            System.out.println(lukija.nextLine());
        }
    }
}
