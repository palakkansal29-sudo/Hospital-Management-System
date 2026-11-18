package hospital.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {
    private DBConnection() {
    }

    public static Connection getConnection() throws SQLException {
        String url = System.getenv("HOSPITAL_DB_URL");
        String username = System.getenv("HOSPITAL_DB_USER");
        String password = System.getenv("HOSPITAL_DB_PASSWORD");

        if (url == null || url.isBlank()) {
            throw new SQLException("HOSPITAL_DB_URL environment variable is not set");
        }
        if (username == null || username.isBlank()) {
            throw new SQLException("HOSPITAL_DB_USER environment variable is not set");
        }
        if (password == null) {
            throw new SQLException("HOSPITAL_DB_PASSWORD environment variable is not set");
        }

        return DriverManager.getConnection(url, username, password);
    }
}
