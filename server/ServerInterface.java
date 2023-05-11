import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
/**
 * This is the Server Interface which is going to be implemented in the Server
 * All of the methods are implemented in the Server class.
 * @author Darin Georgiev
 */
public interface ServerInterface extends Remote {
    public ArrayList<String> numbersIO(BigDecimal bd1, BigDecimal bd2, BigDecimal bd3) throws RemoteException,IOException, InterruptedException;
    public String getOperation() throws RemoteException;
    public ArrayList<BigDecimal> getAllNumbers() throws RemoteException;
    public void addResultsList(String result) throws RemoteException;
}