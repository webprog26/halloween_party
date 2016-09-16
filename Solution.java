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
        printResults(getUserInput(scanner), scanner);
        
        
    }
    
    public static int getHorizontalCuts(int attempts){
        if(attempts % 2 == 0)
        {
        return attempts / 2;
        }

        return attempts / 2 + (attempts % (attempts / 2));
    }
    
    public static long calculateResult(int attempts){
        int horizontalCuts = getHorizontalCuts(attempts);

        int verticalCuts = attempts - horizontalCuts;

    return (long) horizontalCuts * (long) verticalCuts;
    }
    
    public static int getUserInput(Scanner scanner)
    {
      return Integer.parseInt(scanner.nextLine());
    }
    
    public static void printResults(int t, Scanner scanner)
    {
        for(int i = 0; i < t; i++)
        {
            System.out.printf("%d\n", calculateResult(Integer.parseInt(scanner.nextLine())));
        }
    }
}
