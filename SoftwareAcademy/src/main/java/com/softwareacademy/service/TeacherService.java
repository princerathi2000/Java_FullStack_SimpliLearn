package com.softwareacademy.service;

import java.util.Set;

import com.softwareacademy.dto.Teacher;


public interface TeacherService {
	public Integer addTeacher(Teacher Teacher);
    public void updateTeacher(int TeacherId,String address);
    public void deleteTeacher(int TeacherId);
    public Teacher searchTeacher(int TeacherId);
    public Set<Teacher> getAllTeachers();
}
