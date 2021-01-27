package com.educandoweb.course.services.exceptions;

import java.io.Serializable;

public class DatabaseException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 3650222384387947028L;

    public DatabaseException(String msg){
        super(msg);
    }
}
