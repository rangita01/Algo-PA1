package barbershop2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Barbershop2 {
    public static void main(String[] args) 
    {   
        Integer [] a=new Integer[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of d");
        int d=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            a[i]=0;
        }
        Integer [] svc=new Integer[5];
        System.out.println("Enter the number of customers");
        int n=sc.nextInt();
        System.out.println("Enter the 5 services ");
        
        for(int i=0;i<5;i++)
        {
            svc[i]=sc.nextInt();
        }
        System.out.println("Before service");
        System.out.println(Arrays.toString(a));
        for(int i=0;i<5;i++)
        {
            a[i]=a[i]+svc[i];
        }
        System.out.println("After service");
        System.out.println(Arrays.toString(a));
        n=n-5;
        n=n/5;
        while(n>0)
        {
            System.out.println("Enter the 5 services");
            for(int i=0;i<5;i++)
            {
                svc[i]=sc.nextInt();
            }
            Arrays.sort(svc, Collections.reverseOrder());
            for(int i=0;i<5;i++)
            {
                for(int j=i+1;j<5;j++)
                {
                    if(a[i]-a[j]>=d)
                    {
                        int temp=a[j];
                        for(int k=j;k>i;k--)
                        {
                            a[k]=a[k-1];
                        }
                        a[i]=temp;
                    }
                }
            }
            System.out.println("Before service");
            System.out.println(Arrays.toString(a));
            for(int i=0;i<5;i++)
            {
                a[i]=a[i]+svc[i];
            }
            System.out.println("After service");
            System.out.println(Arrays.toString(a));
            n--;
        }
        int sum=0,s=0;
        for(int b=0;b<5;b++)
        {
            sum+=a[b];
        }
        s=sum/5;
        System.out.println("S is"+s);
    }
}
  