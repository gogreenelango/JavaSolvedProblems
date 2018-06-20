package com.based;

public class Newone {


	public static void main(String args[])
	{
		int i,j;
outer:	for(i=0;i<=5;i++) {
        
inner:		for(j=0;j<=3;j++)
		  {
			if(j==1)
				{continue outer;}
			if(j==2)
			{continue inner;}
			
			System.out.println(i+" "+j);
		  } 
				

		  
}
	
		
	}
		

}
