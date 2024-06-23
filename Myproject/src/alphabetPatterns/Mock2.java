package alphabetPatterns;
import java.util.Scanner;

public class Mock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Enter your name:");	
    String n =new Scanner(System.in).nextLine().toUpperCase();
    System.out.println(n);
    
    for(int i=0;i<n.length();i++)
    {
    	char ch=n.charAt(i);
    	if(ch=='A')
    	{
    		for(int j=1;j<=10;j++) {
    			for(int k=1;k<=10;k++) {
    				if(j==10/2 || j+k==10/2+1  || k-j==10/2 || k==1 && j>=10/2 || k==10 &&j>=10/2)
    				{
    					System.out.print("*");
    					}
    				else {
    					System.out.print(" ");
    				}
    				}
    			System.out.println();
    	}
    	}
    	if(ch=='B') {
    		for(int j=1;j<=10;j++) {
			for(int k=1;k<=10;k++) {
				if(k==1 || j==1 && k<(3*10)/4 || j==10/2 && k<10 || j==10 && k<10 || k==(3*10)/4 && (j>1 && j<10/2) || k==10 && j>10/2 && j<10)
				{
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
    	
    }
    
    } 
    	if(ch=='C') {
    		
    	
    for(int j=1;j<=10;j++) {
		for(int k=1;k<=10;k++) {
			if(k==1 &&(j>1 && j<10) || j==1 && (k>1 && k<10) || j==10 &&(k>1 && k<10) || k==10&&(j>1 && j<10/4)|| k==10 && (j>(3*10)/4 && j<10))
			{
				System.out.print("*");
				}
			else {
				System.out.print(" ");
			}
			}
		System.out.println();
	}
}
    	if(ch=='D') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 || j==1 && k>1 && k<10  || j==10 &&k>1 && k<10||  k==10 && (j>1 &&j<10))
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
    	}
    	
    	if(ch=='E') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 || j==1 || j==10/2 || j==10)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
    	}
    	
    	if(ch=='F') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 || j==1 || j==10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			
    	}
    		
    	}
    	if(ch=='G') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 &&  (j>1 && j<10) || j==1 && ( k>1 && k<10) || j==10  && (k>1 && k<10) || j==10/2 && (k>10/2 && k<10)|| k==10 && (j>10/2 && j<10))
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
    	}
    	if(ch=='H') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 || k==10|| j==10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
    	}
    	if(ch=='I') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(j==1 || j==10 || k==10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
    	}
    	if(ch=='J') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if( j==1 || k==10/2 || j==10 &&  (k>1 &&  k<10/2)|| k==1 && (j>=(3*10)/4))
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='K') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if( k==10/2 || j+k==10+1 && k>10/2 || j==k && k>10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='L') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if( j==10 || k==1)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='M') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if( k==1 || k==10 || j==k && k<=10/2 || j+k==10+1 && k>10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='N') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if( k==1 || k==10 || j==k)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='O') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 && (j>1 && j<10) || j==1 && k>1 && k<10  || j==10 &&k>1 && k<10 ||  k==10 && (j>1 &&j<10))
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='P') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 || j==1 && k<10|| j==10/2 && k<10 || k==10 && (j>1 && j<10/2))
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='Q') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 && j>1 && j<(3*10)/4 || j==1 && (k>1 && k<(3*10)/4) || j==(3*10)/4 &&  (k>1 && k<(3*10)/4) || k==(3*10)/4&& j>1 && j<(3*10)/4  || j==k && j>10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='R') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 || j==1 && k<10|| j==10/2 && k<10 || k==10 && (j>1 && j<10/2) || j==k && k>10/2 && k>10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='S') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(j==1 && (k>1 && k<10 ) || j==10/2 && (k>1 && k<10 ) || j==10 && (k>1 && k<10 ) || k==1 && (j>1 && j<10/2) || k==10 && (j>10/2 && j<10))
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     
    	}
    	if(ch=='T') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(j==1 || k==10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='U') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1&&  j<10 || k==10 && j<10|| j==10 &&(k>1 && k<10))
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='V') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 && j<=10/2 || k==10 && j<=10/2 || j-k == 10/2 || j+k== 10+10/2+ 1)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='W') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(k==1 || k==10 ||  j==k && k>10/2 || j+k==10+1 && k<=10/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='X') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(j==k || j+k==10+1)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='Y') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(j==k && k<=10/2 || j+k==10+1)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
    	if(ch=='Z') {
    		for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if(j==1 || j==10 || j+k==10+1)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}
     }
	}
}
}

		 

	


