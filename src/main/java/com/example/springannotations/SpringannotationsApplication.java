package com.example.springannotations;

import com.example.springannotations.Services.MyService;
import com.example.springannotations.Services.VegPizza;
import com.example.springannotations.controller.MyController;
import com.example.springannotations.repository.MyRepository;
import com.example.springannotations.scope.PrototypeBean;
import com.example.springannotations.scope.SingletonBean;
import com.example.springannotations.values.DefaultValues;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springannotations.controller.PizzaController;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringannotationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringannotationsApplication.class, args);
		PizzaController pc = context.getBean(PizzaController.class);
		System.out.println(pc.getPizza());


		//Beans defined
		VegPizza vegPizza = context.getBean(VegPizza.class);
		System.out.println(vegPizza.getPizza());


		//Controller defined
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());


		//Service defined
		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());


		//Repository defined
		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.hello());



		// scopes defined
		SingletonBean s1 = context.getBean(SingletonBean.class);
		SingletonBean s2 = context.getBean(SingletonBean.class);
		SingletonBean s3 = context.getBean(SingletonBean.class);
		PrototypeBean p1 = context.getBean(PrototypeBean.class);
		PrototypeBean p2 = context.getBean(PrototypeBean.class);
		PrototypeBean p3 = context.getBean(PrototypeBean.class);
		System.out.println(s1.singletonBean());
		System.out.println(s1.hashCode());
		System.out.println(s2.singletonBean());
		System.out.println(s2.hashCode());
		System.out.println(s3.singletonBean());
		System.out.println(s3.hashCode());
		System.out.println(p1.prototypeBean());
		System.out.println(p1.hashCode());
		System.out.println(p2.prototypeBean());
		System.out.println(p2.hashCode());
		System.out.println(p3.prototypeBean());
		System.out.println(p3.hashCode());

		//Values defined
		DefaultValues dv = context.getBean(DefaultValues.class);
		System.out.println(dv.getDefaultValue());
		System.out.println(dv.getHost());
		System.out.println(dv.getMail());
		System.out.println(dv.getPassword());
	}

}
