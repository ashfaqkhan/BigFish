package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.ApplicationBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Application;

/**
 * Home object for domain model class Application.
 * @see com.tcs.bigfish.hibernate.Application
 * @author Hibernate Tools
 */
public class ApplicationDAOImpl extends BaseDAO implements ApplicationBO  {

	private static final Log log = LogFactory.getLog(ApplicationDAOImpl.class);
	
	public void persist(Application transientInstance) {
		log.debug("persisting Application instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Application persistentInstance) {
		log.debug("removing Application instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Application merge(Application detachedInstance) {
		log.debug("merging Application instance");
		Application result = getHibernateTemplate().merge(detachedInstance);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Application findById(int id) {
		log.debug("getting Application instance with id: " + id);
		List<Application> list = getHibernateTemplate().find("from Application where applicationId=?",id);
		Application instance = list.get(0);
		return instance;
	}
}
