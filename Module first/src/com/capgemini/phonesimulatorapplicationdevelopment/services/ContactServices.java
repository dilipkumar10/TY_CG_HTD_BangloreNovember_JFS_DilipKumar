package com.capgemini.phonesimulatorapplicationdevelopment.services;

import java.util.List;

import com.capgemini.phonesimulatorapplicationdevelopment.bean.ContactBean;

public interface ContactServices {
public boolean add(ContactBean bean);
public boolean delete(String name);
public boolean edit(String name,long number);
public List<ContactBean> getAllContacts();
public boolean search(String name);
}
