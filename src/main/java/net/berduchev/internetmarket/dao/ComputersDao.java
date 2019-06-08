package net.berduchev.internetmarket.dao;

import net.berduchev.internetmarket.model.Computers;

import java.util.List;

public interface ComputersDao {

    void addComputersCard(Computers computers);

    void updateComputersCard(Computers computers);

    void removeComputersCard(int id);

    Computers getComputersCardById(int id);

    List<Computers> listComputersCardList();
}
