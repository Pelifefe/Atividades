package pelifefe.pi.carstore.dao;

import pelifefe.pi.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;


public class CarDao {
    public void createCar(Car car){
        //Script SQL
        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try{
            //URL usuário e senha banco de dados
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexão database");

            //Recebe uma variavel tipo String com o comando SQL, preparando o java para receber
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            //Varíavel a ser colocada no parametro SQL (?)
            preparedStatement.setString(1, car.getName());
            preparedStatement.execute();

            System.out.println("Sucesso ao insertar dados Car");

            connection.close();

        }catch (Exception e){
            System.out.println("Falha na conexão database");
        }
    }
}
