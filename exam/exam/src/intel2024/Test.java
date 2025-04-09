package intel2024;

public class Test {
	


	public static void main(String[] args) {
		int totalcnt = 10, totalleg = 26;
		int duckcnt, pigcnt;
		
		for (duckcnt = 1; duckcnt < totalcnt; duckcnt++) {
			pigcnt = totalcnt - duckcnt;//돼지의 수는 전체수에서 닭의 수를 뺀것
			if((2 * duckcnt) + (4 * pigcnt) == totalleg) {//다리수 조건
				System.out.printf("%d %d", duckcnt, pigcnt);
				break;
			}
		}

	}

}
