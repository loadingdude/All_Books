class Fibonacci{  
	public static void main(String args[])  
	{    
		int a=0,b=1,res;    
		System.out.print(a+" "+b);//printing 0 and 1    
    
		for(int i=2;i<10;i++)//loop starts from 2 because 0 and 1 are already printed    
		{    
			res=a+b;    
			System.out.print(" "+res);   
			a=b;    
			b=res;    
		}    
  	}	
}  

C:\sai>java Fibonacci
0 1 1 2 3 5 8 13 21 34

