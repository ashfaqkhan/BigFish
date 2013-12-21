package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Deployitemtype;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DeployitemtypeBO {

	public void persist(Deployitemtype transientInstance);

	public void remove(Deployitemtype persistentInstance);

	public Deployitemtype merge(Deployitemtype detachedInstance);

	public Deployitemtype findById(int id);
}
