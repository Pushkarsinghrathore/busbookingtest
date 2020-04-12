package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Admin;

public class AdminDaoImpl implements AdminDao {

	List<Admin> ladmin = new ArrayList<Admin>();

	public AdminDaoImpl() {
		super();
		ladmin.add(new Admin(111, "RATHORE", "RATHORE@gmail.com", "RATHORE567@#"));
		ladmin.add(new Admin(222, "Pushkar", "pushkar@gmail.com", "pushkar$%12"));
	}

	public List<Admin> getadminList() {
		return ladmin;
	}

	@Override
	public void addAdminDao(Admin admin1) {
		ladmin.add(admin1);
	}

	@Override
	public Admin findByUsername(String username) {
		Admin admin = ladmin.stream().filter(x -> username.equals(x.getAdmin_name())).findAny().orElse(null);
		return admin;
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}
}
