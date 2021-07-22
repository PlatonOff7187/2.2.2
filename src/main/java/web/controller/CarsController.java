package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/cars")
@Controller
public class CarsController {

    @Autowired
    private CarService carService;
     @GetMapping
    public String printTable(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        if (count == null|| count>5) {
            count = 5;
        }
        List<Car> messages = carService.getCars(count);
        model.addAttribute("cars", messages);
        return "cars";
    }
}