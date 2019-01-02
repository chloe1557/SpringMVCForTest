package common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class indexTest implements Controller {

    private static final Log logger = LogFactory.getLog(indexTest.class);

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("Called!!!!!");
        System.out.println("Hello!");
        return new ModelAndView("student/AA");
    }
}
