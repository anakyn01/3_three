package intel;

public class Test2 {
	public static void main(String args[]) {
		int a =0, ss=0;//1�� �����ϴ� ���� �����մϴ�
		while(true) {//���ѷ����� �ǹ��մϴ�
			if(ss >100) break;//100���� Ŀ���� �극��ũ��ɾ�� ����
			++a;
			ss += a;
			//�� �ݺ����� a�� 1�� �����ϰ� ss�� a�� ���� �����ؼ� ���Ѵ�
		}
		System.out.println(a+ss);
	}
}
/*
a = 1
ss = 0+1 =1
a = 2
ss = 1+2 =3
a = 3
ss = 3+3 =6
a = 4
ss = 6+4 =10
a = 5
ss = 10+5 =15
a = 6
ss = 15+6 =21
a = 7
ss = 21+7 =28
a = 8
ss = 28+8 =36
a = 9
ss = 36+9 =45
a = 10
ss = 45+10 =55
11��° �ݺ�:

a = 11

ss = 55 + 11 = 66

12��° �ݺ�:

a = 12

ss = 66 + 12 = 78

13��° �ݺ�:

a = 13

ss = 78 + 13 = 91

14��° �ݺ�:

a = 14

ss = 91 + 14 = 105
 */
