package tn.bna.springcloudstreamsfunction.web;

import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.bna.springcloudstreamsfunction.entities.PageEvent;

import java.util.Date;
import java.util.Random;

@RestController @AllArgsConstructor
public class PageEventRestController {

    private StreamBridge streamBridge;
    @RequestMapping("/publish/{topic}/{namePage}")
    public PageEvent publish(@PathVariable(name = "topic") String topic,@PathVariable(name = "namePage") String namePage){
            PageEvent pageEvent=new PageEvent(namePage,Math.random()>0.5?"U1":"U2",new Date(),new Random().nextInt(7000));
        streamBridge.send(topic,pageEvent);
        return pageEvent;
    }
}
