/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;
import java.util.*; 

/**
 *
 * @author 2ndyrGroupA
 */
public class shuffleArray {
   
    static void randomize(int arr[], int n) {
        Random r = new Random();
        for (int i = n - 1; i > 0; i--) {

            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        System.out.println("The array List after the shuffle"+Arrays.toString(arr));
    }
    
}

    

