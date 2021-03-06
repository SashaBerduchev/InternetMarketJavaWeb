package net.berduchev.internetmarket.dao;


import net.berduchev.internetmarket.model.Computers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComputersDaoImpl implements ComputersDao {
    private  static final Logger LOGGER = LoggerFactory.getLogger(ComputersDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){this.sessionFactory = sessionFactory;}

    @Override
    public void addComputersCard(Computers computers) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(computers);
        LOGGER.info("computers successfully saved. phones details: " + computers);

    }

    @Override
    public void updateComputersCard(Computers computers) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(computers);
        LOGGER.info("computers successfully saved. phones details: " + computers);

    }

    @Override
    public void removeComputersCard(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Computers computers = (Computers) session.load(Computers.class, new Integer(id));

        if(computers!=null){
            session.delete(computers);
        }
        LOGGER.info("Book successfully removed. Book details: " + computers);
    }


    @Override
    public Computers getComputersCardById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Computers computers = (Computers) session.load(Computers.class, new Integer(id));
        LOGGER.info("Computers successfully loaded. Computers details: " + computers);

        return computers;

    }


    @Override
    public List<Computers> listComputersCardList() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Computers> computersList = session.createQuery("from Computers").list();

        for(Computers graphics: computersList) {
            LOGGER.info("Computers list" + graphics);
        }
        return computersList;
        }
}
