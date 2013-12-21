package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Changestatus;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */
public interface ChangestatusBO {

	
	public void persist(Changestatus transientInstance);

	public void remove(Changestatus persistentInstance);

	public Changestatus merge(Changestatus detachedInstance);

	public Changestatus findById(int id);
}
