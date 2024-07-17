package java_practice_맛집리뷰객체생성_2039;

public class Restaurant {

	int resid;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	Restaurant(){
		
	}
	
	Restaurant(int resid, String name, String address, String signatureMenu, int rate){
		this.resid= resid;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Restaurant [resid=" + resid + ", name=" + name + ", address=" + address + ", signatureMenu="
				+ signatureMenu + ", rate=" + rate + "]";
	}
	
}
