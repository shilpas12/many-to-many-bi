package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class TestSaveTeacher {

	public static void main(String[] args) {
		List<Subject> subject = new ArrayList<Subject>();
		List<Teacher> teacher = new ArrayList<Teacher>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Subject sub = new Subject();
		sub.setName("JAVA");
		sub.setDays(85);
		subject.add(sub);

		Subject sub1 = new Subject();
		sub1.setName("ADA");
		sub1.setDays(45);
		subject.add(sub1);

		Subject sub2 = new Subject();
		sub2.setName("SQL");
		sub2.setDays(45);
		subject.add(sub2);

		Teacher tec = new Teacher();
		tec.setName("Tom");
		tec.setAge(29);
		teacher.add(tec);

		Teacher tec1 = new Teacher();
		tec1.setName("sanvi");
		tec1.setAge(24);
		teacher.add(tec1);

		Teacher tec2 = new Teacher();
		tec2.setName("shyam");
		tec2.setAge(24);
		teacher.add(tec2);

		sub.setTeachers(teacher);
		sub1.setTeachers(teacher);
		sub2.setTeachers(teacher);

		entityTransaction.begin();
		entityManager.persist(sub);
//		entityManager.persist(sub1);
		entityManager.persist(sub2);
		entityManager.persist(tec);
//		entityManager.persist(tec1);
//		entityManager.persist(tec2);
		entityTransaction.commit();

		System.out.println("-----DATA SAVED------");

	}

}
