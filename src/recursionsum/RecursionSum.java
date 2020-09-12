/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionsum;

/**
 *
 * @author HP
 */
public class RecursionSum {

    /**
     * @param args the command line arguments
     */
    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         int number = 5;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }
    
}
