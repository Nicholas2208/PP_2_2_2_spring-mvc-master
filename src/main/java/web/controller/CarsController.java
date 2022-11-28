package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarsDao;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarsDao carsDao;

    public CarsController(CarsDao dao) {
        carsDao = dao;
    }

    @GetMapping
    public String showCars(Model model) {
        model.addAttribute("cars", carsDao.getCars());

        return "cars";
    }

    @GetMapping("/{limit}")
    public String showCars(@PathVariable("limit") int limit, Model model) {
        model.addAttribute("cars", carsDao.getCars(limit));

        return "cars";
    }
}
