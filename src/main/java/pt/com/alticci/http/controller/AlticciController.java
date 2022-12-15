package pt.com.alticci.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.alticci.http.service.AlticciService;

@RestController
@RequestMapping("/")
public class AlticciController {
    
    @Autowired
    AlticciService service; 

    @GetMapping("/alticci/{value}")
    public ResponseEntity<Long> alticci(@PathVariable Integer value) {
        return new ResponseEntity<Long>(
            service.call(value), 
            HttpStatus.OK
        );
    }
    
}
