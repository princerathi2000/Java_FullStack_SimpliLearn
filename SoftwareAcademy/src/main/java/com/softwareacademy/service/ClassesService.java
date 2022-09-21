package com.softwareacademy.service;

import java.util.Set;

import com.softwareacademy.dto.Classes;


public interface ClassesService {
	public Integer addClasses(Classes classes);
    public void updateClasses(int ClassesId,String className);
    public void deleteClasses(int ClassesId);
    public Classes searchClasses(int ClassesId);
    public Set<Classes> getAllClassess();
}
