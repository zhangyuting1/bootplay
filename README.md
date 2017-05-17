# bootplay
A demo project to try/play/record/study features and usage of SpringBoot Framework.

***

## Example-00 Lombok
Project Lombok makes java a spicier language by adding 'handlers' that know how to build and compile simple, boilerplate-free, not-quite-java code.

See below resources for further information  
[projectlombok](https://projectlombok.org/ "projectlombok")  
[lombok github](https://github.com/rzwitserloot/lombok "lombok github")  

Below annotations are common for our domain class,

@NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor  
Constructors made to order: Generates constructors that take no arguments, one argument per final / non-null field, or one argument for every field.

@Data  
All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor!

See classes in [domain](./src/main/java/com/daniel/bootplay/domain) package. 

## Example-01 JSR-310 (Java 8) dates with Jackson and JPA

## Example-02 Default H2 database with web console

## Example-03 Command Line Runner and Application Runner