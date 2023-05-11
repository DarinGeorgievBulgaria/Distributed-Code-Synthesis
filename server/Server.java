import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


/**
 * This is the Server class that implements the ServerInterface.
 * All of the method stated there as abstract are implemented here
 * @author Darin Georgiev
 */
public class Server implements ServerInterface {
    private ArrayList<String> operationList = new ArrayList<>();
    private ArrayList<BigDecimal> getAllNumbers = new ArrayList<>();
    private ArrayList<String> getPossibleOperations = new ArrayList<>();
    private Numbers getNumbers;
    /**
     * This method takes the numbers that the user has inputted and
     * initialises an object of type Numbers to store them
     * Then runs the startWorker method to create the worker thread
     * and waits until the list of operations is 4.
     * @param bd1 - the first number from the user's input
     * @param bd2 - the second number from the user's input
     * @param bd3 - the third number from the user's input
     * @return the list of operations
     */
    public ArrayList<String> numbersIO(BigDecimal bd1, BigDecimal bd2 , BigDecimal bd3) throws RemoteException, IOException, InterruptedException {
        getNumbers = new Numbers(bd1, bd2, bd3);
        startWorkers(4);
        while(getPossibleOperations.size()!=4){
            Thread.sleep(100);
            System.out.println(getPossibleOperations.size());
        }
        
        return getPossibleOperations;
    }
    /**
     * This method starts the threads initiating the Multithreading class
     * @param size - this is the number of threads to be created
     */
    public void startWorkers(int size){
        for(int i = 0; i <size; i++){
            Multithreading newRun = new Multithreading(i);
            Thread newThread = new Thread(newRun);
            newThread.start();
        }
    }
    /**
     * This method is used to get an the ArrayList with numbers.
     * If the method is empty by accident it adds the numbers to it.
     * @return an ArrayList with numbers
     */
    public ArrayList<BigDecimal> getAllNumbers(){
        if(getAllNumbers.isEmpty()){
            getAllNumbers.add(getNumbers.getnum1());
            getAllNumbers.add(getNumbers.getnum2());
            getAllNumbers.add(getNumbers.getnum3());
        }
        return getAllNumbers;
    }
    /**
     * This method is used by the Workers to get an operation to use.
     * It is synchronized because all workers will try to access it at the same time
     * @return returns a string for the worker that used the method to use
     */
    public synchronized String getOperation(){
        fillList();
        String returnString = "";
        for(int i = 0; i<operationList.size();){
            returnString = operationList.get(i);
            operationList.remove(i);
            fillList();
            break;
        }
        return returnString;
    }
    /**
     * This method is used by the Worker to add an operation to the list
     */
    public synchronized void addResultsList(String result){
        getPossibleOperations.add(result);
    }
    /**
     * This method is used to fill the list with operations
     */
    public void fillList(){
        if(operationList.isEmpty()){
            operationList.add("+");
            operationList.add("-");
            operationList.add("*");
            operationList.add("/");
        }
    } 
    /**
     * This is the main method of the Server which creates a stub and binds it with name
     * @param args
     */
    public static void main(String[] args) {
        try {
            Server s = new Server();
            String name = "Calculator";
            ServerInterface stub = (ServerInterface) UnicastRemoteObject.exportObject(s, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("Server ready");
           } catch (Exception e) {
            System.err.println("Exception:");
            e.printStackTrace();
        }
      }
}
