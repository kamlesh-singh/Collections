import java.util.*;
public class Ans1 {
    public static void main(String[] args) {
        List<Float> arr = new ArrayList<>();
        arr.add(1.1f);
        arr.add(2.2f);
        arr.add(3.3f);
        arr.add(4.4f);
        arr.add(5.5f);

        float sum =0f;

        for(float i : arr){
            sum +=i;
        }

        System.out.println("Sum  : " + sum);
    }
}
