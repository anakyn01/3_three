package intel2024;

public class Test {
	


	public static void main(String[] args) {
		int totalcnt = 10, totalleg = 26;
		int duckcnt, pigcnt;
		
		for (duckcnt = 1; duckcnt < totalcnt; duckcnt++) {
			pigcnt = totalcnt - duckcnt;//������ ���� ��ü������ ���� ���� ����
			if((2 * duckcnt) + (4 * pigcnt) == totalleg) {//�ٸ��� ����
				System.out.printf("%d %d", duckcnt, pigcnt);
				break;
			}
		}

	}

}
