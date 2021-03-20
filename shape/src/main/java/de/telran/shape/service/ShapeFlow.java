package de.telran.shape.service;

import de.telran.shape.entity.Line;
import de.telran.shape.entity.Rectangle;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ShapeFlow implements ApplicationRunner {
    Line line;
    Line line1;
    Line line2;
    Rectangle rectangle;
    Rectangle rectangle1;
    Draw draw;

    public ShapeFlow(Line line, Line line1, Line line2, Rectangle rectangle, Rectangle rectangle1, Draw draw) {
        this.line = line;
        this.line1 = line1;
        this.line2 = line2;
        this.rectangle = rectangle;
        this.rectangle1 = rectangle1;
        this.draw = draw;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        draw.print(line,rectangle,line1,rectangle1,line2);
    }
}
