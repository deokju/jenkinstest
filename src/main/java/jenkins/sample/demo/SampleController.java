package jenkins.sample.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sample")
public class SampleController {

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("index2")
    public String index2() {
        return "index2";
    }

    @GetMapping("index3")
    public String index3() {
        return "index3";
    }
}
