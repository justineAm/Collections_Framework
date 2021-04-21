/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author 2ndyrGroupA
 */
public class number4 {
    
//    Why should we opt for isEmpty()over size?
//    
//    Because base on my research it is more expressive 
//    (the code is easier to read and to maintain)it is faster, 
//    in some cases by orders of magnitude.
//    two examples from the jdk where this is extremely visible would be the 
//    concurrentlinkedqueue and navigablemap / navigableset . 3
//    all of these implement the “size” method by iterating through 
//    the collection and because of this, 
//    calling size gets increasingly slower as the number of elements.
//    So basically isEmpty() is a clearer definition of what it is you
//     actually care about and are testing and so makes your 
//     code a bit more easily understandable.

    
}
