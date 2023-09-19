import java.util.*;

class Main
{
    public static void sort(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>=a[j+1])
                {
                    flag=1;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);    
        System.out.print("Enter n: ");    
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        for(int i: a)
        {
            System.out.print(i+" ");
        }
        System.out.println(""); 
        
        sort(a,n);
        
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
};
