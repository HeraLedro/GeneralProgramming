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
//        System.out.println(modulus(a, b));
//        System.out.println(modulus(b, a));
        int c;
        
        //Iterative version
        if(a < b){
            while(a <= b){
                b = b-a;
            }
            c = b;
        }
        else{
            while(b <= a){
                a = a-b;
            }
            c = a;
        }
        System.out.println("Iterative function: " + c);
        
        if(a > b){
            c = modulus(a, b);
        }
        else{
            c = modulus(b, a);
        }
        System.out.println("Recursive function: " + c);
        
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
