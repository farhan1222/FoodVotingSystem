package net.therap.filter;


import net.therap.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class LoginFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(LoginFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {


        HttpSession session = ((HttpServletRequest) request).getSession(false);

        if (session == null) {
            log.debug("user is not logged in");
            //((HttpServletResponse) response).sendRedirect("loginController.do");
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        } else {
            /*User user = (User)session.getAttribute("userObj");
            if(user.isAdmin() == 1){

                 request.getRequestDispatcher("/WEB-INF/jsp/admin.jsp").forward(request, response);
            }
            else {
                request.getRequestDispatcher("/WEB-INF/jsp/user.jsp").forward(request, response);
            }    */



        }


        chain.doFilter(request, response);
    }

    public void destroy() {
    }
}
