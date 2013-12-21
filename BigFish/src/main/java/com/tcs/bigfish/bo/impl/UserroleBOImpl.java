package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.UserroleBO;
import com.tcs.bigfish.dao.UserroleDAO;
import com.tcs.bigfish.hibernate.Userrole;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserroleBOImpl implements UserroleBO
{

    private static final Log log = LogFactory.getLog(UserroleBOImpl.class);
    
    private UserroleDAO userroleDao = null;
   
    @Autowired
    public void setUserroleDao(UserroleDAO userroleDao)
    {
        this.userroleDao = userroleDao;
    }

    public void persist(Userrole transientInstance)
    {
        log.debug("persisting Userrole instance");
        userroleDao.persist(transientInstance);
    }

    public void remove(Userrole persistentInstance)
    {
        log.debug("removing Userrole instance");
        userroleDao.remove(persistentInstance);
    }

    public Userrole merge(Userrole detachedInstance)
    {
        log.debug("merging Userrole instance");
        Userrole result = userroleDao.merge(detachedInstance);
        return result;
    }

    public Userrole findById(int id)
    {
        log.debug((new StringBuilder("getting Userrole instance with id: ")).append(id).toString());
        Userrole instance = userroleDao.findById(id);
        return instance;
    }

}
