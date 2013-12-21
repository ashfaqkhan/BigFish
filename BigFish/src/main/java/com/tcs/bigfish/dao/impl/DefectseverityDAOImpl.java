package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DefectseverityBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Defectseverity;

/**
 * Home object for domain model class Defectseverity.
 * @see com.tcs.bigfish.hibernate.Defectseverity
 * @author Hibernate Tools
 */

public class DefectseverityDAOImpl  extends BaseDAO implements DefectseverityBO {

	private static final Log log = LogFactory.getLog(DefectseverityDAOImpl.class);

	public void persist(Defectseverity transientInstance) {
		log.debug("persisting Defectseverity instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Defectseverity persistentInstance) {
		log.debug("removing Defectseverity instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Defectseverity merge(Defectseverity detachedInstance) {
		log.debug("merging Defectseverity instance");
		try {
			Defectseverity result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Defectseverity findById(int id) {
		log.debug("getting Defectseverity instance with id: " + id);
		try {
			Defectseverity instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
