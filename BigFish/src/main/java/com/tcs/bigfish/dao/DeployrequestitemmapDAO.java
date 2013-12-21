package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Deployrequestitemmap;
import com.tcs.bigfish.hibernate.DeployrequestitemmapId;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface DeployrequestitemmapDAO {

	
	public void persist(Deployrequestitemmap transientInstance);

	public void remove(Deployrequestitemmap persistentInstance);

	public Deployrequestitemmap merge(Deployrequestitemmap detachedInstance);

	public Deployrequestitemmap findById(DeployrequestitemmapId id);
}
