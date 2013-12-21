package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.tcs.bigfish.bo.AttachmentBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Attachment;

/**
 * Home object for domain model class Attachment.
 * @see com.tcs.bigfish.hibernate.Attachment
 * @author Hibernate Tools
 */

public class AttachmentDAOImpl extends BaseDAO  implements AttachmentBO {

	private static final Log log = LogFactory.getLog(AttachmentDAOImpl.class);

	public void persist(Attachment transientInstance) {
		log.debug("persisting Attachment instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Attachment persistentInstance) {
		log.debug("removing Attachment instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Attachment merge(Attachment detachedInstance) {
		log.debug("merging Attachment instance");
		Attachment result = getHibernateTemplate().merge(detachedInstance);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Attachment findById(int id) {
		log.debug("getting Attachment instance with id: " + id);
		List<Attachment> list = getHibernateTemplate().find("from Attachment where attachmentId=", id);
		Attachment instance = list.get(0);
		return instance;
	}
}
