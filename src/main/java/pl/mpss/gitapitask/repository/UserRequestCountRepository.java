package pl.mpss.gitapitask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mpss.gitapitask.model.UserRequestCount;

public interface UserRequestCountRepository extends JpaRepository<UserRequestCount, String> {
}
