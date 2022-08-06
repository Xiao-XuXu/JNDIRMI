package org.example;

import org.example.IRemoteObj;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObjImpl extends UnicastRemoteObject implements IRemoteObj {
    public RemoteObjImpl() throws RemoteException {
        //UnicastRemoteObject.exportObject(this,0);//如果不继承UnicastRemoteObject就需要手工导出
    }

    @Override
    public String sayHello(String keywords) throws RemoteException {
        String upKeywords=keywords.toUpperCase();
        System.out.println(upKeywords);
        return upKeywords;
    }
}