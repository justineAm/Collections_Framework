/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.*;
//import com.google.common.collect.Sets;
//import java.util.Set;

/**
 *
 * @author 2ndyrGroupA
 */
public class number6 {

    public static void main(String[] args) {
        // Creating first set
        HashSet<Integer> set1 = new HashSet();
        set1.add(12);
        set1.add(14);
        set1.add(16);
        set1.add(18);
        set1.add(20);
        set1.add(22);
        set1.add(24);
       HashSet<Integer> set2 = new HashSet();
        set2.add(12);
        set2.add(15);
        set2.add(16);
        set2.add(17);
        set2.add(20);
        set2.add(21);
        set2.add(24);

        // Creating second set
        // Using Guava's Sets.intersection() method
//        Set<Integer>
//            answer = Set.intersection(set1, set2);
         
        // Displaying the intersection of set1 and set2
        System.out.println("Set 1: "
                + set1);
        System.out.println("Set 2: "
                + set2);
        
         set1.retainAll(set2);
        System.out.println("Set 1 intersection Set 2: "
                + set1);
        
    }

}
