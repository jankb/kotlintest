# Design

```mermaid
graph TD;
a-->b;
a-->c;
b-->d;
c-->d;

```


```mermaid
C4Context
 title System Context for Prøvetaking
 Person(inspektor, "Inspektør")
 
 Boundary(system, "Prøvetaking")
 {
   System(inspApp, "Inspektør App")
   System(inspApi, "Inspektør API")
   ContainerDb(database, "Relational DB", "Lagrer alt mulig som vi trenger")
 }
 
 Rel(inspektor, inspApp, "Uses", "HTTP")
 Rel(inspApp,  inspApi, "Uses", "HTTP/Rest, Json")
 Rel(inspApi, database, "Queries", "JDBC, SQL")

```
