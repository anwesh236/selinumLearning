package seliniumlearning6;

public class FindIntersection {
	
	 public static void main(String[] args) {
		int [] num1={3,2,11,4,8,9};
        int [] num2= {1,3,11,6,7,10};
        for (int i=0;i<=num1.length-1;i++) {
        	for (int j=0;j<=num2.length-1;j++) {
        	if (num1[i]==num2[j])
        		System.out.println(num1[i]);
	}

        }	
		// TODO Auto-generated constructor stub
	
	 }

}
