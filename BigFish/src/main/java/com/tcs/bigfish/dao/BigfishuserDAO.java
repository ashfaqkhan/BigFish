package com.tcs.bigfish.dao;

import com.tcs.bigfish.hibernate.Bigfishuser;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.BO
 * @author Ashfaq
 */

public interface BigfishuserDAO {

	public void persist(Bigfishuser transientInstance);

	public void remove(Bigfishuser persistentInstance);

	public Bigfishuser merge(Bigfishuser detachedInstance);

	public Bigfishuser findById(int id);
}
