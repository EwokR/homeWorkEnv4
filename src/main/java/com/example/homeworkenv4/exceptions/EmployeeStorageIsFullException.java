package com.example.homeworkenv4.exceptions;

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException() {
        super();
    }

    public EmployeeStorageIsFullException(String message) {
        super(message);
    }

    public EmployeeStorageIsFullException(String message, Throwable t) {
        super(message,t);
    }

    public EmployeeStorageIsFullException(Throwable t) {
        super(t);
    }
}
