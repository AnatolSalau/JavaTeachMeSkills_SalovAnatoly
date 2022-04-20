package HW_4_Arrays;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CreateHashMap {
    public LinkedHashMap<String, Integer> getHashMapMaxMinMiddleValuesFromArray(int[] array) {

    LinkedHashMap<String, Integer> result = new LinkedHashMap<String,Integer>();
    result.put("Minimum value",0);
    result.put("Maximum value",0);
    result.put("Middle value",0);
//    middle value
        Integer middle = 0;
        for (int i = 0; i < array.length; i++) {

             middle += array[i];
        }
        middle = middle/array.length;
        result.replace("Middle value",middle);
// min and max value
        Integer max = array[0];
        Integer min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            } else {
                continue;
            }
        }
        result.replace("Minimum value",min);
        result.replace("Maximum value",max);

        return result;
    }

    public void printHashMap (LinkedHashMap<String, Integer> entered) {
        for(Map.Entry<String, Integer> item : entered.entrySet()) {

            System.out.printf("Key: %s  Value: %d \n", item.getKey(), item.getValue());
        }
    }
}
