package com.example.Cruds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Cruds.Model.Entity;
import com.example.Cruds.Service.Iservice;
import com.example.Cruds.repo.Repository;


@SpringBootTest
class CrudOperationApplicationTests {

	@Test
	void contextLoads() {
	}
     @MockBean
	private Repository repository;
	
     @Autowired
     private Iservice iservice;
     
     @Test
     public void getEmployeesTest()
     {
    	 when(repository.findAll()).thenReturn(Stream.of(new Entity(1,"Rajiv","kolkata",90000L),
    			 new Entity(2,"vishal","dankuni",980000L)).collect(Collectors.toList())
    			 );
    	 assertEquals(2, iservice.getEmployees().size());
     }
     @Test
     public void saveEmployee()
     {
    	 Entity entity=new Entity(10,"vishal","chennai",70000);
    	 when(repository.save(entity)).thenReturn(entity);
    	 assertEquals(entity, iservice.saveEmployee(entity));
     }
     
     
}
