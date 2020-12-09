package com.ISI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Set;

public interface Service extends Remote {

    public Set<String> noDuplicate(List<String> fullWithDuplicate)
            throws RemoteException;
}
