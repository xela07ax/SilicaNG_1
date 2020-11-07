# SilicaNG_1
 Тестовый проект на Java с использованием библиотеки TestNG

## Запуск
 Скомпилируйте классы Test case, используя javac.
 
 C:\TestNG_WORKSPACE>javac EmployeeDetails.java EmpBusinessLogic.java TestEmployeeDetails.java
 Теперь TestNG с помощью следующей команды —
 
 C:\TestNG_WORKSPACE>java -cp "C:\TestNG_WORKSPACE" org.testng.TestNG testng.xml
 C:\TestNG_WORKSPACE>java -cp "." org.testng.TestNG testng.xml
```shell script
C:\Users\Tester\Projects\GitHub\SilicaNG_1>java -cp "." ru.otr.eb_ufos testng.xml
```

## Используемая литература
1) Google search - testng run xml file maven  
[How to call testng.xml file from pom.xml in Maven - Stack .](https://stackoverflow.com/questions/10533151/how-to-call-testng-xml-file-from-pom-xml-in-maven)
You can run maven test invoking testng.xml from command line directly via
```shell script
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml
```
My following code in pom.xml is working well:
```xml
<profiles>
   <profile>
      <id>selenium-tests</id>
      <build>
         <plugins>
            <plugin>
               <groupId>org.apache.maven.plugins</groupId>
               <artifactId>maven-surefire-plugin</artifactId>
               <version>2.12.4</version>
               <configuration>
                  <suiteXmlFiles>
                     <suiteXmlFile>src/test/resources/testng.xml</suiteXmlFile>
                  </suiteXmlFiles>
               </configuration>
            </plugin>     
         </plugins>
      </build>
   </profile>
</profiles>
```
Run the test by using following command:
```sh
mvn clean test -U -Pselenium-tests
```

OR,
```sh
mvn clean test
```
- [TestNG — Краткое руководство](https://coderlessons.com/tutorials/java-tekhnologii/uchitsia-testng/testng-kratkoe-rukovodstvo)  
- [Running a Single Unit Test with Maven](https://www.appsdeveloperblog.com/running-a-single-unit-test-with-maven)
- [citrus-samples/Selenium sample](https://github.com/citrusframework/citrus-samples/tree/master/sample-selenium)
- [Running a Single Test](https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html)
- [testng run test by name](https://www.google.com/search?q=testng+run+test+by+name&newwindow=1&rlz=1C1SQJL_ruRU862RU862&sxsrf=ALeKk01DNH4vQibmd2VyCYYzzH60Qpo-sw:1602768586210&source=lnms&tbm=vid&sa=X&ved=2ahUKEwi7p_Oh2rbsAhVCr4sKHWOhBWgQ_AUoAXoECBEQAw&biw=949&bih=479)


