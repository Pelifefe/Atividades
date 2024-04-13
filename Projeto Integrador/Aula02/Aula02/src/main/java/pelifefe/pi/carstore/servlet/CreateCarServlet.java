package pelifefe.pi.carstore.servlet;

import pelifefe.pi.carstore.dao.CarDao;
import pelifefe.pi.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Recebendo uma requisição do arquivo html do tipo POST, ele pega o parametro que vem do formulário
        String carName = request.getParameter("car-name");

        //Cria o novo objeto
        Car car = new Car();
        car.setName(carName); //Adciona na variavel name
        new CarDao().createCar(car); //E passa para o parametro DAO

        //Devolve a requisição para página index.html novamente
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
