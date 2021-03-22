package de.telran.shapesnew.config;

import de.telran.shapesnew.entity.Line;
import de.telran.shapesnew.entity.Picture;
import de.telran.shapesnew.entity.Rectangle;
import de.telran.shapesnew.entity.Shape;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class ShapesConfiguration {
    @Bean
    @Qualifier("q_picture2")
    public Line line1() {
        return new Line('x', 10);
    }

    @Bean
    @Qualifier("q_picture")
    @Order(1)
    public Line line2() {
        return new Line('-', 12);
    }

    @Qualifier("q_picture")
    @Order(3)
    @Bean
    public Line line3() {
        return new Line('+', 17);
    }

    @Qualifier("q_picture")
    @Order(2)
    @Bean
    public Rectangle rectangle1() {
        return new Rectangle('=', 20, 10);
    }

    @Bean
    @Qualifier("q_picture2")
    public Rectangle rectangle2() {
        return new Rectangle('*', 20, 10);
    }

    @Bean
    public Picture picture(@Qualifier("q_picture") Shape[] shapes) {
        return new Picture('s', shapes);
    }

    @Bean
    public Picture picture2(@Qualifier("q_picture2") Shape[] shapes) {
        return new Picture('s', shapes);
    }
}
