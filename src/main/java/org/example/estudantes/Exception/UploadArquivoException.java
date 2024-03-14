package org.example.estudantes.Exception;

public class UploadArquivoException extends RuntimeException {
    public UploadArquivoException(String mensagem) {
        super(mensagem);
    }

    public UploadArquivoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
