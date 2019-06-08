package net.berduchev.internetmarket.service;

import net.berduchev.internetmarket.dao.GraphicsCardDao;
import net.berduchev.internetmarket.dao.PhonesDao;
import net.berduchev.internetmarket.model.GrphicsCard;

import javax.transaction.Transactional;
import java.util.List;

public class GraphocsCardServiceImpl implements GraficsCardService {
    private GraphicsCardDao graphicsCardDao;

    public  void setGraphicsCardDao(GraphicsCardDao graphicsCardDao){this.graphicsCardDao = graphicsCardDao;}

    @Override
    @Transactional
    public void addGraficsCard(GrphicsCard graphics) {
        this.graphicsCardDao.addGraficsCard(graphics);

    }

    @Override
    public void updateGraficsCard(GrphicsCard graphics) {
        this.graphicsCardDao.updateGraficsCard(graphics);
    }

    @Override
    public void removeGraficsCard(int id) {
        this.graphicsCardDao.removeGraficsCard(id);
    }

    @Override
    public GraphicsCardDao getGraficsCardById(int id) {return this.getGraficsCardById(id);}


    @Override
    public List<GrphicsCard> listGraficsCardList() {
        return this.graphicsCardDao.listGraficsCardList();
    }
}
