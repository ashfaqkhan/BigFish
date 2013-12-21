package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.UserdepartmentBO;
import com.tcs.bigfish.dao.UserdepartmentDAO;
import com.tcs.bigfish.hibernate.Userdepartment;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserdepartmentBOImpl implements UserdepartmentBO
{

    private static final Log log = LogFactory.getLog(UserdepartmentBOImpl.class);
    
    private UserdepartmentDAO userdepartmentDao =null;
    
    @Autowired
    public void setUserdepartmentDao(UserdepartmentDAO userdepartmentDao)
    {
        this.userdepartmentDao = userdepartmentDao;
    }

    public void persist(Userdepartment transientInstance)
    {
        log.debug("persisting Userdepartment instance");
        userdepartmentDao.persist(transientInstance);
    }

    public void remove(Userdepartment persistentInstance)
    {
        log.debug("removing Userdepartment instance");
        userdepartmentDao.remove(persistentInstance);
    }

    public Userdepartment merge(Userdepartment detachedInstance)
    {
        log.debug("merging Userdepartment instance");
        Userdepartment result = userdepartmentDao.merge(detachedInstance);
        return result;
    }

    public Userdepartment findById(int id)
    {
        log.debug((new StringBuilder("getting Userdepartment instance with id: ")).append(id).toString());
        Userdepartment instance = userdepartmentDao.findById(id);
        return instance;
    }

}
