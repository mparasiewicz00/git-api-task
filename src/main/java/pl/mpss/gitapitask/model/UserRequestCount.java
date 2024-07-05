package pl.mpss.gitapitask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class UserRequestCount {
    @Id
    private String login;
    private int requestCount;

}
