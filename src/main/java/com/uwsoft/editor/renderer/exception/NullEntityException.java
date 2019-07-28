package com.uwsoft.editor.renderer.exception;

/**
 * Created by sarpex on 09/07/2017.
 */
public class NullEntityException extends RuntimeException {
    public NullEntityException() {
        super();
    }

    public NullEntityException(String message) {
        super(message);
    }

    public NullEntityException(Throwable throwable) {
        super(throwable);
    }

    public NullEntityException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
