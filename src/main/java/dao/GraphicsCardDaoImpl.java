package dao;

import model.GrphicsCard;
import model.Phones;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.List;

public class GraphicsCardDaoImpl implements GraphicsCardDao {
    private  static final Logger LOGGER = LoggerFactory.getLogger(PhonesDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){this.sessionFactory = sessionFactory;}
    @Override
    public void addGraficsCard(GrphicsCard graphics) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(graphics);
        LOGGER.info("Phone successfully saved. phones details: " + graphics);
    }

    @Override
    public void updateGraficsCard(GrphicsCard graphics) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(graphics);
        LOGGER.info("Grafics successfully saved. phones details: " + graphics);
    }

    @Override
    public void removeGraficsCard(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        GrphicsCard graphics = (GrphicsCard) session.load(GrphicsCard.class, new Integer(id));

        if(graphics!=null){
            session.delete(graphics);
        }
        LOGGER.info("Book successfully removed. Book details: " + graphics);
    }

    @Override
    public GrphicsCard getGraficsCardById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        GrphicsCard graphics = (GrphicsCard) session.load(Phones.class, new Integer(id));
        LOGGER.info("Book successfully loaded. Book details: " + graphics);

        return graphics;

    }

    @Override
    public List<GrphicsCard> listGraficsCardList() {
        Session session = this.sessionFactory.getCurrentSession();
        List<GrphicsCard> graphicsList = session.createQuery("from GraphicsCard").list();

        for(GrphicsCard graphics: graphicsList){
            LOGGER.info("Phones list" + graphics);
        }
        return graphicsList;
    }
}
