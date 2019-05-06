package io.sparsh.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

// this annotation describes that this class is a controller and it will direct traffic and map to methods

@RestController
public class TopicController {

    // this annotation describes that this class requires a instance of business service (DEPENDENCY INJECTION).
    @Autowired
    TopicService topicService;

    // it maps (/topics) by default GET REQUEST is mapped .
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getALlTopics();
    }

    // this will map to all the id given in the link
    @RequestMapping("/topics/{id}")
    public Topic getTopicByID(@PathVariable String id )
    {
        return topicService.getTopic(id);
    }

     // this is also same as above but it uses other variable "foo" different from "id"

    //    @RequestMapping("topics/{foo}")
    //    public Topic getTopicByID(@PathVariable("foo") String id )
    //    {
    //        return topicService.getTopic(id);
    //    }

    //method defines which method is called and value is url mapping
    // @ReqeustBody get the request body from the post request and maps into a topic internally

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    // update topic
    @RequestMapping(method =RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic (@RequestBody Topic topic,@PathVariable String id)
    {
        topicService.updateTopic(topic,id);
    }


}
