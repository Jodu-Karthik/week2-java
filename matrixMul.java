import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m,n,p,q: ");
        int m=sc.nextInt(),n=sc.nextInt(),p=sc.nextInt(),q=sc.nextInt();
        if(n!=p)
        {
            System.out.println("Multiplication is Not possible");
            return ;
        }
        
        int a[][]=new int[m][n],b[][]=new int[p][q],c[][]=new int[m][q];
        System.out.print("Enter Matrix A Elements: ");
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++) 
                a[i][j]=sc.nextInt();
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) System.out.print(a[i][j]+" ");
            System.out.println();
        }
                
        System.out.print("Enter Matrix B Elements: ");
             
        for(int i=0;i<p;i++)
            for(int j=0;j<q;j++) 
                b[i][j]=sc.nextInt();
                
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++) System.out.print(b[i][j]+" ");
            System.out.println("");
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++)
            {
                c[i][j]=0;
                for(int k=0;k<p;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        
        System.out.println("Matrix After Multiplication");
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++) System.out.print(c[i][j]+" ");
            System.out.println();
        }
         
    }
}
