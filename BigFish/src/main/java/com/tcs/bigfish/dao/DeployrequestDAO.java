package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Deployrequest;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DeployrequestDAO {

	
	public void persist(Deployrequest transientInstance);

	public void remove(Deployrequest persistentInstance);

	public Deployrequest merge(Deployrequest detachedInstance);

	public Deployrequest findById(String id);
}
