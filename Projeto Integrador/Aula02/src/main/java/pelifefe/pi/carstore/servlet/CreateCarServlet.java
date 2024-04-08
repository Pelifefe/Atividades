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

        String carModelo = request.getParameter("car-name");
        String carMarca = request.getParameter("car-modelo");
        String carCor = request.getParameter("car-cor");
        String carChassi = request.getParameter("car-chassi");
        String carPlaca = request.getParameter("car-placa");

        System.out.println(carModelo);
        Car car = new Car();
        car.setModelo(carModelo);
        car.setMarca(carMarca);
        car.setCor(carCor);
        car.setChassi(carChassi);
        car.setPlaca(carPlaca);

        new CarDao().createCar(car);

        request.getRequestDispatcher("index.html").forward(request, response);

    }
}
