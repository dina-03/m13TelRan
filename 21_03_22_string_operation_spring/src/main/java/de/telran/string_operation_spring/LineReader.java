package de.telran.string_operation_spring;

import de.telran.string_operation_spring.service.StringHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class LineReader implements ApplicationRunner {
    private String filename;
    private final StringHandler handler;

    public LineReader(@Value("${de.telran.string_operation_spring.input.file.path}")String filename,
                      StringHandler handler) {
        this.filename = filename;
        this.handler = handler;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                handler.handleString(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
