import java.util.Collections;

public class MedFilter extends Filter {
    public void calc(){
        for(int i = window; i<=size; i++) {
            for (int j = count1; j < count2; j++) {
                supportList.add(data.get(j));
                Collections.sort(supportList);
            }
            if (window % 2 == 1) {
                supportValue1 = (int) Math.ceil(window / 2);
                value = supportList.get(supportValue1);
            }
            if (window % 2 == 0) {
                supportValue1 = (int) Math.ceil(window / 2) - 1;
                supportValue2 = (int) Math.ceil((window / 2) + 1) - 1;
                sum = supportList.get(supportValue1) + supportList.get(supportValue2);
                value = sum / 2;
            }
            medfilter.add(value);
            sum = 0;
            count1 += 1;
            count2 += 1;
            supportList.clear();
        }
        System.out.println(medfilter);
    }
}
