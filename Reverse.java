                     public class Reverse{
	public static void main(String[] args) {
	    int n=153,sum=0,r,i;
	    int temp=n;
	    while(n>0){
	        r=n%10;
	        sum=sum*10+r;
	        n=n/10;
	        
	    }
	    System.out.println(sum);
	    /*if(sum==temp)
	    {
		System.out.println("armstrong");
	    }
	    else{
	        		System.out.println("not srmstrong");

	    }
	}*/
}
}
