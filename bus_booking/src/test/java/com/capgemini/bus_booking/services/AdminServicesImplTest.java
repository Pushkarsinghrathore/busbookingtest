package com.capgemini.bus_booking.services;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Customer;
import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.dao.AdminDaoImpl;
import com.capgemini.bus_booking.dao.BusDao;
import com.capgemini.bus_booking.dao.BusDaoImpl;
import com.capgemini.bus_booking.dao.CustomerDaoImpl;
import com.capgemini.bus_booking.dao.RouteDaoImpl;

import junit.framework.Assert;

public class AdminServicesImplTest {

	BusDaoImpl asi = new BusDaoImpl();
	AdminDaoImpl s = new AdminDaoImpl();
	
	
	
	@Test
	public void  cancelBusTest() {
		int busid = 1;
		int expected = asi.getLbusList().size()-1;
		asi.remove(1 );
		int actual = asi.getLbusList().size();
		assertEquals(expected,actual);
	}
	
	@Test
	public void  cancelBusTest1() {
		int busid = 2;
		int expected = asi.getLbusList().size()-1;
		asi.remove(2);
		int actual = asi.getLbusList().size();
		assertEquals(2,2);
	}
	@Test
	public void  cancelRouteTest2() {
		int routeid = 22;
		int expected = asi.getLbusid().size()-1;
		asi.remove(22);
		int actual = asi.getLbusList().size();
		assertEquals(22,22);
	}
	
	@Test
	public void  cancelRouteTest3() {
		int routeId = 11;
		int expected = asi.getLbusList().size();
		asi.remove(11);
		int actual = asi.getLbusList().size();
		assertEquals(11,11);
	}
	
	
	
	
	
	
	
	
	

	
	
		
}
