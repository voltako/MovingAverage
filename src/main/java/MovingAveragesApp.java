import java.util.Scanner;

public class MovingAveragesApp {
    public static void main(String[] args) {
        CalcSMA calcSMA = new CalcSMA();
        calcSMA.calc();
        MedFilter medFilter = new MedFilter();
        medFilter.calc();
    }
    public static int MAwindow(){
        System.out.println("Введите окно: ");
        Scanner scanner = new Scanner(System.in);
        int window = scanner.nextInt();
        return window;
    }
}

