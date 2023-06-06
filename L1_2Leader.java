package practical;
import java.util.Scanner;

public class L1_2Leader {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(j==5)
                {
                    System.out.println();
                    System.out.print(i);
                    continue;
                }    
                if(j==1 || j==2 || j==3 || j==6 || j==7 || j==8 )
                {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(i);
            }
            System.out.println();
            for(int j=0;j<5;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print(x);
        //     }
        //     x++;
        //     System.out.println();
        // }
        

    }
}


