import java.io.IOException;
import java.util.ArrayList;
public class Filter  {
    DataInput dataInput = new DataInput();
    ArrayList<Double> data;
    {
        try {
            data = dataInput.fileReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    int size = data.size();
    int window = CreateMAWindow.createMAWindow();
    ArrayList<Double> sma = new ArrayList<>();
    ArrayList<Double> medfilter = new ArrayList<>();
    ArrayList<Double> supportList = new ArrayList<>();
    double sum = 0;
    int count1 = 0;
    int count2 = window;
    double value = 0;
    int supportValue1;
    int supportValue2;
}
