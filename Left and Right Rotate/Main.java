import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int ar[]=new int[n];
    for(i=0;i<n;i++)
    {
      ar[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    int g=k,q=0,w=0,h;
    for(i=0;i<n;i++)
    {
      if(i%2==0)
      {
        a[q]=ar[i];
        q++;
      }
      else
      {
        b[w]=ar[i];
        w++;
      }
    }
    while(k>0)
    {
      h=a[q-1];
      for(i=q-1;i>0;i--)
      {
        a[i]=a[i-1];
      }
      a[0]=h;
      k--;
    }
    while(g>0)
    {
      h=b[0];
      for(i=0;i<w-1;i++)
      {
        b[i]=b[i+1];
      }
      b[w-1]=h;
      g--;
    }
    i=-1;
    while(n>0)
    {
      i++;
     System.out.print(a[i]+" ");
      n--;
      if(n!=0)
      {
        System.out.print(b[i]+" ");
        n--;
      }
    }
  	}
}