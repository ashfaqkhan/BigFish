package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DeployrequestBO;
import com.tcs.bigfish.dao.DeployrequestDAO;
import com.tcs.bigfish.hibernate.Deployrequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DeployrequestBOImpl implements DeployrequestBO
{

    private static final Log log = LogFactory.getLog(DeployrequestBOImpl.class);
    
    private DeployrequestDAO deployrequestDao = null;
    
    @Autowired
    public void setDeployrequestDAO(DeployrequestDAO deployrequestDao) {
		this.deployrequestDao = deployrequestDao;
	}

	public void persist(Deployrequest transientInstance)
    {
        log.debug("persisting Deployrequest instance");
        deployrequestDao.persist(transientInstance);
    }

    public void remove(Deployrequest persistentInstance)
    {
        log.debug("removing Deployrequest instance");
        deployrequestDao.remove(persistentInstance);
    }

    public Deployrequest merge(Deployrequest detachedInstance)
    {
        log.debug("merging Deployrequest instance");
        Deployrequest result = deployrequestDao.merge(detachedInstance);
        return result;
    }

    public Deployrequest findById(String id)
    {
        log.debug((new StringBuilder("getting Deployrequest instance with id: ")).append(id).toString());
        Deployrequest instance = deployrequestDao.findById(id);
        return instance;
    }

}
