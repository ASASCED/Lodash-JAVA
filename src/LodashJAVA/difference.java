package LodashJAVA;

import java.util.ArrayList;

public class difference {

    public int[] _difference(String[] arr1, String[] arr2) {
        ArrayList<Integer> end = new ArrayList();

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                end.add(i);
            }
        }

        int[] newPosition = new int[end.size()];

        for (int i = 0; i < newPosition.length; i++) {
            newPosition[i] = end.get(i);
        }

        return newPosition;
    }
    
    public String[] _drop(String[] arr, int _dropNumber) {
        ArrayList<String> end = new ArrayList();
        
        for (int i = _dropNumber; i < arr.length; i++) {
            end.add(arr[i]);
        }
        
        String[] dropped = new String[end.size()];
        
        for (int i = 0; i < end.size(); i++) {
            dropped[i] = end.get(i);
        }
        
        return dropped;
    }

}
