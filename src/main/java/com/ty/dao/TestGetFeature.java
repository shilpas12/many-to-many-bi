package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Car;
import com.ty.dto.Feature;

public class TestGetFeature {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Feature fea = entityManager.find(Feature.class, 1);
		System.out.println(fea.getId());
		System.out.println(fea.getColor());
		System.out.println(fea.getAirbag());
		System.out.println("-----------------------------------");

		List<Car> car = fea.getCar();
		if (car != null) {
			for (Car c : car) {
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getBrand());

			}
		}

	}

}
