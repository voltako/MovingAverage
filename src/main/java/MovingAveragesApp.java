import java.util.Scanner;

public class MovingAveragesApp {
    public static void main(String[] args) {
        CalcSMA calcSMA = new CalcSMA();
        calcSMA.calc();
        MedFilter medFilter = new MedFilter();
        medFilter.calc();
    }
    public static int MAwindow(){
        Scanner scanner = new Scanner(System.in);
        int window = 3;
        return window;
    }
}

