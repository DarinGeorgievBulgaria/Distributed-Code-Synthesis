//package client;
import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This is the Client main class which runs the whole program
 * @author Darin Georgiev
 */
public class Client{
    /**
     * This is the main method of the Client class
     * which has the funtionality to:
     * -take three numbers as input
     * -connect to the registry
     * -initiate the numberIO() method which returns an ArrayList with the results
     * -present the final result
     * -run a bash script that closes the program
     * @param args
     * @throws NotBoundException
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws NotBoundException, IOException, InterruptedException {
          
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        BigDecimal bd1 = BigDecimal.valueOf(num1);

        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        BigDecimal bd2 = BigDecimal.valueOf(num2);

        System.out.println("Enter third number");
        double num3 = scanner.nextDouble();
        BigDecimal bd3 = BigDecimal.valueOf(num3);

        scanner.close();

        String name = "Calculator";
        Registry registry = LocateRegistry.getRegistry("localhost");
        ServerInterface server = (ServerInterface) registry.lookup(name);
   
        ArrayList<String> finalResult = server.numbersIO(bd1, bd2, bd3);
        System.out.println("List of Operations: "+finalResult.get(0) + " "+finalResult.get(1)+ " "+ finalResult.get(2)+""+finalResult.get(3) );
        int count = 0;
        for(int i = 0; i < finalResult.size(); i++){
            if(!finalResult.get(i).equals("null")){
                System.out.println("Final Result: "+num1 + finalResult.get(i) + num2 +"="+num3);
            }
            else if(finalResult.get(i).equals("null")){
                count++;
            }
        }
        if(count == 4){
            System.out.println("There is no possible operation!");
        }
        
        System.out.println("The system is going to turn off in 10 seconds.");
        for(int i = 9;i>=0;i--){
            Thread.sleep(1000);
            System.out.println(i);
            if(i==1){
                Process proc = new ProcessBuilder("/home/georgie2/h-drive/TYP300MAIN/exit.sh").start();
                proc.waitFor();
                Thread.sleep(2000);
            }
          }
      }
}