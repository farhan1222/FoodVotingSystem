package net.therap.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author misbah
 */
public class LoginFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(LoginFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

         PrintWriter pw = ((HttpServletResponse)response).getWriter();


        HttpSession session = ((HttpServletRequest)request).getSession(false);
        if (session == null || session.getAttribute("USER") == null) {
              // pw.print("inside filter");
            log.debug("user is not logged in");
            //RequestDispatcher rd = request.getRequestDispatcher("/login");
            //rd.forward(request, response);
            //((HttpServletResponse) response).sendRedirect("LoginController.do");


            chain.doFilter(request, response);


        } else {
              chain.doFilter(request, response);
        }
    }

    public void destroy() {
    }
}
