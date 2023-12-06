package org.vy.lib;
import org.vy.lib.statement.ClickHouseStatement;

public class Library {
    public static void main(String[] args) {

        try {
            ClickHouseStatement.executeQuery();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
