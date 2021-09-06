
public class MainTestdemo {
   public static void main(String[] args) {
      MySubject subject = new MySubject();

      
      new QubedObserver(subject);
      new SquareObserver(subject);

      System.out.println("Starting value: 400 ");	
      subject.setValue(400);
      
      System.out.println("\n**********************************************\n");	
      
      System.out.println("Startig value: 500");	
      subject.setValue(500);
   }
}
