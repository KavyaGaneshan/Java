package method;


interface  tvremote
{
	
	
	public void remotecolour();
	
}


interface smarttvremote extends tvremote
{
	
	
	public void remotebrand();
	
}

 class TV implements smarttvremote
{

	@Override
	public void remotecolour() {
System.out.println("Remote colour is black");	
	}

	@Override
	public void remotebrand() {
		System.out.println("Remote brand is Sony");	
		
	}
	
}	
	



public class Tvinterfacepgm {

	public static void main(String[] args) {
	
		
		TV ob= new TV();
		ob.remotebrand();
		ob.remotecolour();

	}

}
