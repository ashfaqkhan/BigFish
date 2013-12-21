package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.UsercommentsBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Usercomments;

/**
 * Home object for domain model class Usercomments.
 * @see com.tcs.bigfish.hibernate.Usercomments
 * @author Hibernate Tools
 */
public class UsercommentsDAOImpl extends BaseDAO implements UsercommentsBO {

	private static final Log log = LogFactory.getLog(UsercommentsDAOImpl.class);

	public void persist(Usercomments transientInstance) {
		log.debug("persisting Usercomments instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Usercomments persistentInstance) {
		log.debug("removing Usercomments instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Usercomments merge(Usercomments detachedInstance) {
		log.debug("merging Usercomments instance");
		Usercomments result = getHibernateTemplate().merge(detachedInstance);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Usercomments findById(int id) {
		log.debug("getting Usercomments instance with id: " + id);
		List<Usercomments> list = getHibernateTemplate().find("from Usercomments where commentId=",id);
		Usercomments instance = list.get(0);
		return instance;
	}
}
