package com.primeiro.demo;

    
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
   

    
    
    @Controller
    public class WhereController {
    @GetMapping("/Where")
    public String Where(){
        return "Where";
    }
}