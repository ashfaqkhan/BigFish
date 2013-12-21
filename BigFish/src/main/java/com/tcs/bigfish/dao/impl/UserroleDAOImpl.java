package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.UserroleBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Userrole;

/**
 * Home object for domain model class Userrole.
 * @see com.tcs.bigfish.hibernate.Userrole
 * @author Hibernate Tools
 */

public class UserroleDAOImpl extends BaseDAO implements UserroleBO {

	private static final Log log = LogFactory.getLog(UserroleDAOImpl.class);

	public void persist(Userrole transientInstance) {
		log.debug("persisting Userrole instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Userrole persistentInstance) {
		log.debug("removing Userrole instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Userrole merge(Userrole detachedInstance) {
		log.debug("merging Userrole instance");
		try {
			Userrole result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Userrole findById(int id) {
		log.debug("getting Userrole instance with id: " + id);
		try {
			Userrole instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
