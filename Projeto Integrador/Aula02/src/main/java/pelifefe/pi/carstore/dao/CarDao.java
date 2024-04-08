package pelifefe.pi.carstore.dao;
import pelifefe.pi.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDao {
    public void createCar(Car car){
        String SQL = "INSERT INTO CAR (modelo, marca, cor) VALUES (?, ?, ?, ?, ?)";

        String user = "sa";
        String password = "sa";
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", user, password);

            System.out.println("Sucesso na conexão com a database");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, car.getModelo());
            preparedStatement.setString(2, car.getMarca());
            preparedStatement.setString(3, car.getCor());
            preparedStatement.setString(4, car.getChassi());
            preparedStatement.setString(5, car.getPlaca());
            preparedStatement.execute();

            System.out.println("Sucesso no Insert Car");
            connection.close();

        }catch (Exception e){
            System.out.println("Falha na conexão com a database");
        }
    }
}
