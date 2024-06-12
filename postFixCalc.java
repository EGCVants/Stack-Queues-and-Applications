import java.io.InputStream; 
import java.util.Scanner;

public class postFixCalc {
  private stackClass<Integer> stackList;
  private String operator; //To avoid parameters
  int result = 0;

  //Method: Runs throught textfile to get numbers/operators; 
  //uses the doMath method to get result
  public void calculate(InputStream is, Scanner sc){
    //While loops from slides
    while (sc.hasNextLine()) {
    //stackClass object reinitialized to create new stack per line
      stackList = new stackClass(); 
      String line = sc.nextLine();
      Scanner lineScanner = new Scanner(line);
       while (lineScanner.hasNext()){
         if (lineScanner.hasNextInt()){ 
           //number gets pushed onto stack
           int number = lineScanner.nextInt();
           addToList(number);
         } else {
           //Operator updated, then calls doMath method
           operator = lineScanner.next();
           doMath();
         }
      }
      System.out.println(result);//Display total result for each line
    }
  }

  //Method: pops the last 2 elements in current stack, performs 
  //necessary operation, pushes that result onto the same stack
  public void doMath(){
    //int varaibles used to calculate final result
    int topStack = stackList.pop();//rightmost/last number before operator
    int nextStack = stackList.pop();//2ndlast number before operator
    
    //If statements assumes operators are valid (+,-,*,/)
    //Performs operation based on operator
    if(operator.equals("-")){ 
      result =  nextStack - topStack;
      
    } else if (operator.equals("*") || operator.equals("x")){
      //Don't know if x is necessary
      result =  nextStack * topStack;
      
    } else if(operator.equals("/")){
      result =  nextStack / topStack;
      
    } else {
      result =  nextStack + topStack;
    }
    //System.out.println(nextStack + operator + topStack);
    addToList(result);
  }
  
  //Method:pushes/adds item onto list/stackClass object
  public void addToList(int item){
    stackList.push(item);
  }
}