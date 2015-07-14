/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathan
 */
public class ModulusFunction {
    public static void main(String[] args){
        int a = 7;
        int b = 4;
        
        System.out.printf("Recursive solution to %dmod%d is %d\n", b, a, modulus(b, a));
        
    }
    
    
    /**
     * @param a - modulee!
     * @param b - moduler!
     * @return integer
     * 
     *      Takes in two integers and returns the remainder.
     * 
     *  The logic here is simple. Modulus can be defined as a repetitive
     *  operation on its own parameters, and this operation can be defined as a
     *  series of difference operations. There are two steps to this operation:
     *  
     *  1 - If our 'modulee' (i.e. the smaller of the two INITIAL numbers) is
     *      larger than our 'moduler' (i.e. the larger of the two INITIAL
     *      numbers), then we return this value. THIS IS THE ESCAPE CONDITION.
     *  2 - Otherwise, we recursively call the modulus function until we reach
     *      a point where (modulee > moduler) evaluates to true.
     */
    public static int modulus(int a, int b){
        //If modulee is less than moduler, return modulee
        if(a < b){
            return a;
        }
        //Otherwise, recursively call modulus
        else{
            return modulus(a-b, b);
        }
    }
}
