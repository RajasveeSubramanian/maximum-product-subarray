import java.util.Arrays;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int h=a[0];
		for(int i=0;i<n;i++) {
			int m=a[i];
			for(int j=i+1;j<n;j++) {
				h=Math.max(h,m);
				m+=a[j];
			}
			h=Math.max(h,m);
		}
		System.out.print(h);
  }
}
