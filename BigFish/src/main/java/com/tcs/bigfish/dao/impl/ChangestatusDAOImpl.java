package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.tcs.bigfish.bo.ChangestatusBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Changestatus;

/**
 * Home object for domain model class Changestatus.
 * @see com.tcs.bigfish.hibernate.Changestatus
 * @author Hibernate Tools
 */
public class ChangestatusDAOImpl extends BaseDAO implements ChangestatusBO {

	private static final Log log = LogFactory.getLog(ChangestatusDAOImpl.class);

	public void persist(Changestatus transientInstance) {
		log.debug("persisting Changestatus instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Changestatus persistentInstance) {
		log.debug("removing Changestatus instance");
		getHibernateTemplate().save(persistentInstance);
	}

	public Changestatus merge(Changestatus detachedInstance) {
		log.debug("merging Changestatus instance");
		Changestatus result = getHibernateTemplate().merge(detachedInstance);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Changestatus findById(int id) {
		log.debug("getting Changestatus instance with id: " + id);
		List<Changestatus> list =  getHibernateTemplate().find("from Changestatus  where changeStatusId=", id);
		Changestatus instance = list.get(0);
		return instance;
	}
}
