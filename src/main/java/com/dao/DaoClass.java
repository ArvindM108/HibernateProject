package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.*;
//ConfigClass
public class DaoClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Question question = new Question("What is Hibernate");

		Answers answer = new Answers(question, "Hibernate is a Java Framework and also a ORM Tool.");

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(question);
		session.save(answer);

		transaction.commit();

		Session session1 = sessionFactory.openSession();
		Question retrievedQuestion = session1.get(Question.class, question.getId());
		if (retrievedQuestion != null) {
			System.out.println("Question: " + retrievedQuestion.getQuestionText());
			System.out.println("Answers:");

			for (Answers ans : retrievedQuestion.getAnswers()) {
				System.out.println("- " + ans.getAnswerText());
			}
		}
  	}
}
