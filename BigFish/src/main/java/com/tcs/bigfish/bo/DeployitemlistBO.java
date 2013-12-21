package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Deployitemlist;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DeployitemlistBO {

	public void persist(Deployitemlist transientInstance);
	
	public void remove(Deployitemlist persistentInstance);

	public Deployitemlist merge(Deployitemlist detachedInstance);

	public Deployitemlist findById(int id);
}
