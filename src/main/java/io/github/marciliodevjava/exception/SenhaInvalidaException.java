package io.github.marciliodevjava.exception;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException() {
        super("Senha inválida");
    }
}