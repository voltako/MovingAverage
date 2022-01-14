import java.io.IOException;
import java.util.ArrayList;
public abstract class Filter {
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
    ArrayList<Double> sma = new ArrayList<>();
    ArrayList<Double> medfilter = new ArrayList<>();
    ArrayList<Double> supportList = new ArrayList<>();
    int window = MovingAveragesApp.MAwindow();
    double sum = 0;
    int count1 = 0;
    int count2 = window;
    double value = 0;
    int supportValue1;
    int supportValue2;

    public abstract void calc();
}
