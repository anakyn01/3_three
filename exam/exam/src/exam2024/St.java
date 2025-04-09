package exam2024;

//str에 중복문자를 제거하고 순서를 유지한채로 남은 문자를 역순으로 출력하는것
public class St {
	public static String rf(String str, int index, boolean[] seen) {
		if(index < 0) return "";
//-1이되면 빈문자열을 리턴시켜 재귀를 종료
		char c = str.charAt(index);//문자열에 특정 인덱스에 위치하는 유니코드 단일문자를 리턴
		//문자가 어디에 (at) 있는지를 알려주는 함수
//주어진 문자열에서 현재 인덱스에 해당하는 문자를 가져옵니다
		String result = rf(str, index-1, seen);//페이징
/* 이전 인덱스를 참조할때, 배열의 마지막 인덱스를 계산할때*/
//현재 인덱스보다 하나 작은 인덱스로 재귀 호출하여 이전결과를 가져온다
		if(!seen[c]) {// 2 2 2 2 2 중복되지 않은경우 현재문자를 앞에 추가해서 리턴
			seen[c] = true;
			return c + result;
			//중복된 경우 이전 결과만 리턴
		}
		return result;//상황에 맞게 리턴
	}
	

	public static void main(String[] args) {
		String str = "abacabcd"; //abcd
		int length = str.length();//8
		boolean[] seen = new boolean[256];//seen배열은 길이가 256으로 거짓
		System.out.print(rf(str, length-1, seen));

	}
	
}
