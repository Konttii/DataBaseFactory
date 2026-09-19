package org.dbfactory.product;

public class PostgreSqlConnection implements Connection{

    private boolean open = false;

    @Override
    public void open() {
        open = true;
        System.out.println("[PostgreSQL] Connection opened using JDBC driver (org.postgresql.Driver).");
    }

    @Override
    public void close() {
        open = false;
        System.out.println("[PostgreSQL] Connection closed.");
    }
    @Override
    public String describe() {return "PostgreSQL connection (open=" + open + ")";}

}