

public class Maxdiff
{
	public static void main(String[] args) {
	    int arr[]={10,20,30,40,50,60};
	    int i,j;
	    int maxdiff=arr[1]-arr[0];
	    for(i=0;i<arr.length;i++)
	    {
	        for(j=i+1;j<arr.length;j++)
	        {
	            if(arr[j]-arr[i]>maxdiff){
	                maxdiff=arr[j]-arr[i];
	            }
	        }
	    }
		System.out.println(maxdiff);
	
	}
}
