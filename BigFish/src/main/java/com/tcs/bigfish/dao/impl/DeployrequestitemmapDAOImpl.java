package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DeployrequestitemmapBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Deployrequestitemmap;
import com.tcs.bigfish.hibernate.DeployrequestitemmapId;

/**
 * Home object for domain model class Deployrequestitemmap.
 * @see com.tcs.bigfish.hibernate.Deployrequestitemmap
 * @author Hibernate Tools
 */

public class DeployrequestitemmapDAOImpl extends BaseDAO  implements DeployrequestitemmapBO {

	private static final Log log = LogFactory
			.getLog(DeployrequestitemmapDAOImpl.class);

	public void persist(Deployrequestitemmap transientInstance) {
		log.debug("persisting Deployrequestitemmap instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Deployrequestitemmap persistentInstance) {
		log.debug("removing Deployrequestitemmap instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Deployrequestitemmap merge(Deployrequestitemmap detachedInstance) {
		log.debug("merging Deployrequestitemmap instance");
		try {
			Deployrequestitemmap result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Deployrequestitemmap findById(DeployrequestitemmapId id) {
		log.debug("getting Deployrequestitemmap instance with id: " + id);
		try {
			Deployrequestitemmap instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
