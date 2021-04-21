/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.*;

/**
 *
 * @author 2ndyrGroupA
 */
public class numberArrays {

    public static void minToFront(ArrayList<Integer> numbers) {
   int minIndex = 0;
   for (int i = 0; i < numbers.size(); i++) {
       if (numbers.get(minIndex) > numbers.get(i)) {
           minIndex = i;
       }
   }
   
   int minValue = numbers.remove(minIndex);
   numbers.add(0, minValue);
   System.out.println(numbers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<Integer>();
        myarr.add(18);
        myarr.add(9);
        myarr.add(5);
        myarr.add(7);
        myarr.add(4);
        myarr.add(10);

        minToFront(myarr);
    }

}
