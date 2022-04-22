package com.template.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonitorController {

    private boolean l7check = true;


    @RequestMapping("/monitor/l7check")
    public ResponseEntity<String> l7check() {

        if (l7check) {
            return ResponseEntity.ok("SUCCESS");
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @RequestMapping("/monitor/stop")
    public ResponseEntity<String> stop() {

        if (l7check) {
            l7check = false;
        }

        return ResponseEntity.ok("SUCCESS");
    }

}
