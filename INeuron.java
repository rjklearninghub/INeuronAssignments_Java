package learn.ineuron.ai;

public class INeuron {

	public static void main(String[] args) {

		int n=5;
		for (int i=0;i<n;i++) {
			System.out.print("*");
			System.out.print("     ");
			
			
			for (int j=0;j<n;j++) {
				if (j==0 || j==(n-1) || i==(n-2) && j!=(n-4) && j!=(n-3) || i==n-4 && j!=n-3 && j!=n-2 || i==n-3 && j!=n-4 && j!=n-2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("    ");
			for (int j=0;j<n;j++) {
				if (j==0 || i==0  || i==n-1 || i==n/2&&j!=n-2&&j!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("     ");
			for (int j=0;j<n;j++) {
				if (j==0 && i!=(n-1) || i==(n-1) && j!=0 && j!=(n-1) || j==n-1 && i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("    ");
			for (int j=0;j<n;j++) {
				if (i==0 || j==0  ||j==n-1 && i!=n-3 && i!=n-2 ||  i==n-3 && j!=n-4 && j!=n-1 && j!=n-2|| i==n-2 && j!=n-2 && j!=n-1 && j!=n-4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("    ");
				for (int j=0;j<n;j++) {
					if (j==0 && i!=0 && i!=n-1 || i==0 && j!=0 &&  j!=(n-1) || i==(n-1) && j!=(n-1) && j!=0 || j==n-1 && i!=0 && i!=n-1 )
						System.out.print("*");
					else
						System.out.print(" ");
				}
			
			System.out.print("     ");
			for (int j=0;j<n;j++) {
				if (j==0 || j==(n-1) || i==(n-2) && j!=(n-4) && j!=(n-3) || i==n-4 && j!=n-3 && j!=n-2 || i==n-3 && j!=n-4 && j!=n-2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
		System.out.println();
		
		
		}//end of i loop
		
			
		}
		
	}

