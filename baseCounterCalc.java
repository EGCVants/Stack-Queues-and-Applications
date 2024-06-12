
public class baseCounterCalc{
  private queueClass<String> queueList = new queueClass();
  private int base; //Assuming base and n are valid
  private int n;
  private String num; //Display current dequeued element

  public baseCounterCalc(int base, int n){
    this.base = base;
    this.n = n;
  }

/*
Method: Outer for loop dequeues current element in the list, temporarily stores, and displays it. Goes through each element in list for n number of times. Nested for loop adds/enqueues onto to the list the next set of digits using the current dequeued element from a j(0 to base - 1)(ex: single digit, double digit, etc); which eventually gets displayed as num. 
*/
  public void calculate(){
    //This first for loop enqueues/adds numbers from 1 to base - 1 
    //to the list first as strings through concatenation
    for(int i = 1; i < base; i++){
      queueList.enqueue(""+i); 
    }
    System.out.println("Base: " + base + ", Number: " + n);

    //Description above method
    for(int i = 0; i < n; i++){ 
      num = queueList.dequeue(); 
      System.out.println(num); 
      for (int j = 0; j < base; j++){
        queueList.enqueue(num + j);
      }
    }
  }
}
 