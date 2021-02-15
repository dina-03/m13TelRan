package de.telran;

import de.telran.operation.OperationContext;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    private static final String INPUT = "input.txt";
    private static final String OUTPUT = "output.txt";

    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException,
            NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        ConfigReader configReader = new ConfigReader("config.props");
        List<String> operationPath = configReader.getOperationPaths();
        OperationContext operationContext = new OperationContext(operationPath);

        BufferedReader br = new BufferedReader(new FileReader(INPUT));
        PrintWriter writer = new PrintWriter(new FileOutputStream(OUTPUT));
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Thread consumerThread1 = new Thread(new Consumer(queue, writer, operationContext));
        Thread consumerThread2 = new Thread(new Consumer(queue, writer, operationContext));
        Thread consumerThread3 = new Thread(new Consumer(queue, writer, operationContext));
        Thread supplierThread = new Thread(new Supplier(br, queue));

       /* consumerThread1.setDaemon(true);
        consumerThread2.setDaemon(true);
        consumerThread3.setDaemon(true);*/

        supplierThread.start();

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

       // while (supplierThread.isAlive() || !queue.isEmpty())
            supplierThread.join();

        consumerThread1.interrupt();
        consumerThread2.interrupt();
        consumerThread3.interrupt();

        //wait for consumer until then are done with the rest element
        consumerThread1.join();
        consumerThread2.join();
        consumerThread3.join();

        writer.close();
        br.close();
    }
}
