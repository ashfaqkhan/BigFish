package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DeployitemtypeBO;
import com.tcs.bigfish.dao.DeployitemtypeDAO;
import com.tcs.bigfish.hibernate.Deployitemtype;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DeployitemtypeBOImpl implements DeployitemtypeBO
{

    private static final Log log = LogFactory.getLog(DeployitemtypeBOImpl.class);
    
    private DeployitemtypeDAO deployitemtypeDao;
    
    @Autowired
    public void setDeployitemtypeDao(DeployitemtypeDAO deployitemtypeDao)
    {
        this.deployitemtypeDao = deployitemtypeDao;
    }

    public void persist(Deployitemtype transientInstance)
    {
        log.debug("persisting Deployitemtype instance");
        deployitemtypeDao.persist(transientInstance);
    }

    public void remove(Deployitemtype persistentInstance)
    {
        log.debug("removing Deployitemtype instance");
        deployitemtypeDao.remove(persistentInstance);
    }

    public Deployitemtype merge(Deployitemtype detachedInstance)
    {
        log.debug("merging Deployitemtype instance");
        Deployitemtype result = deployitemtypeDao.merge(detachedInstance);
        return result;
    }

    public Deployitemtype findById(int id)
    {
        log.debug((new StringBuilder("getting Deployitemtype instance with id: ")).append(id).toString());
        Deployitemtype instance = deployitemtypeDao.findById(id);
        return instance;
    }

}
