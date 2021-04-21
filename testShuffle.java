/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import static exercise2.shuffleArray.randomize;

/**
 *
 * @author 2ndyrGroupA
 */
public class testShuffle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        randomize(arr, 5);
        randomize(arr, 4);
        
    }
}
