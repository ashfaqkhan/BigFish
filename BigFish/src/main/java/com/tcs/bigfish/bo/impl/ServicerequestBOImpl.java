package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.ServicerequestBO;
import com.tcs.bigfish.dao.ServicerequestDAO;
import com.tcs.bigfish.hibernate.Servicerequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicerequestBOImpl implements ServicerequestBO
{

    private static final Log log = LogFactory.getLog(ServicerequestBOImpl.class);
    
    private ServicerequestDAO servicerequestDao = null;
        
    @Autowired
    public void setServicerequestDao(ServicerequestDAO servicerequestDao) {
		this.servicerequestDao = servicerequestDao;
	}
    
    public void persist(Servicerequest transientInstance)
    {
        log.debug("persisting Servicerequest instance");
        servicerequestDao.persist(transientInstance);
    }

    public void remove(Servicerequest persistentInstance)
    {
        log.debug("removing Servicerequest instance");
        servicerequestDao.remove(persistentInstance);
    }

    public Servicerequest merge(Servicerequest detachedInstance)
    {
        log.debug("merging Servicerequest instance");
        Servicerequest result = servicerequestDao.merge(detachedInstance);
        return result;
    }

    public Servicerequest findById(String id)
    {
        log.debug((new StringBuilder("getting Servicerequest instance with id: ")).append(id).toString());
        Servicerequest instance = servicerequestDao.findById(id);
        return instance;
    }

}
