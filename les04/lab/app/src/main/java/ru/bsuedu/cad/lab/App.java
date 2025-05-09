/*
 * This source file was generated by the Gradle 'init' task
 */
package ru.bsuedu.cad.lab;

import ru.bsuedu.cad.lab.renderer.Renderer;
import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;

@Configuration
@ComponentScan(basePackages = "ru.bsuedu.cad.lab")
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Renderer renderer = context.getBean(Renderer.class);
        renderer.render();
    }
}