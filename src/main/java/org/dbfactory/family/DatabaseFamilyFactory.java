package org.dbfactory.family;

import org.dbfactory.product.Connection;

public interface DatabaseFamilyFactory {

    Connection createConnection();

    Command cerateCommand();

    Transaction createTransaction();
}
