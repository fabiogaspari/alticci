package pt.com.alticci.http.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import pt.com.alticci.http.model.Alticci;
import pt.com.alticci.http.repository.AlticciRepository;

@Service
public class AlticciService {
    
    @Autowired
    AlticciRepository repository;

    @Cacheable(value="alticci")
    public Long call(Integer n) {
        Alticci alticci = new Alticci();
        
        Optional<Alticci> oAlticci = repository.findByNumber(n);
        if ( oAlticci.isPresent() ) return oAlticci.get().getVal();

        Long value = alticci(n);
        
        alticci.setNumber(n);
        alticci.setVal(value);
        repository.save(alticci);
        
        return value;
    }

    public Long alticci(Integer n) {
        
        switch( n ) {
            case 0: {
                return 0L;
            }
            case 1: {
                return 1L;
            }
            case 2: {
                return 1L;
            }
            default: {
                return alticci(n-3) + alticci(n-2);
            }
        }
    }

}
