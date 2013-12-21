package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Taskstatus;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface TaskstatusDAO {

	public void persist(Taskstatus transientInstance);

	public void remove(Taskstatus persistentInstance);

	public Taskstatus merge(Taskstatus detachedInstance);

	public Taskstatus findById(int id);
}
