package seliniumlearning6;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		int[] arr= {13,12,11,14,18,21,20};
		int size=arr.length;
		System.out.println("The duplicate elements in an array are");
		for (int i=0; i<size;i++ ) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
	}

	
		// TODO Auto-generated constructor stub
	}

}
