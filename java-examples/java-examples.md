Java Tutorial
=============

This tutorial focuses in using Java with a collection of pre-defined model objects to access SNOMED CT content from the IHTSDO Browser backend services.

If you don' have Java in your system check the official [Java site](https://java.com/).

Prerequisites
-------------
Start by cloning the project and running the maven install.  This will, among other things, create a .jar file with the local code plus all dependencies that can be easily executed from the command line

```
git clone https://github.com/WestCoastInformatics/Snomed-In-5-Minutes.git
cd Snomed-In-5-Minutes
mvn install
```


Running Examples via Unit Tests
-------------------------------
Java examples are available via JUnit tests in
* rest-client/src/main/test/org/ihtsdo/tutorial/SnomedClientTest.java

These tests make use of the Jersey client endpoint defined in:
* rest-client/src/main/java/org/ihtsdo/tutorial/SnomedClientRest

The base URL, SNOMED CT edition, and version are hardcoded into the client. To point to a different server, different edition, or different version, change these parameters.

To run the unit tests, simply invoke this command from the top level project directory:

```
mvn test
```

The console output will include a summary of the result based around the domain model.

Running Examples from the Command Line
--------------------------------------
An application entry point class with a main method was created as
* rest-client/src/main/java/org/ihtsdo/tutorial/SnomedExamples

With the rest-client/target/snomed-in-5-minutes.jar file in the classpath, a simple java command can be used to test the sample calls described in this project.  All sample java calls should be made from the top-level directory after completing the prerequisites section above.

### Searching by query string

Searching for "heart attack":
```
java -cp rest-client/target/snomed-in-5-minutes.jar org.ihtsdo.tutorial.SnomedExamples findByQuery "heart attack"
```

This call writes some output to the console based on the domain model object unmarshalled from the server's JSON response.  To see the raw JSON itself, consult the [Curl Examples](../../blob/master/curl-examples/curl-examples.md "Curl Examples") file.

<div style="max-height: 400px; overflow-y: scroll>
<pre>
  results = MatchResults [matches=[Match [term=Heart attack, conceptId=22298006, active=true, conceptActive=true, fsn=Myocardial infarction (disorder), module=900000000000207008, definitionStatus=Fully defined], Match [term=Fear of heart attack, conceptId=102931001, active=true, conceptActive=true, fsn=Fear of heart attack (finding), module=900000000000207008, definitionStatus=Primitive], Match [term=Fear of having a heart attack, conceptId=247818001, active=true, conceptActive=true, fsn=Fear of having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive], Match [term=Fear of heart attack (finding), conceptId=102931001, active=true, conceptActive=true, fsn=Fear of heart attack (finding), module=900000000000207008, definitionStatus=Primitive], Match [term=Anxiety about having a heart attack, conceptId=277834005, active=true, conceptActive=true, fsn=Anxiety about having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive], Match [term=Fear of having a heart attack (finding), conceptId=247818001, active=true, conceptActive=true, fsn=Fear of having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive], Match [term=Anxiety about having a heart attack (finding), conceptId=277834005, active=true, conceptActive=true, fsn=Anxiety about having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive], Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score, conceptId=438367009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive], Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischaemic attack risk score, conceptId=438367009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive], Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), conceptId=438367009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive], Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score, conceptId=713678009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive], Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischaemic attack, vascular disease, age 65-74 years, and sex category risk score, conceptId=713678009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive], Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), conceptId=713678009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive]], details={total=13, returnLimit=100, skipTo=0}, filters={semTag={disorder=1, assessment scale=6, finding=6}, module={900000000000207008=13}, refsetId={900000000000497000=13, 900000000000498005=13}, lang={english=13}}]
    match = Match [term=Heart attack, conceptId=22298006, active=true, conceptActive=true, fsn=Myocardial infarction (disorder), module=900000000000207008, definitionStatus=Fully defined]
    match = Match [term=Fear of heart attack, conceptId=102931001, active=true, conceptActive=true, fsn=Fear of heart attack (finding), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Fear of having a heart attack, conceptId=247818001, active=true, conceptActive=true, fsn=Fear of having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Fear of heart attack (finding), conceptId=102931001, active=true, conceptActive=true, fsn=Fear of heart attack (finding), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Anxiety about having a heart attack, conceptId=277834005, active=true, conceptActive=true, fsn=Anxiety about having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Fear of having a heart attack (finding), conceptId=247818001, active=true, conceptActive=true, fsn=Fear of having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Anxiety about having a heart attack (finding), conceptId=277834005, active=true, conceptActive=true, fsn=Anxiety about having a heart attack (finding), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score, conceptId=438367009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischaemic attack risk score, conceptId=438367009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), conceptId=438367009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, and previous stroke or transient ischemic attack risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score, conceptId=713678009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischaemic attack, vascular disease, age 65-74 years, and sex category risk score, conceptId=713678009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive]
    match = Match [term=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), conceptId=713678009, active=true, conceptActive=true, fsn=Congestive heart failure, hypertension, age 75 years or older, diabetes, previous stroke or transient ischemic attack, vascular disease, age 65-74 years, and sex category risk score (assessment scale), module=900000000000207008, definitionStatus=Primitive]
    details = {total=13, returnLimit=100, skipTo=0}
    filters = {semTag={disorder=1, assessment scale=6, finding=6}, module={900000000000207008=13}, refsetId={900000000000497000=13, 900000000000498005=13}, lang={english=13}}

</pre>
</div>


...

* Find/get a concept by a description SCTID (e.g. "679406011")
* Find/get a concept by a concept SCTID (e.g. "109152007")
* Find a concept by a string (e.g. "heart") but only in the Procedures semantic tag
