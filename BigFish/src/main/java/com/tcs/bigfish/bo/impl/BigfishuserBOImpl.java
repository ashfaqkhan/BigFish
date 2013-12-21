package com.tcs.bigfish.bo.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.tcs.bigfish.bo.BigfishuserBO;
import com.tcs.bigfish.dao.BigfishuserDAO;
import com.tcs.bigfish.hibernate.Bigfishuser;

public class BigfishuserBOImpl implements BigfishuserBO
{

    private static final Log log = LogFactory.getLog(BigfishuserBOImpl.class);
    
    private BigfishuserDAO bigfishuserDao = null;
    
    @Autowired
    public void setBigfishuserDao(BigfishuserDAO bigfishuserDao)
    {
        this.bigfishuserDao = bigfishuserDao;
    }

    public void persist(Bigfishuser transientInstance)
    {
        log.debug("persisting Bigfishuser instance");
        bigfishuserDao.persist(transientInstance);
    }

    public void remove(Bigfishuser persistentInstance)
    {
        log.debug("removing Bigfishuser instance");
        bigfishuserDao.remove(persistentInstance);
    }

    public Bigfishuser merge(Bigfishuser detachedInstance)
    {
        log.debug("merging Bigfishuser instance");
        Bigfishuser result = bigfishuserDao.merge(detachedInstance);
        return result;
    }

    public Bigfishuser findById(int id)
    {
        log.debug((new StringBuilder("getting Bigfishuser instance with id: ")).append(id).toString());
        Bigfishuser instance = bigfishuserDao.findById(id);
        return instance;
    }

}