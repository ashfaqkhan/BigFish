package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DeploytypeBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Deploytype;

/**
 * Home object for domain model class Deploytype.
 * @see com.tcs.bigfish.hibernate.Deploytype
 * @author Hibernate Tools
 */

public class DeploytypeDAOImpl extends BaseDAO  implements DeploytypeBO {

	private static final Log log = LogFactory.getLog(DeploytypeDAOImpl.class);

	public void persist(Deploytype transientInstance) {
		log.debug("persisting Deploytype instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Deploytype persistentInstance) {
		log.debug("removing Deploytype instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Deploytype merge(Deploytype detachedInstance) {
		log.debug("merging Deploytype instance");
		try {
			Deploytype result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Deploytype findById(int id) {
		log.debug("getting Deploytype instance with id: " + id);
		try {
			Deploytype instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
