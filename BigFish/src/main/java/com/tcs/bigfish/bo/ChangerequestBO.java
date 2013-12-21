package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Changerequest;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface ChangerequestBO {

	public void persist(Changerequest transientInstance);

	public void remove(Changerequest persistentInstance);

	public Changerequest merge(Changerequest detachedInstance);

	public Changerequest findById(String id);
}
