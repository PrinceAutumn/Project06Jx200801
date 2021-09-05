package com.ckcj.servlet;

import javax.servlet.ServletConfig;

public class HelloServlet (ServletConfig config) throws ServletException {
        super.init(config);
        //Servlet中本来不能使用@Autowired注入bean，解决办法是在Servlet的
        init（ServletConfig);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
        config.getServletContext());
        }
}
