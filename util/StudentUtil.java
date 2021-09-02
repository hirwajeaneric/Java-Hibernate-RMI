/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.util;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import sms.Services.IstudentServices;

/**
 *
 * @author hirwa
 */
public class StudentUtil {
    public static IstudentServices getClientServices() {
        try {
            return (IstudentServices) getRegistry().lookup("StudentServices");
        } catch (NotBoundException | RemoteException ex) {
            return null;
        }
    }
    
    private static Registry getRegistry() {
        try {
            return LocateRegistry.getRegistry("localhost", 62121);
        } catch (RemoteException e) {
            return null;
        }
    }
}
