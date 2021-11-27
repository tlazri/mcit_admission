/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import service.StudentServiceImpl;
import dao.StudentDAOImpl;
import model.Student;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import util.TestUtil;

/**
 *
 * @author maria
 */
@RunWith(MockitoJUnitRunner.class)
public class StudentServiceImplTest {
    @Mock
    private Student instance;
    @Mock
    private StudentDAOImpl dao;
    @InjectMocks
    private StudentServiceImpl service;
    
    public StudentServiceImplTest() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test of insert method, of class StudentServiceImpl.
     */
    @Test
    public void testInsert() {
     //   service.insert(instance);
    //    verify(dao).insert(instance);
        System.out.println("Test testInsert");
    }

    /**
     * Test of update method, of class StudentServiceImpl.
     */
    @Test
    public void testUpdate() {
    //    service.update(instance);
    //    verify(dao).update(instance);
         System.out.println("Test testUpdate");
    }

    /**
     * Test of selectById method, of class StudentServiceImpl.
     */
    @Test
    public void testSelectById() {
        int id = TestUtil.generateRandomNumber();
       System.out.println("Test testSelectById");
     //   service.selectById(id);
     //   verify(dao).selectById(id);
    }

    /**
     * Test of delete method, of class StudentServiceImpl.
     */
    @Test
    public void testDelete() {
     //   service.delete(instance);
        System.out.println("Test testDelete");
     //   verify(dao).delete(instance);
    }

    /**
     * Test of select method, of class StudentServiceImpl.
     */
    @Test
    public void testSelect() {
         
                System.out.println("Test testSelect");
    //    service.select();
    //    verify(dao).select();
    }
    
}
