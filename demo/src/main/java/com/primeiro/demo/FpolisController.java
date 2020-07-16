
    package com.primeiro.demo;

    
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
   

    
    
    @Controller
    public class FpolisController {
    @GetMapping("/Fpolis")
    public String Fpolis(){
        return "Fpolis";
    }
    }
