package net.berduchev.internetmarket.service;

import net.berduchev.internetmarket.dao.GraphicsCardDao;
import net.berduchev.internetmarket.model.GrphicsCard;

import java.util.List;

public interface GraficsCardService {
    public void addGraficsCard(GrphicsCard graphics);

    public void updateGraficsCard(GrphicsCard graphics);

    public void removeGraficsCard(int id);

    public GraphicsCardDao getGraficsCardById(int id);

    public List<GrphicsCard> listGraficsCardList();
}