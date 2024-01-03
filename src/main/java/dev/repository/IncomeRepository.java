package dev.repository;

import dev.domain.Income;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IncomeRepository {

    private final SessionFactory sessionFactory;

    public IncomeRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Income income) {
        Session session = sessionFactory.getCurrentSession();
        session.save(income);
    }

    public void edit(Income income) {
        Session session = sessionFactory.getCurrentSession();
        session.update(income);
    }

    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Income income = get(id);
        session.delete(income);
    }

    public List<Income> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Income> incomeQuery = session.createQuery("FROM Income", Income.class);
        return incomeQuery.getResultList();
    }

    public Income get(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Income.class, id);
    }
}
