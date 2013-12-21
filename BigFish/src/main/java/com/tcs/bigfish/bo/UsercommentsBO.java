package com.tcs.bigfish.bo;

import com.tcs.bigfish.hibernate.Usercomments;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface UsercommentsBO {

	public void persist(Usercomments transientInstance);

	public void remove(Usercomments persistentInstance);

	public Usercomments merge(Usercomments detachedInstance);
	
	public Usercomments findById(int id);
}
