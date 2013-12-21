package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.DefectseverityBO;
import com.tcs.bigfish.dao.DefectseverityDAO;
import com.tcs.bigfish.hibernate.Defectseverity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DefectseverityBOImpl implements DefectseverityBO
{

    private static final Log log = LogFactory.getLog(DefectseverityBOImpl.class);
   
    private DefectseverityDAO defectseverityDao;
    
    @Autowired
    public void setDefectseverityDao(DefectseverityDAO defectseverityDao)
    {
        this.defectseverityDao = defectseverityDao;
    }

    public void persist(Defectseverity transientInstance)
    {
        log.debug("persisting Defectseverity instance");
        defectseverityDao.persist(transientInstance);
    }

    public void remove(Defectseverity persistentInstance)
    {
        log.debug("removing Defectseverity instance");
        defectseverityDao.remove(persistentInstance);
    }

    public Defectseverity merge(Defectseverity detachedInstance)
    {
        log.debug("merging Defectseverity instance");
        Defectseverity result = defectseverityDao.merge(detachedInstance);
        return result;
    }

    public Defectseverity findById(int id)
    {
        log.debug((new StringBuilder("getting Defectseverity instance with id: ")).append(id).toString());
        Defectseverity instance = defectseverityDao.findById(id);
        return instance;
    }

}
