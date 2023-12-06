package org.vy.lib.statement;

import org.vy.lib.db.ClickHouseDbConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClickHouseStatement extends ClickHouseDbConnector {
    public static void executeQuery() {
        connect();
        String selectQuery = "select * from locations";
        try (PreparedStatement preparedStatement = getConnection().prepareStatement(selectQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("title");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnect();
        }
    }
}
