package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.ChangestatusBO;
import com.tcs.bigfish.dao.ChangestatusDAO;
import com.tcs.bigfish.hibernate.Changestatus;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ChangestatusBOImpl implements ChangestatusBO
{

    private static final Log log = LogFactory.getLog(ChangestatusBOImpl.class);
    
    private ChangestatusDAO changestatusDao = null;
    
    @Autowired
    public void setChangestatusDao(ChangestatusDAO changestatusDao)
    {
        this.changestatusDao = changestatusDao;
    }

    public void persist(Changestatus transientInstance)
    {
        log.debug("persisting Changestatus instance");
        changestatusDao.persist(transientInstance);
    }

    public void remove(Changestatus persistentInstance)
    {
        log.debug("removing Changestatus instance");
        changestatusDao.remove(persistentInstance);
    }

    public Changestatus merge(Changestatus detachedInstance)
    {
        log.debug("merging Changestatus instance");
        Changestatus result = changestatusDao.merge(detachedInstance);
        return result;
    }

    public Changestatus findById(int id)
    {
        log.debug((new StringBuilder("getting Changestatus instance with id: ")).append(id).toString());
        Changestatus instance = changestatusDao.findById(id);
        return instance;
    }

}
