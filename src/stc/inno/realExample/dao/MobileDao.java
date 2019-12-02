package stc.inno.realExample.dao;


import stc.inno.realExample.pojo.Mobile;

public interface MobileDao {
    public boolean addMobile(Mobile mobile);

    public Mobile getMobileById(Integer id);

    public boolean updateMobileById(Mobile mobile);

    public boolean deleteMobileById(Integer id);
}
