package com.zhuinden.sparkexperiment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Owner on 2017. 03. 29..
 */
@RequestMapping("api")
@Controller
public class ApiController {
    @Autowired
    WordCount wordCount;


    
    @Autowired
    Mysql mysql;
    
    @RequestMapping("wordcount")
    public ResponseEntity<List<Count>> words() {
        return new ResponseEntity<>(wordCount.count(), HttpStatus.OK);
    }
    

    
    
}
