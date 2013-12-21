package com.tcs.bigfish.bo.impl;

import com.tcs.bigfish.bo.TaskstatusBO;
import com.tcs.bigfish.dao.TaskstatusDAO;
import com.tcs.bigfish.hibernate.Taskstatus;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskstatusBOImpl implements TaskstatusBO
{

    private static final Log log = LogFactory.getLog(TaskstatusBOImpl.class);
    
    private TaskstatusDAO taskstatusDao = null;
   
    @Autowired
    public void setTaskstatusDao(TaskstatusDAO taskstatusDao)
    {
        this.taskstatusDao = taskstatusDao;
    }

    public void persist(Taskstatus transientInstance)
    {
        log.debug("persisting Taskstatus instance");
        taskstatusDao.persist(transientInstance);
    }

    public void remove(Taskstatus persistentInstance)
    {
        log.debug("removing Taskstatus instance");
        taskstatusDao.remove(persistentInstance);
    }

    public Taskstatus merge(Taskstatus detachedInstance)
    {
        log.debug("merging Taskstatus instance");
        Taskstatus result = taskstatusDao.merge(detachedInstance);
        return result;
    }

    public Taskstatus findById(int id)
    {
        log.debug((new StringBuilder("getting Taskstatus instance with id: ")).append(id).toString());
        Taskstatus instance = taskstatusDao.findById(id);
        return instance;
    }

}
