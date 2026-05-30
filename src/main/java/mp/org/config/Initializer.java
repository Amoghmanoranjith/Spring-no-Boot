package mp.org.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    // tells spring about the root config classes in project
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // you tell spring the web config classes you have in your project
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }
    // you tell spring that we will be handling requests starting only from /hello in this case
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
