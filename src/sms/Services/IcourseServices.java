/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import sms.Model.Courses;

/**
 *
 * @author hirwa
 */
public interface IcourseServices extends Remote{
    
    public Courses save(Courses cr) throws RemoteException;
    
    public Courses update(Courses cr) throws RemoteException;
    
    public Courses delete(Courses cr) throws RemoteException;
       
    public List<Courses> crList() throws RemoteException;
    
    public List<Courses> findAll(Courses cr) throws RemoteException;
}
