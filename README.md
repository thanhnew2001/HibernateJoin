# HelloHibernateAnnotation
This is a hello world example that demonstrate the usage of Hibernate and Spring using Annotation. I simplify this project with minimal configuration.

1. Create a maven project using IntelliJ IDEA
2. In the pom.xml we will need to add the following dependencies:
+ spring-context: will provide us with @Configuration, @Bean
+ spring-orm: will provide us with LocalSessionFactoryBean, HibernateTransationManager
+ spring-tx: will need for transaction management @EnableTransationManager or @Transactional
+ hibernate-core: not sure why we need it? :-) 
+ postgresql or hsqldb (if we want to use in-memory db)

3. Similar to HelloSpringAnnotation project we need a configuration class that handles all beans declaration. We name it AppConfig





