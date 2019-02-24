package service;

import dao.ComputersDao;
import model.Computers;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ComputersServiceImpl implements ComputerService {
    private ComputersDao computersDao;

    @Override
    @Transactional
    public void addComputersCard(Computers computers) {
        this.computersDao.addComputersCard(computers);
    }

    @Override
    public void updateComputersCard(Computers computers) {
        this.computersDao.updateComputersCard(computers);

    }

    @Override
    public void removeComputersCard(int id) {
        this.computersDao.removeComputersCard(id);
    }

    @Override
    public ComputersDao getComputersCardById(int id) {
        return this.getComputersCardById(id);
    }

    @Override
    public List<Computers> listComputersCardList() {
        return this.listComputersCardList();
    }
}
