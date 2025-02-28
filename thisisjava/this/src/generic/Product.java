package generic;

public class Product<K, M> {
	//제네릭은 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다
	//외부에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 타입을 지정해야 합니다
	//만약 지정하지 않으면 Object 타입이 암묵적으로 사용된다
	private K kind;
	private M model; //타입 파라미터를 필드타입으로 사용
	
	//메소드를 getter와 setter로 만든다
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	

}
