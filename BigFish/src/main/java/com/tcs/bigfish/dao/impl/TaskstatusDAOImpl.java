package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.tcs.bigfish.bo.TaskstatusBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Taskstatus;

/**
 * Home object for domain model class Taskstatus.
 * @see com.tcs.bigfish.hibernate.Taskstatus
 * @author Hibernate Tools
 */

public class TaskstatusDAOImpl extends BaseDAO  implements TaskstatusBO {

	private static final Log log = LogFactory.getLog(TaskstatusDAOImpl.class);

	public void persist(Taskstatus transientInstance) {
		log.debug("persisting Taskstatus instance");
		try {
			
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Taskstatus persistentInstance) {
		log.debug("removing Taskstatus instance");
		try {
			
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Taskstatus merge(Taskstatus detachedInstance) {
		log.debug("merging Taskstatus instance");
		try {
			Taskstatus result = null;
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Taskstatus findById(int id) {
		log.debug("getting Taskstatus instance with id: " + id);
		try {
			Taskstatus instance = null;
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
