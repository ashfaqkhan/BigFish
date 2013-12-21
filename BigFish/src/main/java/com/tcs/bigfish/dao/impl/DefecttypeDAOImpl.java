package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DefecttypeBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Defecttype;

/**
 * Home object for domain model class Defecttype.
 * @see com.tcs.bigfish.hibernate.Defecttype
 * @author Hibernate Tools
 */

public class DefecttypeDAOImpl  extends BaseDAO implements DefecttypeBO {

	private static final Log log = LogFactory.getLog(DefecttypeDAOImpl.class);

	public void persist(Defecttype transientInstance) {
		log.debug("persisting Defecttype instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Defecttype persistentInstance) {
		log.debug("removing Defecttype instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Defecttype merge(Defecttype detachedInstance) {
		log.debug("merging Defecttype instance");
		try {
			Defecttype result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Defecttype findById(int id) {
		log.debug("getting Defecttype instance with id: " + id);
		try {
			Defecttype instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
