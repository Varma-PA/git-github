package org.store.book_store.services;

public interface IAdminService {

    Boolean signedIn(String userName, String sessionId);

    Boolean verify(String userName, String password);

    void insertSesionId(String sessionId);

}
