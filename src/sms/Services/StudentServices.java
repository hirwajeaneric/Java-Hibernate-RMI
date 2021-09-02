/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.Services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import sms.Model.Student;
import sms.controller.StudentDao;

/**
 *
 * @author hirwa
 */
public class StudentServices extends UnicastRemoteObject implements IstudentServices{
    
    StudentDao stdao = new StudentDao();
    
    public StudentServices() throws RemoteException {
    
    }
    
    @Override
    public Student save(Student st) throws RemoteException {
        stdao.save(st);
        return st;
    }
    
    @Override
    public Student update(Student st) throws RemoteException {
        stdao.update(st);
        return st;
    }
    
    @Override
    public Student delete(Student st) throws RemoteException {
        stdao.delete(st);
        return st;
    }
    
    @Override
    public Student importExcelSheet(Student st) throws RemoteException {
        stdao.importExcelSheet(st);
        return st;
    }
    
    @Override
    public List<Student> stList() throws RemoteException {
        stdao.stList();
        List<Student> ls = stList();
        return ls;
    }
    
    @Override
    public List<Student> findAll(Student st) throws RemoteException {
        stdao.findAll(st);
        List<Student> all = findAll(st);
        return all;
    }
    
}
