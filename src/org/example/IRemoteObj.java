package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteObj extends Remote {
    //SayHello就是客户端要调用的方法，需要抛出RemoteException
    public String sayHello(String keywords) throws RemoteException;
}