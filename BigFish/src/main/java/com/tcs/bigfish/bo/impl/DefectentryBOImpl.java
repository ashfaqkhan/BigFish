package com.tcs.bigfish.bo.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.tcs.bigfish.bo.DefectentryBO;
import com.tcs.bigfish.dao.DefectentryDAO;
import com.tcs.bigfish.hibernate.Defectentry;

public class DefectentryBOImpl implements DefectentryBO
{

    private static final Log log = LogFactory.getLog(DefectcauseBOImpl.class);
   
    private DefectentryDAO defectEntryDAO;
    
    @Autowired
    public void setDefectEntryDAO(DefectentryDAO defectEntryDAO) {
		this.defectEntryDAO = defectEntryDAO;
	}

    public void persist(Defectentry transientInstance)
    {
        log.debug("persisting Defectentry instance");
        defectEntryDAO.persist(transientInstance);
    }

    public void remove(Defectentry persistentInstance)
    {
        log.debug("removing Defectentry instance");
        defectEntryDAO.remove(persistentInstance);
    }

    public Defectentry merge(Defectentry detachedInstance)
    {
        log.debug("merging Defectentry instance");
        Defectentry result = defectEntryDAO.merge(detachedInstance);
        return result;
    }

    public Defectentry findById(int id)
    {
        log.debug((new StringBuilder("getting Defectentry instance with id: ")).append(id).toString());
        Defectentry instance = defectEntryDAO.findById(id);
        return instance;
    }

}
