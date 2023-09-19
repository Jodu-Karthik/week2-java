import java.util.*;

class Main
{
    public static int linSearch(int a[],int n,int Ele)
    {
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==Ele)
            {
                ind=i;
                break;
            }
            
        }
        return ind;
    }
    
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
        
        sort(a,n);
        
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println(""); 
        
        System.out.print("Enter an Element to Search: ");
        int Ele=x.nextInt();
        int ind=linSearch(a,n,Ele);
        
        System.out.println("Element "+Ele+" is found at: "+ind);
    }
};
