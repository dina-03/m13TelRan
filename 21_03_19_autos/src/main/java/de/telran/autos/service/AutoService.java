package de.telran.autos.service;

import de.telran.autos.entity.Auto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutoService {

  //  AutoGarage garage;

    public void paint(Auto auto, String color) {
        auto.setColor(color);
    }

    public void print(List<Auto> autos) {
        autos.forEach(System.out::println); // auto -> System.out
    }

    public void print(Auto auto) {
        System.out.println(auto);
    }
}
