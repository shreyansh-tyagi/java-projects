package pattern;
import java.io.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int k=5-i;k>1;k--) {
				
				System.out.print(" ");
			
			
		}
			for(int j=0;j<=i;j++) {
				System.out.print("*  ");
			}
			System.out.println(" ");
		}
	}

}
