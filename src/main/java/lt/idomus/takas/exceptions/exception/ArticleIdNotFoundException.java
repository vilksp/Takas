package lt.idomus.takas.exceptions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ArticleIdNotFoundException extends RuntimeException {
    public ArticleIdNotFoundException(String message) {
        super(message);
    }
}
