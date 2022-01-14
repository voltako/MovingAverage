public class CalcSMA extends Filter {
    public void calc() {
        for (int i = window; i <= size; i++) {
            for (int j = count1; j < count2; j++) {
                sum += data.get(j);
            }
            value = sum / window;
            sma.add(value);
            sum = 0;
            count1 += 1;
            count2 += 1;
        }
        System.out.println(sma);
    }
}
