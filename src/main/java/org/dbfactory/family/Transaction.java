package org.dbfactory.family;

public interface Transaction {

    void begin();

    void commit();

    void rollback();
}
