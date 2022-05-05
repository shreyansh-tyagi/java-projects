## *@SpringBootApplication*
* @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.

## *@RestController*
* RestController is used for making restful web services with the help of the @RestController annotation. This annotation is used at the class level and allows the class to handle the requests made by the client.

## *@Autowired*
* The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.

## *@GetMapping*
* The @GetMapping annotation is a specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET) . The @GetMapping annotated methods in the @Controller annotated classes handle the HTTP GET requests matched with given URI expression.

## *@Override*
* The @Override annotation indicates that the child class method is over-writing its base class method. The @Override annotation can be useful for two reasons. It extracts a warning from the compiler if the annotated method doesn't actually override anything. It can improve the readability of the source code.

## *@Service*
* @Service annotation is used with classes that provide some business functionalities. Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used.

## *@Configuration*
* @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.

## *@Bean*
* In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
* Spring @Bean annotation tells that a method produces a bean to be managed by the Spring container. It is a method-level annotation. During Java configuration ( @Configuration ), the method is executed and its return value is registered as a bean within a BeanFactory .


## *@Qualifier*
* The @Qualifier annotation in Spring is used to differentiate a bean among the same type of bean objects. If we have more than one bean of the same type and want to wire only one of them then use the @Qualifier annotation along with @Autowired to specify which exact bean will be wired.

## *@ControllerAdvice*
* We will add @ControllerAdvice annotation to this class to handle exceptions at the application level.
* @ControllerAdvice is a specialization of the @Component annotation which allows to handle exceptions across the whole application in one global handling component. It can be viewed as an interceptor of exceptions thrown by methods annotated with @RequestMapping and similar.

## *@ExceptionHandler*
*  @ExceptionHandler annotation catches the exception for the specific exception.
* @ExceptionHandler is an annotation for handling exceptions in specific handler classes or handler methods.


## *@RequestMapping()*
* @RequestMapping is the most common and widely used annotation in Spring MVC. It is used to map web requests onto specific handler classes and/or handler methods. @RequestMapping can be applied to the controller class as well as methods.

## *@PathVarviable*
* Path variable in the spring boot represents different kinds of parameters in the incoming request with the help of @pathvariable annotation.

## *@ResponseEntity*
* ResponseEntity is an extension of HttpEntity that represents an HTTP response including status, headers and body. ResponseEntity allows you to modify the response with optional headers and status code. In spring applications, ResponseEntity is used in @Controller methods as well as in RestTemplate.

## *@PostConstruct*
* @PostConstruct is an annotation used on a method that needs to be executed after dependency injection is done to perform any initialization.

## *@ResponseStatus*
* @ResponseStatus marks a method or exception class with the status code and reason message that should be returned. The status code is applied to the HTTP response when the handler method is invoked, or whenever the specified exception is thrown.

## *@PostMapping*
* @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) . @PostMapping annotated methods handle the HTTP POST requests matched with given URI expression.
* @PostMapping annotation maps HTTP POST requests onto specific handler methods. It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) 

## *@RequestBody*
* @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object. Spring automatically deserializes the JSON into a Java type, assuming an appropriate one is specified.


## *@ResponseBody*
* @ResponseBody is a Spring annotation which binds a method return value to the web response body. It is not interpreted as a view name. It uses HTTP Message converters to convert the return value to HTTP response body, based on the content-type in the request HTTP header.

## *@Valid*
* The @Valid annotation will tell spring to go and validate the data passed into the controller.


## *@Controller*
* The @Controller annotation indicates that a particular class serves the role of a controller. Spring Controller annotation is typically used in combination with annotated handler methods based on the @RequestMapping annotation. It can be applied to classes only. It's used to mark a class as a web request handler.

## *@ModelAttribute*
* @ModelAttribute is an annotation that binds a method parameter or method return value to a named model attribute, and then exposes it to 

## *@RequestHeader*
* @RequestHeader annotation binds request header values to method parameters. If the method parameter is Map<String, String> , MultiValueMap<String, String> , or HttpHeaders then the map is populated with all header names and values.

## *@ResponseEntity*
* @ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest

## *@RequestParam*
* In Spring MVC, the @RequestParam annotation is used to read the form data and bind it automatically to the parameter present in the provided method. So, it ignores the requirement of HttpServletRequest object to read the provided data.

## *@Entity*
* The @Entity annotation specifies that the class is an entity and is mapped to a database table

## *@Table*
* The @Table annotation specifies the name of the database table to be used for mapping.

## *@Id*
* The @Id annotation specifies the primary key of an entity.

## *@GenerateValue*
* @GeneratedValue provides for the specification of generation strategies for the values of primary keys.

## *@SequenceGenerator*
* It is the name of the primary key generator as specified in the @SequenceGenerator or @TableGenerator annotation. These two annotations controls how database sequence or table is mapped. @SequenceGenerator and @TableGenerator can be used on the entity class or on the primary key field or property.

## *@Repository*
* @Repository Annotation is a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects


## *@Configuration*
* Spring @Configuration annotation helps in Spring annotation based configuration. @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.


## *CommandLineRunner*
* Command Line Runner is an interface. It is used to execute the code after the Spring Boot application started.

## *@Transient*
* @Transient annotation is used to mark a field to be transient for the mapping framework, which means the field marked with @Transient is ignored by mapping framework and the field not mapped to any database column (in RDBMS) or Document property (in NOSQL). Thus the property will not be persisted to data store.

## *@DeleteMapping*
* @DeleteMapping annotation maps HTTP DELETE requests onto specific handler methods. It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. DELETE) 

## *@PathVariable*
* The @PathVariable annotation is used to extract the value from the URI. It is most suitable for the RESTful web service where the URL contains some value. Spring MVC allows us to use multiple @PathVariable annotations in the same method. A path variable is a critical part of creating rest resources.

## *@PutMapping*
* @PutMapping annotation Annotation for mapping HTTP PUT requests onto specific handler methods. Specifically, @PutMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. PUT) . consumes – Narrows the primary mapping by media types that can be consumed by the mapped handler.

## *@Transactional*
* The @Transactional annotation makes use of the attributes rollbackFor or rollbackForClassName to rollback the transactions, and the attributes noRollbackFor or noRollbackForClassName to avoid rollback on listed exceptions. The default rollback behavior in the declarative approach will rollback on runtime exceptions.

## *@Slf4j*
* SLF4J and Apache Commons Logging APIs allow us the flexibility to change our logging framework with no impact on our code. And we can use Lombok's @Slf4j and @CommonsLog annotations to add the right logger instance into our class: org. slf4j. Logger for SLF4J and org.

## *@Validated*
* When Spring Boot finds an argument annotated with @Valid, it automatically bootstraps the default JSR 380 implementation — Hibernate Validator — and validates the argument. When the target argument fails to pass the validation, Spring Boot throws a MethodArgumentNotValidException exception.

## *@Data*
* @Data is a convenient shortcut annotation that bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects) and beans: getters for all fields.

## *@Builder*
* @Builder. The @Builder annotation produces complex builder APIs for the annotated POJO classes. For example, if we annotate a class Article annotated with @Builder annotation, we can create Article instances using builder API.

## *@AllArgsConstructor*
* @AllArgsConstructor generates a constructor with 1 parameter for each field in your class. Fields marked with @NonNull result in null checks on those parameters. So, no, it does not make your fields private & final as for example @Value annotation. Follow this answer to receive notifications.

## *@RequiredArgsConstructor*
* Generates a constructor with required arguments. Required arguments are uninitialized final fields and fields with constraints such as @NonNull . Default access modifier is public . Make sure you already installed Lombok setup for your IDE