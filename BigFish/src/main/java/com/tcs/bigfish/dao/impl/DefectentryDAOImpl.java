package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DefectentryBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Defectentry;

/**
 * Home object for domain model class Defectentry.
 * @see com.tcs.bigfish.hibernate.Defectentry
 * @author Hibernate Tools
 */

public class DefectentryDAOImpl extends BaseDAO  implements DefectentryBO {

	private static final Log log = LogFactory.getLog(DefectentryDAOImpl.class);

	public void persist(Defectentry transientInstance) {
		log.debug("persisting Defectentry instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Defectentry persistentInstance) {
		log.debug("removing Defectentry instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Defectentry merge(Defectentry detachedInstance) {
		log.debug("merging Defectentry instance");
		try {
			Defectentry result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Defectentry findById(int id) {
		log.debug("getting Defectentry instance with id: " + id);
		try {
			Defectentry instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
