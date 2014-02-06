package org.keycloak.models.mongo.api;

import org.keycloak.models.mongo.api.context.MongoStoreInvocationContext;

/**
 * Entity with Id
 *
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public interface MongoIdentifiableEntity extends MongoEntity {

    public String getId();

    public void setId(String id);

    /**
     * Lifecycle callback, which is called after removal of this object from Mongo.
     * It may be useful for triggering removal of wired objects.
     */
    void afterRemove(MongoStore mongoStore, MongoStoreInvocationContext invocationContext);
}
