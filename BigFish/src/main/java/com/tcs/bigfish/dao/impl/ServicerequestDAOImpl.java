package com.tcs.bigfish.dao.impl;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tcs.bigfish.bo.ServicerequestBO;
import com.tcs.bigfish.dao.BaseDAO;
import com.tcs.bigfish.hibernate.Servicerequest;

/**
 * Home object for domain model class Servicerequest.
 * @see com.tcs.bigfish.hibernate.Servicerequest
 * @author Hibernate Tools
 */

public class ServicerequestDAOImpl extends BaseDAO  implements ServicerequestBO {

	private static final Log log = LogFactory.getLog(ServicerequestDAOImpl.class);

	public void persist(Servicerequest transientInstance) {
		log.debug("persisting Servicerequest instance");
		getHibernateTemplate().save(transientInstance);
	}

	public void remove(Servicerequest persistentInstance) {
		log.debug("removing Servicerequest instance");
		getHibernateTemplate().delete(persistentInstance);
	}

	public Servicerequest merge(Servicerequest detachedInstance) {
		log.debug("merging Servicerequest instance");
		Servicerequest result = getHibernateTemplate().merge(detachedInstance);;
		return result;
	}

	@SuppressWarnings("unchecked")
	public Servicerequest findById(String id) {
		log.debug("getting Servicerequest instance with id: " + id);
		List<Servicerequest> list =  getHibernateTemplate().find("from Servicerequest where serviceRequestId=",id);
		Servicerequest instance = list.get(0);
		return instance;
	}
}
