/*
01010101
10101010
01010101
10101010
01010101
10101010
01010101
10101010*/
package binary;

public class Binarycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
			if(k==0) {
				System.out.print("0");
				k+=1;
			}
			else {
				System.out.print("1");
				k=0;
			}
				
			}
			System.out.println("\n");
		}

	}

}
