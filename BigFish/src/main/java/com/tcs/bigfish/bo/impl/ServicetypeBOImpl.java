package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.ServicetypeBO;
import com.tcs.bigfish.dao.ServicetypeDAO;
import com.tcs.bigfish.hibernate.Servicetype;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicetypeBOImpl implements ServicetypeBO
{

    private static final Log log = LogFactory.getLog(ServicetypeBOImpl.class);
    
    private ServicetypeDAO servicetypeDao =null;
    
    @Autowired
    public void setServicetypeDao(ServicetypeDAO servicetypeDao)
    {
        this.servicetypeDao = servicetypeDao;
    }

    public void persist(Servicetype transientInstance)
    {
        log.debug("persisting Servicetype instance");
        servicetypeDao.persist(transientInstance);
    }

    public void remove(Servicetype persistentInstance)
    {
        log.debug("removing Servicetype instance");
        servicetypeDao.remove(persistentInstance);
    }

    public Servicetype merge(Servicetype detachedInstance)
    {
        log.debug("merging Servicetype instance");
        Servicetype result = servicetypeDao.merge(detachedInstance);
        return result;
    }

    public Servicetype findById(int id)
    {
        log.debug((new StringBuilder("getting Servicetype instance with id: ")).append(id).toString());
        Servicetype instance = servicetypeDao.findById(id);
        return instance;
    }

}
