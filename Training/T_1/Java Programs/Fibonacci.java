class Fibonacci {
  
	public static void main(String[] args)  
{    
		int a=0,b=1,res;    
		System.out.print(a+" "+b);

		for(int i=2;i<10;i++)
{    
			res=a+b;    
			System.out.print(" "+res);   
			a=b;    
			b=res;    
		}    
  	}	
}  