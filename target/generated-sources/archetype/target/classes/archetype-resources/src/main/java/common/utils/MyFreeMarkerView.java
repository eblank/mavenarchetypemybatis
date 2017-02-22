#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.utils;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class MyFreeMarkerView extends FreeMarkerView {

	 private static final String CONTEXT_PATH = "base";

	 protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
         model.put(CONTEXT_PATH, request.getContextPath());
	     super.exposeHelpers(model, request);
	 }

}