/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import util.TestUtil;

/**
 *
 * @author maria
 */
@RunWith(MockitoJUnitRunner.class)
public class StudentDAOImplTest {
    @Mock
    private SessionFactory sessionFactory;
    @Mock
    private Session session;
    @Mock
    private Query query;
    @Mock
    private Student s;
    @InjectMocks
    private StudentDAOImpl dao;
    
    public StudentDAOImplTest() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(session.createQuery(anyString())).thenReturn(query);
        Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
        dao.setSessionFactory(sessionFactory);
    }

    /**
     * Test of insert method, of class StudentDAOImpl.
     */
    @Test
    public void testInsert() {
       // dao.insert(s);
        System.out.println("Test Insert");
    }

    /**
     * Test of update method, of class StudentDAOImpl.
     */
    @Test
    public void testUpdate() {
       // dao.update(s);
        System.out.println("Test update");
    } 

    /**
     * Test of selectById method, of class StudentDAOImpl.
     */
    @Test
    public void testSelectById() {
        int id = TestUtil.generateRandomNumber();
    //    dao.selectById(id);
        System.out.println("Test Select by id");
    }

    /**
     * Test of delete method, of class StudentDAOImpl.
     */
    @Test
    public void testDelete() {
      //  dao.delete(s);
        System.out.println("Test Delete");
    }

    /**
     * Test of select method, of class StudentDAOImpl.
     */
    @Test
    public void testSelect() {
       // dao.select();
        System.out.println("Test Select");
    }
    
}
