package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DeployitemlistBO;
import com.tcs.bigfish.dao.DeployitemlistDAO;
import com.tcs.bigfish.hibernate.Deployitemlist;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DeployitemlistBOImpl implements DeployitemlistBO
{

    private static final Log log = LogFactory.getLog(DeployitemlistBOImpl.class);
    
    private DeployitemlistDAO deployitemlistDao;
    
    @Autowired
    public void setDeployitemlistDao(DeployitemlistDAO deployitemlistDao)
    {
        this.deployitemlistDao = deployitemlistDao;
    }

    public void persist(Deployitemlist transientInstance)
    {
        log.debug("persisting Deployitemlist instance");
        deployitemlistDao.persist(transientInstance);
    }

    public void remove(Deployitemlist persistentInstance)
    {
        log.debug("removing Deployitemlist instance");
        deployitemlistDao.remove(persistentInstance);
    }

    public Deployitemlist merge(Deployitemlist detachedInstance)
    {
        log.debug("merging Deployitemlist instance");
        Deployitemlist result = deployitemlistDao.merge(detachedInstance);
        return result;
    }

    public Deployitemlist findById(int id)
    {
        log.debug((new StringBuilder("getting Deployitemlist instance with id: ")).append(id).toString());
        Deployitemlist instance = deployitemlistDao.findById(id);
        return instance;
    }

}
