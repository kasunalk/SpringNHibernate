package autocomponent.serice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import autocomponent.dao.MicroControllerDao;

@Service
public class MicroControllerService {

    @Autowired
    private MicroControllerDao microControllerDao;

    public void setMicroControllerDao(MicroControllerDao microControllerDao) {
        this.microControllerDao = microControllerDao;
    }

    @Override
    public String toString() {
        return "MicroControllerService{" +
                "microControllerDao=" + microControllerDao +
                '}';
    }
}
