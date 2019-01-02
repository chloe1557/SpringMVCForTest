package common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class indexTest2 implements Controller {

    private static final Log logger = LogFactory.getLog(indexTest2.class);

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("call me!!!!");
        System.out.println("Hi!!!!");
        return new ModelAndView("student/Happy");
    }
}
