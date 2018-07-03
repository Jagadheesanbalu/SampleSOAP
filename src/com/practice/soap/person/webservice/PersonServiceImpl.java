/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.soap.person.webservice;

import com.practice.soap.person.bean.Person;
import com.practice.soap.person.service.PersonService;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author baluj
 */
public class PersonServiceImpl implements PersonService {

    Map<Integer, Person> persons = new HashMap<Integer, Person>();
    Person p = new Person();
    
    public PersonServiceImpl() {
        p.setId(0);
        p.setFirstname("Peter");
        p.setLastname("Evans");
        persons.put(0, p);
    }
    
    @Override
    public Person getPerson(Integer id) {
        
        if(null !=persons.get(id)) {
           return persons.get(id);
        }
        
        return null;
    }

    @Override
    public String addPerson(Integer id, String fname, String lname) {
        
        Person person = new Person();
        person.setId(id);
        person.setFirstname(fname);
        person.setLastname(lname);
        
        persons.put(id, person);
        
        return "Added Successfully";
        
        
    }
    
    
}
