package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.LandBean;

public interface LandServices {
public boolean add(LandBean land);
public boolean delete(int id);
public boolean updateName(int id,String name);
public boolean updateSize(int id,int size);
public boolean updateProduct(int id,String product);
public List<LandBean> getAllLands();
}
