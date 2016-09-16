/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halloween_party;

import java.util.Scanner;

/**
 *
 * @author webprog26
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        
        int t = Integer.parseInt(s);
        
        for(int i = 0; i < t; i++)
        {
            System.out.printf("%d\n", calculateResult(Integer.parseInt(scanner.nextLine())));
        }
    }
    
    public static int getHorizontalCuts(int attempts)
    {
        if(attempts % 2 == 0)
    {
        return attempts / 2;
    }

    return attempts / 2 + (attempts % (attempts / 2));
    }
    
    public static long calculateResult(int attempts)
    {
        int horizontalCuts = getHorizontalCuts(attempts);

    int verticalCuts = attempts - horizontalCuts;

    return (long) horizontalCuts * (long) verticalCuts;
    }
}
