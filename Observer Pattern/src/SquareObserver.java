public class SquareObserver extends MyObsrver{

		   public SquareObserver(MySubject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "Squar value: " +  ( subject.getValue() * subject.getValue()   ) ); 
		   }
		}
 
