public class MovingAveragesApp {
    public static void main(String[] args) {
        CalcSMA calcSMA = new CalcSMA();
        calcSMA.calc();
        MedFilter medFilter = new MedFilter();
        medFilter.calc();
    }
}

