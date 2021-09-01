/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import sms.Model.Student;

/**
 *
 * @author hirwa
 */
public interface IstudentServices extends Remote {
    
    public Student save(Student st) throws RemoteException;
    
    public Student update(Student st) throws RemoteException;
    
    public Student delete(Student st) throws RemoteException;
    
    public Student importExcelSheet(Student st) throws RemoteException;
    
    public List<Student> stList() throws RemoteException;
    
    public List<Student> findAll(Student st) throws RemoteException;
}
