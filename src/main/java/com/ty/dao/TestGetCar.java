package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Car;
import com.ty.dto.Feature;

public class TestGetCar {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Car car = entityManager.find(Car.class, 1);
		System.out.println(car.getId());
		System.out.println(car.getName());
		System.out.println(car.getBrand());

		List<Feature> fea = car.getFeature();
		if (fea != null) {
			for (Feature f : fea) {
				System.out.println(f.getId());
				System.out.println(f.getColor());
				System.out.println(f.getAirbag());
				System.out.println("-----------------------------------");

			}
		}
	}

}
