package pt.com.alticci.http.repository;

import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.com.alticci.http.model.Alticci;

@Repository
public interface AlticciRepository extends JpaRepository<Alticci, Long> {
    @Cacheable(value="number")
    Optional<Alticci> findByNumber(Integer number);
}
