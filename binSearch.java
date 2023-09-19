import java.util.*;

class Main
{
    public static int binSearch(int a[],int n,int Ele)
    {
       int l=0,h=n-1;
       while(l<=h)
       {
            int mid=(l+h)/2;
            if(Ele==a[mid]) return mid;
            else if(Ele<a[mid]) h=mid-1;
            else l=mid+1;
       }
       return -1;
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
        
        int ind=binSearch(a,n,Ele);
        
        System.out.println("Element "+Ele+" is found at: "+ind);
    }
};
