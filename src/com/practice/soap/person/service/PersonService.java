/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.soap.person.service;

import com.practice.soap.person.bean.Person;

/**
 *
 * @author baluj
 */
public interface PersonService {
    
    public Person getPerson(Integer id);
    
    public String addPerson(Integer id, String firstname, String lastname);
}
