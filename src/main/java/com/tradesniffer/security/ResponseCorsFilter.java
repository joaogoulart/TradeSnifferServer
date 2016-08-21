package com.tradesniffer.security;

import javax.servlet.*;
import java.io.IOException;

public class ResponseCorsFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		/** Se quiser testar com o authorization, coloque  httpURLConnection.setRequestProperty("Authorization", "VALOR WEB OU MOBILE"); e descomente a parte abaixo**/
		/*HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		if (!httpRequest.getHeader("Authorization").isEmpty()
				&& (httpRequest.getHeader("Authorization").equals(Constants.AUTHORIZATION_WEB)
						|| httpRequest.getHeader("Authorization").equals(Constants.AUTHORIZATION_MOBILE))) {
			chain.doFilter(request, response);
		} else {
			httpResponse.sendRedirect(httpRequest.getContextPath() + "/error");
		}*/
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
