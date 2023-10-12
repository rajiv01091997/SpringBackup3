
package com.globallogic.Application;

import com.globallogic.Dto.StudentDto;
import com.globallogic.Exceptions.StudentNotPresent;
import com.globallogic.Service.Service;

public class Utility {

	public static void main(String[] args) {
		
		Service service=new Service();
		
		StudentDto dto=new StudentDto("101","shubham","UK","shubh@gmail.com");
		service.addStudent(dto);

	
		
//System.out.println(service.findStudent("101"));
		
		
		
//System.out.println(service.getStudent());
		
		
//try {
//service.deleteStudent("103");
//}
//catch(StudentNotPresent s)
//{
//	System.out.println(s.getMsg());
//}
//		
		
		
//StudentDto dto=new StudentDto("102","Ayush","Dehradun","nirajyadav733@gmail.com");
//try {
//service.updateStudent("102", dto);
//    }
//catch(StudentNotPresent s)
//   {
//	System.out.println(s.getMsg());
//   }

		

		
	}

}
