# Spring Boot Scopes
Spring has 6 types of [bean scopes](https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s04.html) as per the documentation. Out of the 6 singleton and prototype bean scope are used more often and others are rarely used and require **web-aware Spring ApplicationContext**.

**Singelton** - Scopes a single bean definition to a single object instance per Spring IoC container. By deafult every bean is singelton.
```
//Deafult Container
ApplicationContext apx =SpringApplication.run(SpringScopesProjectApplication.class, args);
Book book = (Book) apx.getBean("book");
Book book2 =(Book)apx.getBean("book");

//New Container
ApplicationContext apx2 = new AnnotationConfigApplicationContext(SpringScopesProjectApplication.class);
Book book3 =(Book)apx2.getBean("book");
Book book4 =(Book)apx2.getBean("book");
```

**Prototype** - Scopes a single bean definition to any number of object instances.
```
//Default Container
ApplicationContext apx =SpringApplication.run(SpringScopesProjectApplication.class, args);
Author author =(Author)apx.getBean("author");
Author author2 =(Author)apx.getBean("author");

//New Container
ApplicationContext apx2 = new AnnotationConfigApplicationContext(SpringScopesProjectApplication.class);
Author author3 =(Author)apx2.getBean("author");
Author author4 =(Author)apx2.getBean("author");		
```

**[Full example](https://github.com/ga7uti/spring-boot-scopes/blob/main/src/main/java/com/example/scopes/SpringScopesProjectApplication.java)**
