package dev.repository;

import dev.domain.Income;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaxRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveIncome(Income income) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(income);
            session.getTransaction().commit();
        }
    }

}
