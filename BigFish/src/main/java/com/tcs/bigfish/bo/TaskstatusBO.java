package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Taskstatus;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface TaskstatusBO {

	public void persist(Taskstatus transientInstance);

	public void remove(Taskstatus persistentInstance);

	public Taskstatus merge(Taskstatus detachedInstance);

	public Taskstatus findById(int id);
}
