package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.UsercommentsBO;
import com.tcs.bigfish.dao.UsercommentsDAO;
import com.tcs.bigfish.hibernate.Usercomments;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UsercommentsBOImpl implements UsercommentsBO
{

    private static final Log log = LogFactory.getLog(UsercommentsBOImpl.class);
    
    private UsercommentsDAO usercommentsDao = null;
    
    @Autowired
    public void setUsercommentsDao(UsercommentsDAO usercommentsDao)
    {
        this.usercommentsDao = usercommentsDao;
    }

    public void persist(Usercomments transientInstance)
    {
        log.debug("persisting Usercomments instance");
        usercommentsDao.persist(transientInstance);
    }

    public void remove(Usercomments persistentInstance)
    {
        log.debug("removing Usercomments instance");
        usercommentsDao.remove(persistentInstance);
    }

    public Usercomments merge(Usercomments detachedInstance)
    {
        log.debug("merging Usercomments instance");
        Usercomments result = usercommentsDao.merge(detachedInstance);
        return result;
    }

    public Usercomments findById(int id)
    {
        log.debug((new StringBuilder("getting Usercomments instance with id: ")).append(id).toString());
        Usercomments instance = usercommentsDao.findById(id);
        return instance;
    }

}
