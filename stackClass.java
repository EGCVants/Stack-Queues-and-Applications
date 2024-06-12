import java.util.ArrayList;

public class stackClass<T>{
  ArrayList<T> stack;

  public stackClass(){
    stack = new ArrayList<>();
  }
  
  //Method: Adds element to end of the list
  public void push(T added){
    stack.add(added);
  }
  
  //Method: Removes and returns the last element of the list
  public T pop(){ 
    T returnObj = stack.get(stack.size() - 1);//last element
    stack.remove(stack.size() - 1);//last element
    return returnObj;
  }

  //Method: returns true/false if list is empty or not; unused.
  //Otherwise, would be used to throw illegal exception
  public boolean isEmpty(){
    if(stack.size() < 1){
      return false;
    }
    return true;
  }
}