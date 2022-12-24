package ru.agentche.springcource.controllders;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 23.12.2022
 */
@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exitPage() {
        return "second/exit";
    }
}
