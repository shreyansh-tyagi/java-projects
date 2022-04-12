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

## *ResponseEntity*
* ResponseEntity is an extension of HttpEntity that represents an HTTP response including status, headers and body. ResponseEntity allows you to modify the response with optional headers and status code. In spring applications, ResponseEntity is used in @Controller methods as well as in RestTemplate.

## *postConstruct*
* @PostConstruct is an annotation used on a method that needs to be executed after dependency injection is done to perform any initialization.

## *ResponseStatus*
* @ResponseStatus marks a method or exception class with the status code and reason message that should be returned. The status code is applied to the HTTP response when the handler method is invoked, or whenever the specified exception is thrown.

## *@PostMapping*
* @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) . @PostMapping annotated methods handle the HTTP POST requests matched with given URI expression.
* @PostMapping annotation maps HTTP POST requests onto specific handler methods. It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) 

## *@RequestBody*
* @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object. Spring automatically deserializes the JSON into a Java type, assuming an appropriate one is specified.


## *@ResponseBody*
* @ResponseBody is a Spring annotation which binds a method return value to the web response body. It is not interpreted as a view name. It uses HTTP Message converters to convert the return value to HTTP response body, based on the content-type in the request HTTP header.