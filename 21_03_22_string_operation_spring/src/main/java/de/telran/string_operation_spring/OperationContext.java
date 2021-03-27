package de.telran.string_operation_spring;

import de.telran.string_operation_spring.service.operation.IStringOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// The object of the class returns a certain operation by its name
// TODO create a bean and place it to the ApplicationContext
public class OperationContext {

    private final Map<String, IStringOperation> operationByName;

    public OperationContext(List<IStringOperation> operations) {
        operationByName = operations.stream()
                .collect(Collectors.toMap(IStringOperation::getName, operation -> operation));

//        operationByName = new HashMap<>();
//        for (IStringOperation operation : operations) {
//            operationByName.put(operation.getName(), operation);
//        }
    }

    public IStringOperation getOperation(String name) {
        return operationByName.get(name);
    }
}
