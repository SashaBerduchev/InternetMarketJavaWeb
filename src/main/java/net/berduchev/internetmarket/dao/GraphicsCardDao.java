package net.berduchev.internetmarket.dao;

import net.berduchev.internetmarket.model.GrphicsCard;
import net.berduchev.internetmarket.model.Phones;

import java.util.List;

public interface GraphicsCardDao {
    public void addGraficsCard(GrphicsCard graphics);

    public void updateGraficsCard(GrphicsCard graphics);

    public void removeGraficsCard(int id);

    public GrphicsCard getGraficsCardById(int id);

    public List<GrphicsCard> listGraficsCardList();
}
