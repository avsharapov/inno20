package stc.inno.realExample;


import stc.inno.realExample.dao.MobileDao;
import stc.inno.realExample.dao.MobileDaoJdbcImpl;
import stc.inno.realExample.pojo.Mobile;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(null, "Iphone 2", 25000, "Apple");
        MobileDao mobileDao = new MobileDaoJdbcImpl();
        mobileDao.addMobile(mobile);
        mobile = mobileDao.getMobileById(5);
        System.out.println(mobile);
        mobile.setPrice(70000);
        mobileDao.updateMobileById(mobile);
        mobile = mobileDao.getMobileById(5);
        System.out.println(mobile);
    }
}
