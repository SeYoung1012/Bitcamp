package polymorphism;

public class TVUser {

	
	public static void main(String[] args) {

		//강한 결합
		
		/*
		//삼성 tv 사용형태 
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		*/
		
		
		
		
		//LG TV 사용형태로 변경
		LgTV tv = new LgTV();
		tv.on();
		tv.soundUp();
		tv.soundDown();
		tv.off();
		
		
		
		
		
		
	}
	
	
}
