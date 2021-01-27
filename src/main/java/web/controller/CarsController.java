package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") int countOfCars, ModelMap model){

        List<Car> carList= new ArrayList<>();

        carList.add(new Car(1L, "Mercedes", "AMG A35"));
        carList.add(new Car(2L, "BMW", "M340i xDrive"));
        carList.add(new Car(3L, "Lada", "Vesta Sport"));
        carList.add(new Car(4L, "Reno", "Arkana"));
        carList.add(new Car(5L, "MINI", "Clubman"));

        model.addAttribute("cars", carList);
        model.addAttribute("countOfCars", countOfCars);

        return "cars";
    }
}
