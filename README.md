SNOMED in 5 Minutes
===================

This is an easy-to-use tutorial for accessing SNOMED APIs within 5 min.

Project Structure
-----------------

* top-level: aggregator for sub-modules (alphabetically):
  * model: JAXB-enabled classes for representing the RF2 domain model
  * rest-client: a Java client for the REST services

Examples
--------
The following examples will be used to demonstrate accessing the SNOMED API
through Javascript, Curl, and Java (using Jersey).

* Find a concept by a string (e.g. “heart attack”)
* Find/get a concept by a description SCTID (e.g. “679406011”)
* Find/get a concept by a concept SCTID (e.g. “109152007”)
* Find a concept by a string (e.g. “heart”) but only in the Procedures semantic tag

Java
----
Java examples are available via JUnit tests in
* rest-client/src/main/test/org/ihtsdo/tutorial/SnomedClientTest.java

These tests make use of the Jersey client endpoint defined in:
* rest-client/src/main/java/org/ihtsdo/tutorial/SnomedClientRest

The base URL, SNOMED CT edition, and version are hardcoded into the
client. To point to a different server, different edition, or different
version, change these parameters.

To run the java tests, execute the following commands
```
git clone https://github.com/WestCoastInformatics/Snomed-In-5-Minutes.git
cd Snomed-In-5-Minutes
mvn test
```


Javascript
----------
TBD

Curl
----
TBD

Documentation
-------------
Find comprehensive documentation here: TBD

License
-------
See the included LICENSE.txt file.




  