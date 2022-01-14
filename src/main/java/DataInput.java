import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataInput {
    ArrayList<Double> fileReader() throws IOException {
        FileReader fileIn = null;
        ArrayList<Double> data = new ArrayList<>();
        try{
            fileIn = new FileReader("C:\\Users\\karna\\IdeaProjects\\SMA\\src\\main\\java\\file.txt");
            Scanner scan = new Scanner(fileIn);
            while (scan.hasNextLine()){
                data.add(scan.nextDouble());
            }
        } finally {
            if(fileIn!= null){
                fileIn.close();
            }
        }
        return data;
    }

}
