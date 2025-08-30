package application;

import domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
	public static void main(String[] args) {

		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		Person p = em.find(Person.class, 1);
		System.out.println("Amor da minha vida: " + p);


		em.getTransaction().begin();
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}
