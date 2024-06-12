import java.util.LinkedList;

public class queueClass<T>{
  private LinkedList<T> queue;
  
  public queueClass(){
    queue = new LinkedList<>();
  }

  //Method: Adds to the end of the list
  public void enqueue(T item){
    queue.addLast(item);
  }

  //Method: Removes and return from the front of the list
  public T dequeue(){
    T returnObj = queue.getFirst();
    queue.removeFirst();
    return returnObj;
  }

  //Method: returns true/false if list is empty or not; unused.
  //Otherwise, would be used to throw illegal exception
  public boolean isEmpty(){
    if(queue.size() < 1){
      return true;
    }
    return false;
  }
}