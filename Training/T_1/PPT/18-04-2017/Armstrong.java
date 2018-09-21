public class Armstrong
{
	public static void main(String[] args) 
    	{
    		int rem, res = 0,temp;
		int n=121;
            	temp=n;
            	while(n > 0)
            	{
                	rem = n % 10;
                	res = res + (rem * rem * rem);
                	n = n / 10;
            	}
            	if(temp == res)
           	{
                	System.out.print("Number is Armstrong");
            	}else{
			System.out.print("Number is not an Armstrong");
        	}
    	}
}