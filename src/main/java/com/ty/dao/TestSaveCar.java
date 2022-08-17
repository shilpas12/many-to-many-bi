package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Car;
import com.ty.dto.Feature;

public class TestSaveCar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Feature> listFea = new ArrayList<Feature>();

		Feature fea = new Feature();
		fea.setColor("black");
		fea.setAirbag(4);
		listFea.add(fea);

		Feature fea1 = new Feature();
		fea1.setColor("Red");
		fea1.setAirbag(2);
		listFea.add(fea1);

//		Feature fea2 = new Feature();
//		fea2.setColor("Blue");
//		fea2.setAirbag(8);
//		listFea.add(fea2);

		Car car = new Car();
		car.setName("BMW X5");
		car.setBrand("BMW");
		car.setFeature(listFea);
		
//		Car car1 = new Car();
//		car1.setName("Audi");
//		car1.setBrand("Audi");
//		car1.setFeature(listFea);

		entityTransaction.begin();
		entityManager.persist(fea);
		entityManager.persist(fea1);
//		entityManager.persist(fea2);
//		entityManager.persist(car1);
		entityManager.persist(car);
		entityTransaction.commit();

		System.out.println("-----DATA SAVED------");
	}

}
