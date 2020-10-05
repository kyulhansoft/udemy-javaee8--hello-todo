java -jar "C:\apps\payara-micro\payara-micro-5.2020.2.jar" --deploy "C:\projects\test\udemy\javaee8\projects\hello-todo\target\hello-todo.war" --port 8089


@rem java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9009 "C:\apps\payara-micro\payara-micro-5.2020.2.jar" --deploy "C:\projects\test\udemy\javaee8\projects\hello-todo\target\hello-todo.war" --port 8089

@rem java -jar "C:\apps\payara-micro\payara-micro-5.2020.2.jar" --deploy "C:\projects\test\udemy\javaee8\projects\hello-todo\target\hello-todo.war" --port 8089 --outputUberJar helloTodo.jar