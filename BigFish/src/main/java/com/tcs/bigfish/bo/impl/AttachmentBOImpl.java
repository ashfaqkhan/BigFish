package com.tcs.bigfish.bo.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.bigfish.bo.AttachmentBO;
import com.tcs.bigfish.dao.AttachmentDAO;
import com.tcs.bigfish.hibernate.Attachment;

public class AttachmentBOImpl implements AttachmentBO
{

    private static final Log log = LogFactory.getLog(AttachmentBOImpl.class);
    
    private AttachmentDAO attachmentDao;
    
    @Autowired
    public void setAttachmentDao(AttachmentDAO attachmentDao)
    {
        this.attachmentDao = attachmentDao;
    }

    public void persist(Attachment transientInstance)
    {
        log.debug("persisting Attachment instance");
        attachmentDao.persist(transientInstance);
    }

    public void remove(Attachment persistentInstance)
    {
        log.debug("removing Attachment instance");
        attachmentDao.remove(persistentInstance);
    }

    public Attachment merge(Attachment detachedInstance)
    {
        log.debug("merging Attachment instance");
        Attachment result = attachmentDao.merge(detachedInstance);
        return result;
    }

    public Attachment findById(int id)
    {
        log.debug((new StringBuilder("getting Attachment instance with id: ")).append(id).toString());
        Attachment instance = attachmentDao.findById(id);
        return instance;
    }

}
