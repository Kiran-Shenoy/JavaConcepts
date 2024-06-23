package arrayprograms;
import java.util.Scanner;
public class ResArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int ar1[]=new int[n];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
			
		}
		int m=scan.nextInt();
		int ar2[]=new int[m];
		for(int j=0;j<ar2.length;j++)
		{
			ar2[j]=scan.nextInt();
			
		}
		mergeSort(ar1,ar2);

	}



	private static void mergeSort(int[] ar1, int[] ar2) {
		// TODO Auto-generated method stub	
//		int i=0,j=ar2.length-1,k=0;
//		int res[]=new int [ar1.length+ar2.length];
//		while(i<ar1.length && j>=0)
//		{
//			if(ar1[i]<=ar2[j])
//			{
//				res[k]=ar1[i];
//				k++;
//				i++;
//			}
//			else {
//				res[k]=ar2[j];
//				k++;
//				j--;
//				
//			}
//			}
//			while(i<ar1.length)
//			{
//				res[k]=ar1[i];
//			    k++;
//			    i++;
//			}
//			while(j>=0)
//			{
//				res[k]=ar2[j];
//			    k++;
//			    j--;
//			}
//			for(int l=0;l<res.length;l++)
//			{
//				System.out.print(res[l]+" ");
//
//		}
		
//		int i=ar1.length-1,j=0,k=0;
//		int res[]=new int [ar1.length+ar2.length];
//		while(i>=0&& j<ar2.length)
//		{
//			if(ar1[i]<=ar2[j])
//			{
//				res[k]=ar1[i];
//				k++;
//				i--;
//			}
//			else {
//				res[k]=ar2[j];
//				k++;
//				j++;
//				
//			}
//			}
//			while(i>=0)
//			{
//				res[k]=ar1[i];
//			    k++;
//			    i--;
//			}
//			while(j<ar2.length)
//			{
//				res[k]=ar2[j];
//			    k++;
//			    j++;
//			}
//			for(int l=0;l<res.length;l++)
//			{
//				System.out.print(res[l]+" ");
//
//		}
			
//			int i=ar1.length-1,j=ar2.length-1,k=0;
//			int res[]=new int [ar1.length+ar2.length];
//			while(i>=0&& j>=0)
//			{
//				if(ar1[i]<=ar2[j])
//				{
//					res[k]=ar1[i];
//					k++;
//					i--;
//				}
//				else {
//					res[k]=ar2[j];
//					k++;
//					j--;
//					
//				}
//				}
//				while(i>=0)
//				{
//					res[k]=ar1[i];
//				    k++;
//				    i--;
//				}
//				while(j>=0)
//				{
//					res[k]=ar2[j];
//				    k++;
//				    j--;
//				}
//				for(int l=0;l<res.length;l++)
//				{
//					System.out.print(res[l]+" ");
//
//			}
			
				
				
				int i=0,j=0,k=0;
				int res[]=new int [ar1.length+ar2.length];
				while(i<ar1.length&& j<ar2.length)
				{
					if(ar1[i]>=ar2[j])
					{
						res[k]=ar1[i];
						k++;
						i++;
					}
					else {
						res[k]=ar2[j];
						k++;
						j++;
						
					}
					}
					while(i<ar1.length)
					{
						res[k]=ar1[i];
					    k++;
					    i++;
					}
					while(j<ar2.length)
					{
						res[k]=ar2[j];
					    k++;
					    j++;
					}
					for(int l=0;l<res.length;l++)
					{
						System.out.print(res[l]+" ");

				}
		
		
	}
	}

	
