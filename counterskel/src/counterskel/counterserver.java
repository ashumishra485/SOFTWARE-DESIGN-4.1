package counterskel;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
public class counterserver {
     public static  void main( String args[] ) throws Exception {
                       try{LocateRegistry.createRegistry(1099); 
                       System.out.println("java RMI registry created.");
                          counterimpl c = new counterimpl(5);
        
                          Naming.rebind( "MyCounter", c );
     }
                       catch(Exception e) {
                    	   System.out.println("Error"+e);
                       }
                       }
}

