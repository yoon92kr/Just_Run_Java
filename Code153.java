package JustRunJava;
	//������ ����� main �޼ҵ�� ���� �������̴�.
	//���ο� �����带 �߰��Ͽ� ����ϸ� ������ ������ �ƴ�, ���� �ٹ������� �����Ѵ�.
	//Thread ��ü�� ������ ��, �������� Thread ��ü�� �Ű������� ������, ���� ����ȴ�.
class NumberThread extends Thread {
	public void run() {
		for (int i=1; i<=26; i++) {
			System.out.print("["+i+"]");
		}
	}
}
public class Code153 {
	public static void main(String[] args) {
		Thread t = new NumberThread();
		t.start();
		for (char ch = 'A';ch <= 'Z'; ch++) {
			System.out.print("["+ch+"]");
		}
	}

}