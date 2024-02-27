The scope of this project is to create tests for https://www.globallogic.com/ by using Selenium with Cucumber.

**Selenium** is an automation tool for Functional Testing of the web-based application. Selenium supports different language like java, ruby, python C#, etc.

**Cucumber** is a testing approach which supports Behavior Driven Development (BDD). It explains the behavior of the application in a simple English text using Gherkin language.

**Gherkin** is a programming language used by Cucumber developers to define tests that allows product teams to describe needs for new products. Every feature in Gherkin is specified in a. feature file and adheres to a strict syntax.

Preconditions:

**Java SE 17+**

**IntelliJ**

**junit**-> JUnit is a unit testing open-source framework for the Java programming language. Java Developers use this framework to write and execute automated tests. In Java, there are test cases that have to be re-executed every time a new code is added. This is done to make sure that nothing in the code is broken.

**slf4j-simple** -> The Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks (e.g. java.util.logging, logback, log4j) allowing the end user to plug in the desired logging framework at deployment time.

**cucumber-java** -> While Gherkin is used for writing test scenarios, Cucumber seamlessly integrates these scenarios with step definitions written in various programming languages. This includes widely used languages like Java, Ruby, and JavaScript, allowing teams to leverage their existing programming skills and resources.

**cucumber-junit** -> It notifies JUnit of its progress while running the executable specifications (once per run). This 'Cucumber JUnit Runner (Cucumber)' which is used to run these executable specifications can be set using the JUnit '@RunWith' annotation in any class.

**cucumber-picocontainer** -> In order to share states between different scenarios and to avoid multiple instances of objects PicoContainer can be used. It will simply create and inject dependencies through constuctor of classes.

**selenium-java** -> Java Selenium enables testers to write automated test scripts in a wide variety of programming languages and frameworks. As an open-source project, it benefits from the efforts of a large group of programmers who work to refine and enhance it over time.

**selenium-support** -> Test management plays a pivotal role in the testing lifecycle. And one of the key Selenium WebDriver with Java benefits is it helps developers and testers to make quick changes in the code. It helps in minimizing duplication, other complications, thus helping to maintain the quality of code.

**assertj-core** -> AssertJ core is a Java library that provides a fluent interface for writing assertions. Its main goal is to improve test code readability and make maintenance of tests easier. AssertJ core provides assertions for JDK standard types and can be used with JUnit, TestNG or any other test framework.

**commons-io** -> Provides a component for monitoring file system events (directory and file create, update and delete events). Provides implementations of output classes, such as OutputStream and Writer. Provides a framework for controlling the deserialization of classes.

**jasypt** -> Jasypt is a java library which allows the developer to add basic encryption capabilities to his/her projects with minimum effort, and without the need of having deep knowledge on how cryptography works. High-security, standards-based encryption techniques, both for unidirectional and bidirectional encryption.

**Maven Surefire Plugin** -> The Surefire Plugin is used to execute all the test cases in the Maven project.

**Maven Cucumber Reporting** -> Cucumber uses reporter plugins to produce reports that contain information about what scenarios have passed or failed