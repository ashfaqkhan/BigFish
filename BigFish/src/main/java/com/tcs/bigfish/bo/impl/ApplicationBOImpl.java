package com.tcs.bigfish.bo.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.bigfish.bo.ApplicationBO;
import com.tcs.bigfish.dao.ApplicationDAO;
import com.tcs.bigfish.hibernate.Application;

public class ApplicationBOImpl implements ApplicationBO
{

    private static final Log log = LogFactory.getLog(ApplicationBOImpl.class);
    
    private ApplicationDAO applicationDao;
    
    @Autowired
    public void setStockDao(ApplicationDAO applicationDao)
    {
        this.applicationDao = applicationDao;
    }

    public void persist(Application transientInstance)
    {
        log.debug("persisting Application instance");
        applicationDao.persist(transientInstance);
    }

    public void remove(Application persistentInstance)
    {
        log.debug("removing Application instance");
        applicationDao.remove(persistentInstance);
    }

    public Application merge(Application detachedInstance)
    {
        log.debug("merging Application instance");
        Application result = applicationDao.merge(detachedInstance);
        log.debug("merge successful");
        return result;
    }

    public Application findById(int id)
    {
        log.debug((new StringBuilder("getting Application instance with id: ")).append(id).toString());
        Application instance = applicationDao.findById(id);
        log.debug("get successful");
        return instance;
    }

}
