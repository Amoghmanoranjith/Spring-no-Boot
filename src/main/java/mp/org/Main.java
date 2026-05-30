package mp.org;

import mp.org.config.WebConfig;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context =
                tomcat.addContext("", new File(".").getAbsolutePath());

        AnnotationConfigWebApplicationContext appContext =
                new AnnotationConfigWebApplicationContext();

        appContext.register(WebConfig.class);

        DispatcherServlet dispatcherServlet =
                new DispatcherServlet(appContext);

        Tomcat.addServlet(
                context,
                "dispatcher",
                dispatcherServlet
        );

        context.addServletMappingDecoded("/", "dispatcher");

        tomcat.start();

        System.out.println("Server running on http://localhost:8080");

        tomcat.getServer().await();
    }
}