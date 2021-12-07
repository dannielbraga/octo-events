package br.com.jayatech.octoevents.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseError {
    private Integer statusCode;
    private List<String> message;

    public ResponseError(Integer statusCode, String messageError){
        this.statusCode = statusCode;
        this.message = Collections.singletonList(messageError);
    }
}
