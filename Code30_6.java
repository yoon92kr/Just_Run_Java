package pro03;
	//�޼ҵ� �Ű������� �迭�� �ѱ�� ���, �ڷᰡ �ƴ� ������(�ּ�)�� �μ��� ������.
import java.util.Arrays;
public class Code30_6 {

	
	static void update(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i] += 10;
		}
		
	}
	
	public static void main(String[] args) {
		int[] array1 = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(array1));
		update(array1);
		
		System.out.println(Arrays.toString(array1));
		
	}
}