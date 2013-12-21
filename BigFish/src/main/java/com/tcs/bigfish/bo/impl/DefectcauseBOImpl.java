package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DefectcauseBO;
import com.tcs.bigfish.dao.DefectcauseDAO;
import com.tcs.bigfish.hibernate.Defectcause;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DefectcauseBOImpl implements DefectcauseBO
{

    private static final Log log = LogFactory.getLog(DefectcauseBOImpl.class);
    
    private DefectcauseDAO defectcauseDao;
   
    @Autowired
    public void setDefectcauseDao(DefectcauseDAO defectcauseDao)
    {
        this.defectcauseDao = defectcauseDao;
    }

    public void persist(Defectcause transientInstance)
    {
        log.debug("persisting Defectcause instance");
        defectcauseDao.persist(transientInstance);
    }

    public void remove(Defectcause persistentInstance)
    {
        log.debug("removing Defectcause instance");
        defectcauseDao.remove(persistentInstance);
    }

    public Defectcause merge(Defectcause detachedInstance)
    {
        log.debug("merging Defectcause instance");
        Defectcause result = defectcauseDao.merge(detachedInstance);
        return result;
    }

    public Defectcause findById(int id)
    {
        log.debug((new StringBuilder("getting Defectcause instance with id: ")).append(id).toString());
        Defectcause instance = defectcauseDao.findById(id);
        return instance;
    }

}
