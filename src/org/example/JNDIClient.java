package org.example;

import org.example.IRemoteObj;

import javax.naming.InitialContext;

public class JNDIClient {
    public static void main(String[] args) throws Exception{
        InitialContext initialContext=new InitialContext();
        IRemoteObj remoteObj=(IRemoteObj) initialContext.lookup("rmi://localhost:1099/remoteObj");
        System.out.println(remoteObj.sayHello("hello"));
    }
}
