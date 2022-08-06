package org.example;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Ref;
import java.util.Hashtable;

public class JNDIRMIServer {
    public static void main(String[] args) throws Exception{
//        Hashtable env=new Hashtable();
//        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
//        env.put(Context.PROVIDER_URL,"rmi://localhost:1099");

        InitialContext initialContext=new InitialContext();
        //initialContext.rebind("rmi://localhost:1099/remoteObj",new RemoteObjImpl());

        Reference refObj=new Reference("T","T","http://localhost:7777/");
        initialContext.rebind("rmi://localhost:1099/remoteObj",refObj);
    }
}
