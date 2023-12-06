package org.bidv.lib;
import org.bidv.lib.statement.ClickHouseStatement;
public class BidvLibrary {
    public static void main(String[] args) {

        try {
            ClickHouseStatement.executeQuery();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
