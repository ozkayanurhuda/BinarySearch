package com.jetbrains;

public class BinarySearch {

    public static void main(String[] args) {
        int list [] = {-3,1,2,4,9,23};
        System.out.println(binarySearch(list,2));

    }

    private static int binarySearch(int[] list, int key) {
        int low =0;
        int high= list.length-1;
        while(high>=low) {
            int mid= (low+high)/2;
            if(key<list[mid])
                high=mid-1; //search in first half
            else if (key==list[mid])
                return mid;
            else
                low=mid+1; //search in second half
        }
        return -low-1; //high<low
    }
}
