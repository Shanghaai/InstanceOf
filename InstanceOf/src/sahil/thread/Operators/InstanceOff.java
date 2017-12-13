package sahil.thread.Operators;

public class InstanceOff {

	public static void main(String[] args) {
		Thread t = new Thread();
		
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Runnable);
		//System.out.println(t instanceof String);//gives CE
		//compulsory there must be a relation
		//between both object	
		
		System.out.println(null instanceof Thread);
		System.out.println(null instanceof Runnable);
		System.out.println(null instanceof Object);
	}
}
