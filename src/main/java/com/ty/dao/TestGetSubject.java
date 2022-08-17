package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class TestGetSubject {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Subject sub = entityManager.find(Subject.class, 1);
		System.out.println("Subject id: " + sub.getId());
		System.out.println("Subject name: " + sub.getName());
		System.out.println("Subject Days: " + sub.getDays());
		System.out.println("---------------------------");

		List<Teacher> teacher = sub.getTeachers();
		if (!teacher.isEmpty()) {
			for (Teacher t : teacher) {
				System.out.println("Teacher id :" + t.getId());
				System.out.println("Teacher name: " + t.getName());
				System.out.println("Teacher Age: " + t.getAge());
				System.out.println("-------------------------------");
			}
		}
	}

}
