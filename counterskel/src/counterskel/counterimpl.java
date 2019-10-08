package counterskel;
import java.rmi.*;
import java.rmi.server.*;


public class counterimpl extends UnicastRemoteObject implements Counter  {
	
	private int number=0;
	protected counterimpl(int n) throws RemoteException {
		this.number= n;
	}

	@Override
	public void increment() throws RemoteException {
		this.number++;
		
	}

	@Override
	public void decrement() throws RemoteException {
		this.number--;
		
	}

	@Override
	public int read_value() throws RemoteException {
		// TODO Auto-generated method stub
		return this.number;
	}
	

}
