import java.util.*;

class Main
{
    public static void sort(String a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        /*for(String i:a) System.out.print(i+" ");
        System.out.println(""); */
    }

    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);    
        System.out.print("Enter n: ");    
        int n=x.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++) a[i]=x.nextLine();
        
        for(String i: a) System.out.print(i+" ");
        System.out.println(""); 
        
//        Arrays.sort(a);
        
        sort(a,n);
        
        for(String i:a) System.out.print(i+" ");
        System.out.println(""); 
    }
};
