package de.telran.shape.config;

import de.telran.shape.entity.Line;
import de.telran.shape.entity.Rectangle;
import de.telran.shape.service.Draw;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Line line(){
       return new Line(15,'-');
    }
    @Bean
    public Line line1(){
        return new Line(15,'+');
    }
    @Bean
    public Line line2(){
        return new Line(15,'.');
    }

    @Bean
   public Rectangle rectangle(){
        return new Rectangle(5, 10,'*');
    }
    @Bean
    public Rectangle rectangle1(){
        return new Rectangle(5, 10,'x');
    }

    @Bean
    public Draw draw(){
        return new Draw();
    }
}
