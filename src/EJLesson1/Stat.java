package EJLesson1;

import java.util.Arrays;
import java.util.List;

//Возможна левая граница в виде класса и нескольких интерфейсов
//<T extends Number & Clonable & Serializable>
public class Stat<T extends Number> {
    private List<T> nums;

    public Stat(T... nums){
        this.nums = Arrays.asList(nums);
    }

    public double avg(){
        double sum = 0;
        for (T num : nums){
            sum += num.doubleValue();
        }
        return sum / nums.size();
    }

    public boolean sameAvg(Stat<? extends Number> anotherStat){
        return Math.abs(avg() - anotherStat.avg()) < 0.00001;
    }

    //плохой пример
    public void addAll(List<? extends Number> data){
        nums.addAll((List<T>)data);
    }
}
