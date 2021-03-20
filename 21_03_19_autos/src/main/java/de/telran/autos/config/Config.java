package de.telran.autos.config;

import de.telran.autos.OrderFlow;
import de.telran.autos.entity.Auto;
import de.telran.autos.service.AutoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class Config {

    //this bean will be placed into the Application Context and name is 'opel'
    @Bean
    @Qualifier("simpleAutos")
    public Auto opel() {
        return new Auto(3, "Opel", "grey", LocalDate.of(2015, 1, 1), 50000);
    }

    @Bean
    @Qualifier("simpleAutos")
    public Auto mazda() {
        return new Auto(2, "Mazda", "red", LocalDate.of(2018, 7, 15), 25000);
    }

    @Bean
    public Auto bentley() {
        return new Auto(1, "Bentley", "black", LocalDate.of(2005, 6, 25), 5000);
    }

    @Bean
    public OrderFlow orderFlow(@Qualifier("simpleAutos") List<Auto> simpleAutos, Auto bentley, AutoService autoService) {
        return new OrderFlow(simpleAutos, bentley, autoService);
    }
}
