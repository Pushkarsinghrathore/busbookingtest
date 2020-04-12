package com.capgemini.bus_booking.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Customer;

public class CustomerDaoImplTest {

 	@Test
	public void test() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findById(11);
		 int expected =11;
		 assertEquals(11,11);
		 }
 	@Test
	public void test1() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findById(99);
		 int expected =11;
		 assertEquals(11,99);
		 }
    @Test
	public void test2() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findById(22);
		 int expected =22;
		 assertEquals(22,22);
		 }
	@Test
	public void test3() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findById(88);
		 int expected =33;
		 assertEquals(33,88);
		 }	
	@Test
	public void test4() {
			 CustomerDaoImpl helper = new  CustomerDaoImpl();
			 Customer actual = helper.findById(33);
			 int expected =33;
			 assertEquals(33,33);
			 }
	@Test
	public void test5() {
				 CustomerDaoImpl helper = new  CustomerDaoImpl();
				 Customer actual = helper.findById(33);
				 int expected =66;
				 assertEquals(66,33);
				 }
	@Test
	public void test6() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findById(44);
		 int expected =44;
		 assertEquals(44,44);
		 }
	@Test
	public void test7() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findById(44);
		 int expected =11;
		 assertEquals(44,11);
		 }
	
	@Test
	public void test11() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findByUsername("Dinesh");
		 String  expected = "Dinesh";
		 assertEquals("Dinesh","Dinesh");
		 }
	@Test
	public void test12() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findByUsername("Dinesh");
		 String  expected = "Pushkar";
		 assertEquals("Pushkar","Dinesh");
		 
		 }
	@Test
	public void test13() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findByUsername("Pushkar");
		 String  expected = "Pushkar";
		 assertEquals("Pushkar","Pushkar");
		 
		 }
	@Test
	public void test14() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findByUsername("Anmol");
		 String  expected = "Pushkar";
		 assertEquals("Pushkar","Anmol");
		 
		 }
	@Test
	public void test15() {
		 CustomerDaoImpl helper = new  CustomerDaoImpl();
		 Customer actual = helper.findByUsername("Ayushmaan");
		 String  expected = "Harshit";
		 assertEquals("Harshit","Ayushmaan");
		 
		 }
	
	
	
}
