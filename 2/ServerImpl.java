import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException {
        super();
    }

    @Override
    public void sendNumber(double num1, double num2) throws RemoteException {
        System.out.println("Received num1 = " + num1);
        System.out.println("Received num2 = " + num2);
    }

    public double Addition(double num1, double num2) throws RemoteException {
        System.out.println("Addition Is: " + (num1 + num2));
        return num1 + num2;
    }

    public double Subtraction(double num1, double num2) throws RemoteException {
        System.out.println("Subtraction Is: " + (num1 - num2));
        return num1 - num2;
    }

    public double Multiplication(double num1, double num2) throws RemoteException {
        System.out.println("Multiplication Is: " + (num1 * num2));
        return num1 * num2;
    }

    public double Division(double num1, double num2) throws RemoteException {
        if (num2 != 0) {
            System.out.println("Division Is: " + (num1 / num2));
            return num1 / num2;
        } else {
            System.out.println("Cannot Divide A Number By Zero!");
        }
        return num1 / num2;
    }
}
