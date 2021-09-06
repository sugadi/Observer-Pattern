import java.util.ArrayList;
import java.util.List;
 

public class MySubject {
	
	private List<MyObsrver> observers = new ArrayList<MyObsrver>();
	   private int value;
	public List<MyObsrver> getObservers() {
		return observers;
	}
	public void setObservers(List<MyObsrver> observers) {
		this.observers = observers;
	}
	 
	
	public void notifyAllObservers(){
	      for (MyObsrver observer : observers) {
	         observer.update();
	      }
	   }
	public void attach(MyObsrver observer) {
		observers.add(observer);		
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		notifyAllObservers();
	} 	

}
