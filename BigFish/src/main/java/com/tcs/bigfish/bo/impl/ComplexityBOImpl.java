package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.ComplexityBO;
import com.tcs.bigfish.dao.ComplexityDAO;
import com.tcs.bigfish.hibernate.Complexity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ComplexityBOImpl implements ComplexityBO
{

    private static final Log log = LogFactory.getLog(ComplexityBOImpl.class);
    
    private ComplexityDAO complexityDao = null;
    
    @Autowired
    public void setComplexityDao(ComplexityDAO complexityDao)
    {
        this.complexityDao = complexityDao;
    }

    public void persist(Complexity transientInstance)
    {
        log.debug("persisting Complexity instance");
        complexityDao.persist(transientInstance);
    }

    public void remove(Complexity persistentInstance)
    {
        log.debug("removing Complexity instance");
        complexityDao.remove(persistentInstance);
    }

    public Complexity merge(Complexity detachedInstance)
    {
        log.debug("merging Complexity instance");
        Complexity result = complexityDao.merge(detachedInstance);
        return result;
    }

    public Complexity findById(int id)
    {
        log.debug((new StringBuilder("getting Complexity instance with id: ")).append(id).toString());
        Complexity instance = complexityDao.findById(id);
        return instance;
    }

}
