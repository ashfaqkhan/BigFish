package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.ChangerequestBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Changerequest;

/**
 * Home object for domain model class Changerequest.
 * @see com.tcs.bigfish.hibernate.Changerequest
 * @author Hibernate Tools
 */

public class ChangerequestDAOImpl extends BaseDAO  implements ChangerequestBO {

	private static final Log log = LogFactory.getLog(ChangerequestDAOImpl.class);

	public void persist(Changerequest transientInstance) {
		log.debug("persisting Changerequest instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Changerequest persistentInstance) {
		log.debug("removing Changerequest instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Changerequest merge(Changerequest detachedInstance) {
		log.debug("merging Changerequest instance");
		try {
			Changerequest result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Changerequest findById(String id) {
		log.debug("getting Changerequest instance with id: " + id);
		try {
			Changerequest instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
