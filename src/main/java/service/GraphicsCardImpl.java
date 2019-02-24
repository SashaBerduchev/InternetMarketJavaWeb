package service;

import dao.GraphicsCardDao;
import dao.PhonesDao;
import model.GrphicsCard;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.*;
import java.util.List;

@Service
public class GraphicsCardImpl implements GraficsCardService {
    private GraphicsCardDao graphicsCardDao;

    public  void setGraphicsCardDao(PhonesDao phonesDao){this.graphicsCardDao = graphicsCardDao;}

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
