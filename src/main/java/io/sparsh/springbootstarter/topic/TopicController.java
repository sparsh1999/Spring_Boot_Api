package io.sparsh.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<topic> getAllTopics(){
        return Arrays.asList(new topic("1","sparsh","goodBoy"),
                new topic("2","utkarsh","badBoy"));
    }
}
