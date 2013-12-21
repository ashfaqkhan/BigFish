package com.tcs.bigfish.bo.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.tcs.bigfish.bo.ChangerequestBO;
import com.tcs.bigfish.dao.ChangerequestDAO;
import com.tcs.bigfish.hibernate.Changerequest;

public class ChangerequestBOImpl implements ChangerequestBO
{

    private static final Log log = LogFactory.getLog(ChangerequestBOImpl.class);
    
    private ChangerequestDAO changeRequestDAO = null;
    
    @Autowired
    public void setChangeRequestDAO(ChangerequestDAO changeRequestDAO) {
		this.changeRequestDAO = changeRequestDAO;
	}
	
    public void persist(Changerequest transientInstance)
    {
        log.debug("persisting Changerequest instance");
        changeRequestDAO.persist(transientInstance);
    }

    public void remove(Changerequest persistentInstance)
    {
        log.debug("removing Changerequest instance");
        changeRequestDAO.remove(persistentInstance);
    }

    public Changerequest merge(Changerequest detachedInstance)
    {
        log.debug("merging Changerequest instance");
        Changerequest result = changeRequestDAO.merge(detachedInstance);
        return result;
    }

    public Changerequest findById(String id)
    {
        log.debug((new StringBuilder("getting Changerequest instance with id: ")).append(id).toString());
        Changerequest instance = changeRequestDAO.findById(id);
        return instance;
    }

}