package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DefecttypeBO;
import com.tcs.bigfish.dao.DefecttypeDAO;
import com.tcs.bigfish.hibernate.Defecttype;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DefecttypeBOImpl implements DefecttypeBO
{

    private static final Log log = LogFactory.getLog(DefecttypeBOImpl.class);
    
    private DefecttypeDAO defecttypeDao;
    
    @Autowired
    public void setDefecttypeDao(DefecttypeDAO defecttypeDao)
    {
        this.defecttypeDao = defecttypeDao;
    }

    public void persist(Defecttype transientInstance)
    {
        log.debug("persisting Defecttype instance");
        defecttypeDao.persist(transientInstance);
    }

    public void remove(Defecttype persistentInstance)
    {
        log.debug("removing Defecttype instance");
        defecttypeDao.remove(persistentInstance);
    }

    public Defecttype merge(Defecttype detachedInstance)
    {
        log.debug("merging Defecttype instance");
        Defecttype result = defecttypeDao.merge(detachedInstance);
        return result;
    }

    public Defecttype findById(int id)
    {
        log.debug((new StringBuilder("getting Defecttype instance with id: ")).append(id).toString());
        Defecttype instance = defecttypeDao.findById(id);
        return instance;
    }

}
