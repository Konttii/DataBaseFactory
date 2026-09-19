package org.dbfactory.product;

public class MySqlConnection implements Connection {

    private boolean open = false;

    @Override
    public void open(){
        open = true;
        System.out.println("[MySQL] Connection openned using JBDC driver (com.mysql.cj.jdbc.Driver).");
    }

    @Override
    public void close(){
        open = false;
        System.out.println("[My SQL] Connection closed");
    }

    @Override
    public String describe(){return "MySQL connection (open="+ open + ")";}
}