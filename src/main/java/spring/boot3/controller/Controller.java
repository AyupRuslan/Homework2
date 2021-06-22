package spring.boot3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import spring.boot3.ResumeService;
import spring.boot3.Resumes;

@RestController
@RequestMapping("resume")
public class Controller {

    private RestTemplate restTemplate = new RestTemplate();
    private ResumeService resume =new ResumeService();

    @GetMapping
    public ResumeService GetResume(){
        return resume;
    }
}
