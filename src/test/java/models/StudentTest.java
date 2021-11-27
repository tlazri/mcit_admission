/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import model.Student;
import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.TestUtil;

/**
 *
 * @author maria
 */
public class StudentTest {
    
    private Student student;
    private int id;
    private String firstName;
    private String lastName;
    private String university;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;
    private String email;
    private String gender;
    private Date birthdate;
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        student = new Student();
        id = TestUtil.generateRandomNumber();
        firstName = TestUtil.generateRandomString();
        lastName = TestUtil.generateRandomString();
        university = TestUtil.generateRandomString();
        address = TestUtil.generateRandomString();
        city = TestUtil.generateRandomString();
        state = TestUtil.generateRandomString();
        postalCode = TestUtil.generateRandomString();
        country = TestUtil.generateRandomString();
        phone = TestUtil.generateRandomString();
        fax = TestUtil.generateRandomString();
        email = TestUtil.generateRandomString();
        gender = TestUtil.generateRandomString();
        birthdate = new Date(2000,4,2);
		
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetterSetter(){
                 student.setFirstName(firstName);
         
        student.setLastName(lastName);
         
        assertNotNull(student);
         
        assertNotNull(student.getFirstName());
         
        assertNotNull(student.getLastName());
         
    }
    
}
