package de.telran.shapesnew;

import de.telran.shapesnew.entity.Line;
import de.telran.shapesnew.entity.Picture;
import de.telran.shapesnew.entity.Shape;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShapeFlow implements ApplicationRunner {
    private final List<Line> lines;
    private final Picture picture;
    private final Picture picture2;

    public ShapeFlow(List<Line> lines, Picture picture, Picture picture2) {
        this.lines = lines;
        this.picture = picture;
        this.picture2 = picture2;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        picture.draw();

        picture2.draw();

        lines.forEach(Shape::draw);
    }
}
