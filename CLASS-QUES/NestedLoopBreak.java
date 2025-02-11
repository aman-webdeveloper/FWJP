import java.util.Scanner;

public class NestedLoopBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------");
        
        aa:
        for (int i = 1; i <= 5; i++) {
            System.out.println("i : " + i);
            
            bb:
            for (int j = 1; j <= 5; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (j == 3)
                        break aa;
                    else if (j == 5)
                        break bb;
                    
                    System.out.println("j : " + j);
                    System.out.println("k : " + k);
                }
            }
        }
        
        sc.close();
    }
}
