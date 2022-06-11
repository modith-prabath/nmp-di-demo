package com.nmp.demo.di.nmpdidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nmp.demo.di.nmpdidemo.controller.ConstructorInjectedController;
import com.nmp.demo.di.nmpdidemo.controller.I18nController;
import com.nmp.demo.di.nmpdidemo.controller.MyController;
import com.nmp.demo.di.nmpdidemo.controller.PetController;
import com.nmp.demo.di.nmpdidemo.controller.PrimaryBeanController;
import com.nmp.demo.di.nmpdidemo.controller.PropertyInjectedController;
import com.nmp.demo.di.nmpdidemo.controller.SetterInjectedController;

@SpringBootApplication
public class NmpDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(NmpDiDemoApplication.class, args);
		MyController myController =  (MyController)ctx.getBean("myController");

		String greeting = myController.helloWorld();
		System.out.println(greeting);

		System.out.println("----------Property");

		PropertyInjectedController propertycontroller = ctx.getBean("propertyInjectedController" , PropertyInjectedController.class);

		System.out.println(propertycontroller.getGreeting());

		System.out.println("----------Setter");

		SetterInjectedController settercontroller = ctx.getBean("setterInjectedController" , SetterInjectedController.class);

		System.out.println(settercontroller.getGreeting());

		System.out.println("----------Constructor");

		ConstructorInjectedController constcontroller = ctx.getBean("constructorInjectedController" , ConstructorInjectedController.class);

		System.out.println(constcontroller.getGreeting());

		System.out.println("----------Primary");

		PrimaryBeanController primarycontroller = ctx.getBean("primaryBeanController" , PrimaryBeanController.class);

		System.out.println(primarycontroller.getGreeting());

		System.out.println("----------I18N Service");

		I18nController i18nController = ctx.getBean("i18nController" , I18nController.class);

		System.out.println(i18nController.sayHello());

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
	}

}
