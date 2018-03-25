package com.fernando;

import com.fernando.controllers.ConstructorInjectedController;
import com.fernando.controllers.MyController;
import com.fernando.controllers.PropertyInjectedController;
import com.fernando.controllers.SetterInjectedController;
import com.fernando.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*esta anotação diz: Farei um component scan a partir deste pacote e abaixo dele,
pois une três anotações:
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
*/
@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        //joga o resultado da execução para o applicationContext do spring para poder trabalhar ele
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        //obtém o bean do meu controller que já estava no application context
        //atenção para o nome do bean! Exemplo, se fosse FernandoControler, use getBean("fernandoController")
        MyController controller = (MyController) ctx.getBean("myController");
        
        /*Faz a leitura do arquivo de configuração e o carrega na classe FakeDataSource
        Observe que não preciso fazer 'new', pois como eu coloquei a configuração em um Bean, o Spring Context o gerencia e já o carregou e agora basta pedir o Bean pro Context.
        */
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        
        //apenas faz o print para mostrar que funcionou a carga de properties
        System.out.println("Propriedade username lida de datasource.properties: " + fakeDataSource.getUsername());
        
        //chama o método hello do bean
        controller.hello();
        
        System.out.println("Mensagem do controller usando @Primary bean: " + controller.hello()) ;
        //executa DI por propriedade 
        System.out.println("Mensagem do controller usando injeção por property: " + ctx.getBean(PropertyInjectedController.class).sayHello());
        
        System.out.println("Mensagem do controller usando injeção por setter: " + ctx.getBean(SetterInjectedController.class).sayHello());
        
        System.out.println("Mensagem do controller usando injeção na constructor:" + ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
