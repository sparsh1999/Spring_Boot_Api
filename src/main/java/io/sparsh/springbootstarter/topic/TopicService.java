package io.sparsh.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> listOfTopics = Arrays.asList(new Topic("1","sparsh","goodBoy"),
            new Topic("2","utkarsh","badBoy"));

    public List<Topic> getALlTopics(){
        return listOfTopics;
    }

    public Topic getTopic (String id )
    {
        for (Topic t : listOfTopics)
        {
            if (t.getId().equals(id))
                return t;
        }
        return null;
    }
}
