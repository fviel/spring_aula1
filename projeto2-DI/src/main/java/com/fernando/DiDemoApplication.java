package com.fernando;

import com.fernando.controllers.ConstructorInjectedController;
import com.fernando.controllers.MyController;
import com.fernando.controllers.PropertyInjectedController;
import com.fernando.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        //joga o resultado da execução para o applicationContext do spring para poder trabalhar ele
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        //obtém o bean do meu controller que já estava no application context
        //atenção para o nome do bean! Exemplo, se fosse FernandoControler, use getBean("fernandoController")
        MyController controller = (MyController) ctx.getBean("myController");
        
        //chama o método hello do bean
        controller.hello();
        
        System.out.println("Mensagem do controller usando @Primary bean: " + controller.hello()) ;
        //executa DI por propriedade 
        System.out.println("Mensagem do controller usando injeção por property: " + ctx.getBean(PropertyInjectedController.class).sayHello());
        
        System.out.println("Mensagem do controller usando injeção por setter: " + ctx.getBean(SetterInjectedController.class).sayHello());
        
        System.out.println("Mensagem do controller usando injeção na constructor:" + ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
