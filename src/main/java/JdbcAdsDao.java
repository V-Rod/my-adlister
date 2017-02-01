import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

/**
 * Created by V-Rod on 2/1/17.
 */
public class JdbcAdsDao implements Ads {

    private Connection connection;

    public JdbcAdsDao () throws SQLException {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        // Similar to using mysql -u user -p
        //use database adlister_db;
        connection = DriverManager.getConnection("jdbc:mysql://localhost/adlister_db",
                "codeup_test_user",
                "Password"
        );
    }

    @Override
    public List<Ad> all() {
        String sql = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");

                Ad ad = new Ad(id, title, description);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}
