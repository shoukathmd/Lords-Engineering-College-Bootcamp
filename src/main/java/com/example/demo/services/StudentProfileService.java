package com.example.demo.services;

import com.example.demo.studentprofile.StudentProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class StudentProfileService {
   // ArrayList<StudentProfile> studentProfileArrayList = new ArrayList<>();
    HashMap<Long, StudentProfile> map = new HashMap<>();

    // create functionality in service

    public void createStudentProfile(StudentProfile studentProfile) {
        map.put(studentProfile.getStudentId(), studentProfile);
    }

    public void updateStudentProfile(StudentProfile studentProfile) {
        //Get the matching profile from the warehouse/db and update the object
        map.put(studentProfile.getStudentId(), studentProfile);
    }

    public void delete(Long studentId) {
        map.remove(studentId);
    }

    public StudentProfile getStudentProfileById(Long studentId) {
        return map.get(studentId);
    }


}
