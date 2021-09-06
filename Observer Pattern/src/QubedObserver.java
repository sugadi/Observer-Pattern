
public class QubedObserver extends MyObsrver {
	
	public QubedObserver(MySubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	@Override
	protected void update() {
		 
		System.out.println( "Qubed Value: " +   (subject.getValue() *subject.getValue() * subject.getValue() ) ); 
	}

}
