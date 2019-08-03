package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    //public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
    public void setGreetingService(GreetingService getterGreetingService) {
        //this.greetingService = greetingService;
        this.greetingService = getterGreetingService; //because parameter is bean name with starting lowercase this will be work
    }
}
