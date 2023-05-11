import java.math.BigDecimal;
import java.math.RoundingMode;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
/**
 * This is a Worker class which is initiated 4 times and makes a calculations with
 * the same numbers the user has inputted but every time changes the operation.
 * @author Darin Georgiev
 */
public class Worker{
     /**
      * This is the main method of the Worker class which has the functionality to:
     - connect to the registry
     - get the an operation to use
     - get the numbers to use
     - calculate and add a value to a list if the operation is a solution or not

      * @param args
      * @throws RemoteException
      * @throws NotBoundException
      */
     public static void main(String[] args) throws RemoteException, NotBoundException {
         
          String name = "Calculator";
          Registry registry = LocateRegistry.getRegistry("localhost");
          ServerInterface server = (ServerInterface) registry.lookup(name);
  
          String operationStr = server.getOperation();
          System.out.println(operationStr);

          ArrayList<BigDecimal> listNumbers = server.getAllNumbers();
          for(int i = 0; i<listNumbers.size(); i++){
               System.out.println(listNumbers.get(i));
          }
          BigDecimal bd1 = listNumbers.get(0);
          BigDecimal bd2 = listNumbers.get(1);
          BigDecimal bd3 = listNumbers.get(2);
          double result = 0;
          BigDecimal resultbd = BigDecimal.valueOf(result);
          switch (operationStr){
               case "+":
                    resultbd = bd1.add(bd2);
                    break;
               case "-":
                    resultbd = bd1.subtract(bd2);
                    break;
               case "*":
                    resultbd = bd1.multiply(bd2);
                    break;
               case "/":
                    if(bd2.compareTo(BigDecimal.ZERO)!=0){
                         //https://stackoverflow.com/questions/4591206/arithmeticexception-non-terminating-decimal-expansion-no-exact-representable
                         resultbd = bd1.divide(bd2,2, RoundingMode.HALF_UP);
                         break;
                    }
                    else if (bd2.compareTo(BigDecimal.ZERO)==0){
                         System.out.println("Can't divide this number by 0!");
                         break;
                    }
                    
          }
        // Check if the result matches the third number
          if (resultbd.compareTo(bd3)==0) {
               System.out.println(bd1 + " " + operationStr + " " + bd2 + " = " + bd3);
               System.out.println("This one!");
               server.addResultsList(operationStr);
               
          }
          else if(resultbd.compareTo(bd3)==1 || resultbd.compareTo(bd3)==-1){
               System.out.println("Not this one");
               operationStr = "null";
               server.addResultsList(operationStr);
          }
     }
}

