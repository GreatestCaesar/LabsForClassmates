package Task;

import java.util.Arrays;

public class z1 {
	public static void main(String args[]) {
		
		int[] arr= {0,7,0, 0-6,0,9,0,-7,0,9,0,0};
		int kz=arr.length-1; //������� �����
		int ko=0; //������� �����. �����
		
		for(int i=0; i<kz; i++) {
			System.out.println(i+"oper:$$");
			if(arr[i]<0) {
				if(i<ko) {continue;}
				int pr=arr[i];
				arr[i]=arr[ko];
				arr[ko]=pr;
				ko++;
				System.out.println(ko);
				System.out.println(Arrays.toString(arr));
				
			}
			else if(arr[i]==0) {
				if(i>kz) {continue;}
				int pr=arr[i];
				arr[i]=arr[kz];
				arr[kz]=pr;
				kz--;
				System.out.println(kz);
				System.out.println(Arrays.toString(arr));
			}
		
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
