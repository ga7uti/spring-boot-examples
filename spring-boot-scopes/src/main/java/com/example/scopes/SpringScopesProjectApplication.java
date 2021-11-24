package com.example.scopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringScopesProjectApplication {

	public static void main(String[] args) {
		ApplicationContext apx =SpringApplication.run(SpringScopesProjectApplication.class, args);
		//Default Container
		//Since we are using singleton scope for book therefore book was initialized only one time.
		//And same object was referenced for the book2.
		Book book = (Book) apx.getBean("book");
		Book book2 =(Book)apx.getBean("book");
	
		//Here we are using prototype scope for author there whenever author bean is called a new 
		//instance of author is created and passed.
		Author author =(Author)apx.getBean("author");
		Author author2 =(Author)apx.getBean("author");
		
		//New container
		ApplicationContext apx2 = new AnnotationConfigApplicationContext(SpringScopesProjectApplication.class);
		//Here when we created a new Spring IOC container book class was initialized again for the new container.
		// And after that same book refrence was used for the other calls.
		Book book3 =(Book)apx2.getBean("book");
		Book book4 =(Book)apx2.getBean("book");
		
		//Author has same behavior as previous
		Author author3 =(Author)apx2.getBean("author");
		Author author4 =(Author)apx2.getBean("author");
		
	}
	
	@Bean
	@Scope("singleton")
	public Book book() {
		return new Book();
	}
	
	@Bean
	@Scope("prototype")
	public Author author() {
		return new Author();
	}

}
