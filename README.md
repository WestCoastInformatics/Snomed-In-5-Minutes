SNOMED in 5 Minutes
===================

This is an easy-to-use tutorial for accessing SNOMED APIs within 5 min.

Project Structure
-----------------

* top-level: aggregator for sub-modules (alphabetically):
  * curl-examples: examples with curl
  * model: JAXB-enabled classes for representing the RF2 domain model
  * rest-client: a Java client for the REST services

Examples
--------
The following examples will be used to demonstrate accessing the SNOMED API
through Javascript, Curl, and Java (using Jersey).

* Find a concept by a string (e.g. "heart attack")
* Find/get a concept by a description SCTID (e.g. "679406011")
* Find/get a concept by a concept SCTID (e.g. "109152007")
* Find a concept by a string (e.g. "heart") but only in the Procedures semantic tag

Java
----
[java-examples.md](java-examples.md "Java Examples")



Javascript
----------
TBD

Curl
----
[curl-examples.md](curl-examples.md "Curl Examples")

Documentation
-------------
Find comprehensive documentation here: TBD

License
-------
See the included LICENSE.txt file.




  