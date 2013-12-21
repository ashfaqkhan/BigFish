package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DeployitemtypeBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Deployitemtype;

/**
 * Home object for domain model class Deployitemtype.
 * @see com.tcs.bigfish.hibernate.Deployitemtype
 * @author Hibernate Tools
 */

public class DeployitemtypeDAOImpl extends BaseDAO  implements DeployitemtypeBO {

	private static final Log log = LogFactory.getLog(DeployitemtypeDAOImpl.class);

	public void persist(Deployitemtype transientInstance) {
		log.debug("persisting Deployitemtype instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Deployitemtype persistentInstance) {
		log.debug("removing Deployitemtype instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Deployitemtype merge(Deployitemtype detachedInstance) {
		log.debug("merging Deployitemtype instance");
		try {
			Deployitemtype result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Deployitemtype findById(int id) {
		log.debug("getting Deployitemtype instance with id: " + id);
		try {
			Deployitemtype instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
