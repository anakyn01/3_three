package nexture;

public abstract class ServiceMenu {
	int cut, color, perm, shampoo, massage;
	ServiceMenu(){
		this.cut = PriceTable.CUT;
		this.color = PriceTable.COLOR;
		this.perm = PriceTable.PERM;
		this.shampoo = PriceTable.SHAMPOO;
		this.massage = PriceTable.massage;
	}
	
	
	
	public abstract String calculator();
}
