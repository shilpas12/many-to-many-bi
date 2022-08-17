package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class TestGetTeacher {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 1);
		System.out.println("Teacher id :" + teacher.getId());
		System.out.println("Teacher name: " + teacher.getName());
		System.out.println("Teacher Age: " + teacher.getAge());

		List<Subject> sub = teacher.getSubjects();

		if (!sub.isEmpty()) {
			for (Subject s : sub) {
				System.out.println("Subject id: " + s.getId());
				System.out.println("Subject name: " + s.getName());
				System.out.println("Subject Days: " + s.getDays());
				System.out.println("---------------------------");
			}
		}

	}

}
