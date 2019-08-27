import java.util.Scanner; 
import java.lang.Math;
class test
 {
  public static void main(String arg[])
   {
    Scanner sc = new Scanner(System.in);
    int len,l=2;
    System.out.println("Enter the lenght Of the array");
    len=sc.nextInt();
    double arr[]= new double[len];
    double arrp[]= new double[len];
    System.out.println("Enter a Binary Number of lenght "+len);
    for(int i=0;i<len;i++)
     {
      arr[i]=sc.nextDouble();
     } 
    double o=1; 
    arrp[0]=0;
    for(int i=1;i<len;i++)
     {
       arrp[i]=o*o;
       o=o+1;
     }
    System.out.println(" "); 
    double x=0,y=2,sum=0,c=len;
    int flag=0,lsum=0,p=0,z=(len-1),u;
    for(int i=z;i>=0;i--)
     {   
      sum=sum+(arr[i]*Math.pow(y,x));
      x=x+1; 
      for(int m=1;m<len;m++)
      {
       if(sum==arrp[m] && p<2)
       {
        for(u=z;u<c;u++)
        {
         System.out.print(arr[u]+" ");
        }
        System.out.println("  ");
        c=z;
        p=p+1;
        x=0;
        sum=0;
        break;
       } 
      }
     }
    for(int m=1;m<len;m++)
      {
       if(sum==arrp[m])
       {
        for(u=0;u<c;u++)
        {
         System.out.print(arr[u]+" ");
        }
        System.out.println("Perfect Square");
       }
      }    
    } 
   }
