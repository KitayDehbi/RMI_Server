package com.ISI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ServiceImp extends UnicastRemoteObject implements Service{
    protected ServiceImp() throws RemoteException {
    }
    @Override
    public Set<String> noDuplicate(List<String> fullWithDuplicate)  throws RemoteException{
        return new HashSet<>(fullWithDuplicate);
    }
}
