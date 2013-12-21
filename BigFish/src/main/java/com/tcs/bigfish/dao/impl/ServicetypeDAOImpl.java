package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.ServicetypeBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Servicetype;

/**
 * Home object for domain model class Servicetype.
 * @see com.tcs.bigfish.hibernate.Servicetype
 * @author Hibernate Tools
 */

public class ServicetypeDAOImpl extends BaseDAO  implements ServicetypeBO {

	private static final Log log = LogFactory.getLog(ServicetypeDAOImpl.class);

	public void persist(Servicetype transientInstance) {
		log.debug("persisting Servicetype instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Servicetype persistentInstance) {
		log.debug("removing Servicetype instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Servicetype merge(Servicetype detachedInstance) {
		log.debug("merging Servicetype instance");
		try {
			Servicetype result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Servicetype findById(int id) {
		log.debug("getting Servicetype instance with id: " + id);
		try {
			Servicetype instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
