package io.sparsh.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    // here we added new arraylist as
    // arrays.asList gives a mutable object which values can't be modified
    // by doing this we can have a non - mutable object.
    private List<Topic> listOfTopics = new ArrayList<Topic>(Arrays.asList(new Topic("1","sparsh","goodBoy"),
            new Topic("2","utkarsh","badBoy")));

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

    public void addTopic (Topic topic)
    {
        listOfTopics.add(topic);
    }

    public void updateTopic(Topic topic,String id)
    {
        for (int i =0;i<listOfTopics.size();i++) {

            if (listOfTopics.get(i).getId().equalsIgnoreCase(id)) {
                // it will update the topic at location i
                listOfTopics.set(i, topic);
            }
        }
    }
}
