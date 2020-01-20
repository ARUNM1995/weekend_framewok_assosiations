package com.am.association.util;

import java.util.ArrayList;

import com.am.association.dao.CommonDao;
import com.am.association.entity.Captain;
import com.am.association.entity.ChiefMinister;
import com.am.association.entity.Company;
import com.am.association.entity.Product;
import com.am.association.entity.State;
import com.am.association.entity.Team;

public class Test {
	public static void main(String[] args) {
		/*
		 * Team team = new Team(); team.setName("India"); team.setSize(new Long(11));
		 * 
		 * Captain captain = new Captain(); captain.setAge(new Long(25));
		 * captain.setName("Virat Kohli");
		 * 
		 * team.setCaptain(captain);
		 * 
		 * CommonDao dao = new CommonDao(); dao.save(team);
		 * System.out.println("dat save successfully");
		 */

		/*
		ChiefMinister chiefMinister = new ChiefMinister("Arvind kejerwal", new Long(108), new Long(50), "delhi");
		State state = new State();
		state.setArea("100000sft");
		state.setName("Delhi");
		state.setPopulation(new Long(200));
		state.setChiefMinister(chiefMinister);
		CommonDao dao = new CommonDao();
		dao.saveStateDetails(state);
		System.out.println("dat save successfully");
		*/
		
				ArrayList<Product> list = new ArrayList<Product>() ;
				
				Product p1 = new Product("googleMap", new Double(100),"map");
				Product p2 = new Product("echo", new Double(100),"talk");
				Product p3 = new Product("duo", new Double(100),"videocall");
				
				list.add(p1);
				list.add(p2);
				list.add(p3);
				
				Company comapany = new Company();
				comapany.setName("google");
				comapany.setUrl("www.google.com");
				comapany.setLocation("california");
				comapany.setProductList(list);
				
				CommonDao commonDao = new CommonDao();
				commonDao.saveCompanyDetails(comapany);
				System.out.println("data saved");
				
				
				
				
				
				
				
				
	}
}
