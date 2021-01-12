# Multi Release Jar
Small project to exemplify how to use the Multi Release Jar feature from Java9+.

Example config for JDK 8 and JDK 11:

```
<plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-compiler-plugin</artifactId>
   <version>${maven-compiler-plugin.version}</version>
   <executions>
      <execution>
         <id>jdk8</id>
         <phase>compile</phase>
         <goals>
            <goal>compile</goal>
         </goals>
         <configuration>
            <source>1.8</source>
            <target>1.8</target>
         </configuration>
      </execution>
      <execution>
         <id>jdk11</id>
         <goals>
            <goal>compile</goal>
         </goals>
         <configuration>
            <release>11</release>
            <compileSourceRoots>
               <compileSourceRoot>${project.basedir}/src/main/java11</compileSourceRoot>
            </compileSourceRoots>
            <multiReleaseOutput>true</multiReleaseOutput>
         </configuration>
      </execution>
   </executions>
</plugin>```