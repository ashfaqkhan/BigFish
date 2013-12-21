package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DeploystageBO;
import com.tcs.bigfish.dao.DeploystageDAO;
import com.tcs.bigfish.hibernate.Deploystage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DeploystageBOImpl implements DeploystageBO
{

    private static final Log log = LogFactory.getLog(DeploystageBOImpl.class);
    
    private DeploystageDAO deploystageDao;
   
    @Autowired
    public void setDeploystageDao(DeploystageDAO deploystageDao)
    {
        this.deploystageDao = deploystageDao;
    }

    public void persist(Deploystage transientInstance)
    {
        log.debug("persisting Deploystage instance");
        deploystageDao.persist(transientInstance);
    }

    public void remove(Deploystage persistentInstance)
    {
        log.debug("removing Deploystage instance");
        deploystageDao.remove(persistentInstance);
    }

    public Deploystage merge(Deploystage detachedInstance)
    {
        log.debug("merging Deploystage instance");
        Deploystage result = deploystageDao.merge(detachedInstance);
        return result;
    }

    public Deploystage findById(int id)
    {
        log.debug((new StringBuilder("getting Deploystage instance with id: ")).append(id).toString());
        Deploystage instance = deploystageDao.findById(id);
        return instance;
    }

}
