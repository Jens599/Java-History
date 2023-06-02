import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yazzoo
 */
public class BinarySearch {
    public Data binarySearch(ArrayList<Data> list, int low, int high, double value){
        if(low <= high){
            int mid = (low + high) / 2;
            if(list.get(mid).price == value){
                return list.get(mid);
            }else if (list.get(mid).price < value){
                return binarySearch(list,mid+1,high,value);
            }else {
                return binarySearch(list, low, mid - 1, value);
            }
        }else {
            return null;
        }
    }

}
