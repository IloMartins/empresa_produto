package br.gov.al.empresa.produto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class DuplicatedIDException extends RuntimeException {
    private static final long serialVersionUID = 4466947587167705688L;

    public DuplicatedIDException(String message) {
        super(message);
    }
}