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
 System(inspApp, "Inspektør App")
 
 BiRel(inspektor, inspApp, "Uses")

```
