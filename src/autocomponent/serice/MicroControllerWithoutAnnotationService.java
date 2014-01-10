package autocomponent.serice;

import autocomponent.dao.MicroControllerWithoutAnnotationDao;

public class MicroControllerWithoutAnnotationService {

    private MicroControllerWithoutAnnotationDao microControllerDao;

    public void setMicroControllerDao(MicroControllerWithoutAnnotationDao microControllerDao) {
        this.microControllerDao = microControllerDao;
    }

    @Override
    public String toString() {
        return "MicroControllerServiceWithoutAnnotation{" +
                "microControllerDaoWithoutAnnotation=" + microControllerDao +
                '}';
    }
}
