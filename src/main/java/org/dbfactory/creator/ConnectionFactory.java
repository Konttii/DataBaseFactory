package org.dbfactory.creator;

import org.dbfactory.product.Connection;

public abstract class ConnectionFactory {

    protected abstract Connection createConnection();

    public final String connectionAndDescribe(){
        Connection connection = createConnection();
        connection.open();
        String info = connection.describe();
        connection.close();
        return info;
    }
}

