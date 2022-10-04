package week1.day1;

public class Mobile {
	public void makeCall(String mobileModel, float mobileweight) 
	{
		System.out.println("mobile model"+mobileModel );
		System.out.println("mobile weight"+mobileweight );
}
	public void sendMsg(boolean isFullCharged, int mobileCost) 
	{
		System.out.println("my mobile cost"+mobileCost);
	}
	public static void main(String[] args) {
		Mobile m_obj=new Mobile();
		m_obj.makeCall("Realme",1.5f);
		m_obj.sendMsg(true,14000);
	}
}