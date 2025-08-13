package com.example.demo.services;

import com.example.demo.studentprofile.StudentProfile;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentProfileService {
   // ArrayList<StudentProfile> studentProfileArrayList = new ArrayList<>();
    HashMap<Long, StudentProfile> map = new HashMap<>();

    // create functionality in service

    public void createStudentProfile(StudentProfile studentProfile) {
        map.put(studentProfile.getStudentId(), studentProfile);
    }

    public void updateStudentProfile(StudentProfile studentProfile) {
        //Get the matching profile from the warehouse/db and update the object
        for(StudentProfile existingProfile : studentProfileArrayList) {
            if(studentProfile.getStudentId().equals(existingProfile.getStudentId())) {
                existingProfile.setBranch(studentProfile.getBranch());
                existingProfile.setName(studentProfile.getName());
                existingProfile.setSection(studentProfile.getSection());
            }
        }
    }

    public void delete(Long studentId) {
        int i = 0;
        for (; i < studentProfileArrayList.size(); i++) {
            if(studentProfileArrayList.get(i).equals(studentId)) {
                break;
            }
        }
        studentProfileArrayList.remove(i);
    }

    public StudentProfile getStudentProfileById(Long id) {
        for(StudentProfile existingProfile: studentProfileArrayList){
            if(existingProfile.getStudentId().equals(id)) {
                return existingProfile;
            }
        }
        return null;
    }


}
