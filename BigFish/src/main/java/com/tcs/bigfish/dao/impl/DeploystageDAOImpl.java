package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.DeploystageBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Deploystage;

/**
 * Home object for domain model class Deploystage.
 * @see com.tcs.bigfish.hibernate.Deploystage
 * @author Hibernate Tools
 */

public class DeploystageDAOImpl extends BaseDAO  implements DeploystageBO {

	private static final Log log = LogFactory.getLog(DeploystageDAOImpl.class);

	public void persist(Deploystage transientInstance) {
		log.debug("persisting Deploystage instance");
	    getHibernateTemplate().save(transientInstance);
	}

	public void remove(Deploystage persistentInstance) {
		log.debug("removing Deploystage instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Deploystage merge(Deploystage detachedInstance) {
		log.debug("merging Deploystage instance");
		Deploystage result = getHibernateTemplate().merge(detachedInstance);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Deploystage findById(int id) {
		log.debug("getting Deploystage instance with id: " + id);
		List<Deploystage> list = getHibernateTemplate().find("from Deploystage where deployStageId=", id );
		Deploystage instance = list.get(0);
		return instance;
	}
}
