package com.capgemini.bus_booking;

import static org.junit.Assert.*; 

import org.junit.Test;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.dao.AdminDaoImpl;


public class AdminDaoImplTest {

	@Test
	public void test1(){
		                AdminDaoImpl helper = new AdminDaoImpl();
				        Admin actual = helper.findByUsername("Pushkar");
				        String expected ="Pushkar";
						//assertEquals("Pushkar","Pushkar");

	}

	@Test
	public void test2() {
		                 AdminDaoImpl helper = new AdminDaoImpl();
		                 Admin actual = helper.findByUsername("Rathore");
		                 String expected ="Rathore";
				         // assertEquals("Rathore","Rathore");
}
	
	@Test
	public void test3() {
		                  AdminDaoImpl helper = new AdminDaoImpl();
		                  Admin actual = helper.findByUsername("Yash");
		                  String expected ="Pushkar";
				          assertEquals("Pushkar","Ammu");

}
	
	
	@Test
	public void test4() {
		                AdminDaoImpl helper = new AdminDaoImpl();
		                 Admin actual = helper.findByUsername("Dinesh");
		                 String expected ="Ammu";
		
				        assertEquals("Ammu","Dinesh");

}
	

}
