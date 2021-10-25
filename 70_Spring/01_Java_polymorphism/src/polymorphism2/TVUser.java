package polymorphism2;

public class TVUser {

	
	public static void main(String[] args) {
		
		
		//삼성 tv 사용형태 
		//TV tv = new SamsungTV();

		
		
		//LgTV 사용 형태로 변경
		TV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	
		
	
		
		
		
		
		
	}
	
	
}
