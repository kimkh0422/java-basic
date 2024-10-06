package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){

    }

    static int sum(int[] values){
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    static double average(int[] values){
        double total = 0;
        for(int i=0; i<values.length; i++){
            total += values[i];
        }
        return total/values.length;

    }

    static int min(int[] values){
        int min = values[0];
        for(int i=0; i<values.length; i++){
            if(min>i){
                min = values[i];
            }
        }
        return min;
    }

    static int max(int[] values){
        int max = values[0];
        for(int i=0; i<values.length; i++){
            if(max<i){
                max = values[i];
            }
        }
        return max;
    }
}
