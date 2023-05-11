import java.io.IOException;
/**
 * This class implements the runnable interface and is used to start threads
 * @author Darin Georgiev
 */
public class Multithreading implements Runnable {
    
    private int threadNumber;
    /**
     * This constructor takes an integer as input just to see the sequence of thread creation
     * @param threadNumber
     */
    public Multithreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    /**
     * This is the implementation of the run method form the Runnable interface.
     * It has the ability to run a bash script which opens a new terminal and runs the Worker class.
     * Note that in order for this method to be used the directory of the bash script has to be changed!
     */
    @Override
     public void run() {
          try {
               Process proc = new ProcessBuilder("/home/georgie2/h-drive/TYP300MAIN/workers.sh").start();
               System.out.println("This is thread: "+ threadNumber);
               proc.waitFor();
          } catch (IOException | InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
          }
     }
}
