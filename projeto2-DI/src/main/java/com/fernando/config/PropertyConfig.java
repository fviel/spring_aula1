/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.config;

import com.fernando.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 *  A anotation "@Configuration" determina que este é um arquivo 
 * java de configuração do spring.
 * 
 * A annotation "@PropertySource" indica onde está o arquivo de properties a 
 * ser lido.
 * 
 * @author Fernando
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    
    /*
    '@Value' irá colocar o valor que coloquei na chave de configuração no meu
    arquivo datasource.properties na variável abaixo.
    */
    @Value("${viel.username}")
    public String username;
    
    @Value("${viel.password}")
    public String password;
    
    @Value("${viel.dburl")
    public String dburl;

    
    /*
    Método que irá preencher o falseo datasource que criei.
    Observe que estou mapeando informações que estavam em um arquivo
    datasource.properties em uma classe java chamada FakeDataSource,
    que depois poderá ser utilizada em outros Beans.
    */
    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(dburl);
        
        return fakeDataSource;
    }
    
    
    
    /*
    PropertySourcesPlaceholderConfigurer é uma classe do spring para tratar 
    properties, é um armazenador de properties.
    
    '@Bean' transforma o método abaixo em um bean do spring, quer pode ser
    utilizado em outras classes.
    */
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer  = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
        
    }
    
}
