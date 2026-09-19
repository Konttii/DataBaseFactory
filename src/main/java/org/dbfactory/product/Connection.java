package org.dbfactory.product;

public interface Connection {

    void open();

    void close();

    String describe();
}
