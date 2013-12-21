package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DeployrequestitemmapBO;
import com.tcs.bigfish.dao.DeployrequestitemmapDAO;
import com.tcs.bigfish.hibernate.Deployrequestitemmap;
import com.tcs.bigfish.hibernate.DeployrequestitemmapId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DeployrequestitemmapBOImpl implements DeployrequestitemmapBO
{

    private static final Log log = LogFactory.getLog(DeployrequestitemmapBOImpl.class);
    
    private DeployrequestitemmapDAO deployrequestitemmapDao = null;
    
    @Autowired
    public void setDeployrequestitemmapDao(DeployrequestitemmapDAO deployrequestitemmapDao)
    {
        this.deployrequestitemmapDao = deployrequestitemmapDao;
    }

    public void persist(Deployrequestitemmap transientInstance)
    {
        log.debug("persisting Deployrequestitemmap instance");
        deployrequestitemmapDao.persist(transientInstance);
    }

    public void remove(Deployrequestitemmap persistentInstance)
    {
        log.debug("removing Deployrequestitemmap instance");
        deployrequestitemmapDao.remove(persistentInstance);
    }

    public Deployrequestitemmap merge(Deployrequestitemmap detachedInstance)
    {
        log.debug("merging Deployrequestitemmap instance");
        Deployrequestitemmap result = deployrequestitemmapDao.merge(detachedInstance);
        return result;
    }

    public Deployrequestitemmap findById(DeployrequestitemmapId id)
    {
        log.debug((new StringBuilder("getting Deployrequestitemmap instance with id: ")).append(id).toString());
        Deployrequestitemmap instance = deployrequestitemmapDao.findById(id);
        return instance;
    }

}
