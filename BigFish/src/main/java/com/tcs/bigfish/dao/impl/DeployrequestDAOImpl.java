package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DeployrequestBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Deployrequest;

/**
 * Home object for domain model class Deployrequest.
 * @see com.tcs.bigfish.hibernate.Deployrequest
 * @author Hibernate Tools
 */

public class DeployrequestDAOImpl extends BaseDAO  implements DeployrequestBO {

	private static final Log log = LogFactory.getLog(DeployrequestDAOImpl.class);

	public void persist(Deployrequest transientInstance) {
		log.debug("persisting Deployrequest instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Deployrequest persistentInstance) {
		log.debug("removing Deployrequest instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Deployrequest merge(Deployrequest detachedInstance) {
		log.debug("merging Deployrequest instance");
		try {
			Deployrequest result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Deployrequest findById(String id) {
		log.debug("getting Deployrequest instance with id: " + id);
		try {
			Deployrequest instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
