import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input total number
        System.out.println("Nth num:");
        int n=sc.nextInt();
        int numlf=n;
        int mvdelloc=2;
        int arr[]=new int[n+1];

        // Insert value to the array
        for(int i=1;i<=n;++i)
        {
            arr[i]=i;
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //lucky serise logic
        int delloc=2;
        while (delloc<=numlf )
        {
            //Delete array
            int temp=delloc;
            while(delloc<=n)
            {
                if(arr[delloc]!=0)
                {
                    arr[delloc]=0;
                    numlf--;
                }
                delloc+=temp;
            }
            // Arrange Array
            for(int j=1;j<=n-numlf;++j)
            {
                for(int k=1;k<=n;++k)
                {
                    if(arr[k]==0 && k+1<=n)
                    {
                        arr[k]=arr[k+1];
                        arr[k+1]=0;
                    }
                }
            }
            // Display Arrange array
            for(int k=1;k<=numlf;++k)
            {
                System.out.print(arr[k]+" ");
            }
            delloc=arr[mvdelloc];
            ++mvdelloc;
            System.out.println();
        }
        //Display final result
        System.out.println();
        System.out.print("your luck NUM : ");
        for(int i=1;i<=numlf;++i)
        {
            System.out.print(arr[i]+" ");
        }
    }
}