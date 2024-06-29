package DataStructure;
import java.util.ArrayList;
import java.util.List;

public class DataStructure{
    public static List<Integer> ft_if_odd(int[] arr){
        List <Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                result.add(arr[i]);
        }
        return (result);
    }
}
