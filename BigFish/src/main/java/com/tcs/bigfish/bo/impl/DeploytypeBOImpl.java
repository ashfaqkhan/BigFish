package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DeploytypeBO;
import com.tcs.bigfish.dao.DeploytypeDAO;
import com.tcs.bigfish.hibernate.Deploytype;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DeploytypeBOImpl
    implements DeploytypeBO
{

    private static final Log log = LogFactory.getLog(DeploytypeBOImpl.class);
    
    private DeploytypeDAO deploytypeDao = null;
   
    @Autowired
    public void setDeploytypeDao(DeploytypeDAO deploytypeDao)
    {
        this.deploytypeDao = deploytypeDao;
    }

    public void persist(Deploytype transientInstance)
    {
        log.debug("persisting Deploytype instance");
        deploytypeDao.persist(transientInstance);
    }

    public void remove(Deploytype persistentInstance)
    {
        log.debug("removing Deploytype instance");
        deploytypeDao.remove(persistentInstance);
    }

    public Deploytype merge(Deploytype detachedInstance)
    {
        log.debug("merging Deploytype instance");
        Deploytype result = deploytypeDao.merge(detachedInstance);
        return result;
    }

    public Deploytype findById(int id)
    {
        log.debug((new StringBuilder("getting Deploytype instance with id: ")).append(id).toString());
        Deploytype instance = deploytypeDao.findById(id);
        return instance;
    }

}
