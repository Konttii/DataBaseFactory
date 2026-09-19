package org.DbFactory.product;

public interface Connection {

    void open();

    void close();

    String describe();
}
