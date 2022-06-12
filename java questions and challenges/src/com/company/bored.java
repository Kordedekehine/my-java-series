package com.company;

import java.util.Arrays;

public class bored {
    public static void main(String[] args) {
    //take a single array and split it into two array

        int[] inp = {1, 2, 3, 4, 5,6};
        int n = inp.length;

        int[] a = new int[(n + 1) / 2];
        int[] b = new int[n - a.length];

      for (int i = 0; i < n; i++){
          if (i < a.length){
              a[i] = inp[i];
          }else {
              b [i - a.length] = inp[i];
          }
      }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
