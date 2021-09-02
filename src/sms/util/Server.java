/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.util;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import sms.Services.CoursesServices;
import sms.Services.StudentServices;

/**
 *
 * @author hirwa
 */
public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(62121);
            registry.rebind("StudentServices", new StudentServices());
            registry.rebind("CoursesServices", new CoursesServices());
            
            System.out.println("Server Started...");
                
        } catch (RemoteException ex) {
            System.err.println("Server exception: "+ex.toString());
        }
    }
}
