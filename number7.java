/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.*;

/**
 *
 * @author 2ndyrGroupA
 */
public class number7 {

//    public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {
//        return new HashSet<T>() {
//            {
//                addAll(a);
//                addAll(b);
//            }
//        };
//    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet();
        set1.add(12);
        set1.add(14);
        set1.add(16);
        set1.add(18);
        set1.add(20);
        set1.add(22);
        set1.add(24);
        System.out.println("Set 1" + set1);
        HashSet<Integer> set2 = new HashSet();
        set2.add(12);
        set2.add(15);
        set2.add(16);
        set2.add(17);
        set2.add(20);
        set2.add(21);
        set2.add(24);
        System.out.println("Set 2" + set2);
        Set<Integer> result = new HashSet<>();
        for (Integer ele : set1) {
            if (!set2.contains(ele)) {
                result.add(ele);
            }
        }
        for (Integer ele : set2) {
            if (!set1.contains(ele)) {
                result.add(ele);
            }
        }
        System.out.println("Unique elements of set 1 and set 2 is : "
                + result);

    }

}
