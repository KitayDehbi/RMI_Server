package com.ISI;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public Server() {
        init();
    }
    private void init() {
        try {
            LocateRegistry.createRegistry(1100);
            Service service = new ServiceImp();
            String url = "rmi://localhost:1100/Service";
            Naming.rebind(url, service);
            System.out.println("server starting at 1100 ...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server();
    }
}
