package com.tcs.bigfish.bo;

// Generated Dec 11, 2012 2:39:04 PM by Hibernate Tools 3.4.0.CR1

import com.tcs.bigfish.hibernate.Attachment;

/**
 * Interface class for domain model.
 * @see com.tcs.bigfish.hibernate.dao
 * @author Ashfaq
 */

public interface AttachmentBO {

	public void persist(Attachment transientInstance);

	public void remove(Attachment persistentInstance);

	public Attachment merge(Attachment detachedInstance);

	public Attachment findById(int id);
}
