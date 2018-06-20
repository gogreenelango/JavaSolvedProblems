import java.util.Scanner;
class MaxiNum{


	  public  void Maxi(int arr[])
		{
	       int max1=Integer.MIN_VALUE;
		   int max2=Integer.MIN_VALUE;
		   for(int n:arr){ 
		   if(max1<n)
			   
			   
		   {
		   max2=max1;
		   max1=n;

		   
		   }
		   else if(max2<n)
		   {
		   max2=n;
		    
		   }}
		   	   System.out.println("First Maximum Number is :"+max1);
			   System.out.println("second Maximum Number is :"+max2);
		  
		}


	    public static void main(String args[]){
		
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers :");
		int a=sc.nextInt();
		int arr[]=new int[a];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		MaxiNum two=new MaxiNum();
		two.Maxi(arr);




	}



	}

