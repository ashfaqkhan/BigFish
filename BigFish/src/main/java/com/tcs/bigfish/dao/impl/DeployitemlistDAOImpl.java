package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DeployitemlistBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Deployitemlist;

/**
 * Home object for domain model class Deployitemlist.
 * @see com.tcs.bigfish.hibernate.Deployitemlist
 * @author Hibernate Tools
 */

public class DeployitemlistDAOImpl extends BaseDAO  implements DeployitemlistBO {

	private static final Log log = LogFactory.getLog(DeployitemlistDAOImpl.class);

	public void persist(Deployitemlist transientInstance) {
		log.debug("persisting Deployitemlist instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Deployitemlist persistentInstance) {
		log.debug("removing Deployitemlist instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Deployitemlist merge(Deployitemlist detachedInstance) {
		log.debug("merging Deployitemlist instance");
		try {
			Deployitemlist result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Deployitemlist findById(int id) {
		log.debug("getting Deployitemlist instance with id: " + id);
		try {
			Deployitemlist instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
