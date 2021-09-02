package sms.util;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import sms.Services.IcourseServices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hirwa
 */
public class courseUtil {
    public static IcourseServices getClientServices() {
        try {
            return (IcourseServices) getRegistry().lookup("CoursesServices");
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
