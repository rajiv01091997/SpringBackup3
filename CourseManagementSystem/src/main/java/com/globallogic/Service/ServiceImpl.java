package com.globallogic.Service;

import com.globallogic.Entity.Course;
import com.globallogic.Entity.FinalProject;
import com.globallogic.Entity.Student;
import com.globallogic.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl {
    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student)
    {
        Student student2=new Student();
        List<Course> courselist=new ArrayList<>();
        FinalProject fin=new FinalProject();

        student2.setId(student.getId());
        student2.setName(student.getName());
        student2.setAddress(student.getAddress());
        student2.setCourse(student.getCourse());

        fin.setDomain(student.getFinalProject().getDomain());
        fin.setProjectId(student.getFinalProject().getProjectId());
        fin.setProjectName(student.getFinalProject().getProjectName());


        for(Course cou:student.getCourseList())
        {
            Course course1 = new Course();
            course1.setCourseId(cou.getCourseId());
            course1.setCourseFee(cou.getCourseFee());
            course1.setCourseDuration(cou.getCourseDuration());
            course1.setCourseName(cou.getCourseName());
            course1.setStudent(student2);
            courselist.add(course1);

        }
        fin.setStudent(student2);
        student2.setCourseList(courselist);
        student2.setFinalProject(fin);

        studentRepo.save(student2);
        return student2;
    }
}
