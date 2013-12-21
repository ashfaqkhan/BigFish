package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Servicerequest;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface ServicerequestBO {

	public void persist(Servicerequest transientInstance);

	public void remove(Servicerequest persistentInstance);

	public Servicerequest merge(Servicerequest detachedInstance);

	public Servicerequest findById(String id);
}
