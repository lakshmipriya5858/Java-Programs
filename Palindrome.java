

public class Palindrome
{
  public static void main (String[]args)
  {
    int n=10;
    int m = n / 2;
    if (n == 0 || n == 1)
              {
        	System.out.println ("Not a prime");
              }
    else
      {
	for (int i = 1; i <= m / 2; i++)
        	  {
        	    if (n % i == 0)
                	      {
                		System.out.println (" not prime");
                		                		                		getsmalldivisor(n);

                		break; }
        	        else
                	      {
                	          System.out.println("prime");
                	      }
        	    }
      }
  }


 public static void getsmalldivisor(int n)
        {
          for (int i = 1; i <= n; i++)
            {
              if (n % i == 0)
            	        {
            	  System.out.println ("smallest divior" + i);
            	        break;
        
                    	}
            }
        }
}

