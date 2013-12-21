package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DefectcauseBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Defectcause;

/**
 * Home object for domain model class Defectcause.
 * @see com.tcs.bigfish.hibernate.Defectcause
 * @author Hibernate Tools
 */

public class DefectcauseDAOImpl extends BaseDAO  implements DefectcauseBO {

	private static final Log log = LogFactory.getLog(DefectcauseDAOImpl.class);

	public void persist(Defectcause transientInstance) {
		log.debug("persisting Defectcause instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Defectcause persistentInstance) {
		log.debug("removing Defectcause instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Defectcause merge(Defectcause detachedInstance) {
		log.debug("merging Defectcause instance");
		try {
			Defectcause result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Defectcause findById(int id) {
		log.debug("getting Defectcause instance with id: " + id);
		try {
			Defectcause instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
