package service;

import dao.GraphicsCardDao;
import model.GrphicsCard;

import java.awt.*;
import java.util.List;

public interface GraficsCardService {
    public void addGraficsCard(GrphicsCard graphics);

    public void updateGraficsCard(GrphicsCard graphics);

    public void removeGraficsCard(int id);

    public GraphicsCardDao getGraficsCardById(int id);

    public List<GrphicsCard> listGraficsCardList();
}