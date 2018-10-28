

public class Amicable
{
	public static void main(String[] args) {
		int i,j,sum=0,n=265;
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    System.out.println(sum);
	int si=0;
	for(j=1;j<sum;j++)
	{
	    if(sum%j==0)
	    {
	        si=si+j;
	    }
	}
	if(si==sum)
	{
	    System.out.println("emicable excuted ");
	}
	else{
	    	    System.out.println(" not emicable excuted ");
}
	}
}
