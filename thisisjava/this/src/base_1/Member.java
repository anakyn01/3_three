package base_1;

public class Member {
	
	public String id;
	
	//������
	public Member(String id) {
		this.id = id;
	}
	
	@Override//Object�� equals()�޼ҵ带 ������ �ϱ�����
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			//obj�� memberŸ������ �˻��ϰ� Ÿ�Ժ�ȯ�Ŀ� target������ ����
			if(id.equals(target.id)) {//id���ڿ��� ������ ��
				return true;
			}
		}
		return false;
	}

}
