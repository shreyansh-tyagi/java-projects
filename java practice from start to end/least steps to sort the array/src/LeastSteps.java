
public class LeastSteps {

	public static void main(String[] args) {
		//1 3 4 2
		int[] arr= {1, 3, 4, 2};
		int step=leastStepsToSortArray(arr);
		System.out.println("\nanw: "+step);

	}
	public static int leastStepsToSortArray(int[] arr) {
		int step=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
					step+=1;
				}
			}
		}
		for(int a:arr) {
			System.out.print(" "+a);
		}
		return step;
		
	}

}
