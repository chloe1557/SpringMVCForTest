package student.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class Happy implements Controller {
//
//    private static final Log logger = LogFactory.getLog(Happy.class);
//
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        System.out.println("Happy");
//        return new ModelAndView("index");
//    }
//}

@Controller
public class Happy {

    @RequestMapping(value="hahaR" ,method={RequestMethod.POST})
    public String Happy2() {
        System.out.println("haha");
        return "student/OO";
    }

    @RequestMapping(value="kaka" ,method={RequestMethod.POST})
    public String Happy1() {
        System.out.println("kaka");
        return "student/AA";
    }
}
