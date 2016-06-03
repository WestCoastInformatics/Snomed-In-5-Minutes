 SNOMED CT in 5 minutes: CURL Tutorial
======================================

This tutorial focuses in using cURL, a command line utility available in most environment derived from Unix, to access SNOMED CT content from the IHTSDO Browser backend services.

If you don' have CURL in your system check the official [cURL site](https://curl.haxx.se/dlwiz/) or use any alternative.

The responses from the web service are in [JSON](http://www.json.org/) format, that you can save into a file and explore. For these examples, we use in line [python](https://www.python.org/) scripts to parse and extract meaningful information from the response.

The Browser as a trerminology server
------------------------------------

The base url for the REST API of IHTSDO browser backend terminology services is:

http://browser.ihtsdotools.org/api/snomed/en-edition/v20160131

In this example its using the International Edition and the January 31st 2016 release, as stated in the last two parameters of the example URL.

This is the base URL, all the content calls we will perform will construct adding more values after that. All the operations described here will perform a GET request.

The full documentation of the REST API can be consulted here:

http://docs.snomedctsnapshotapi.apiary.io/

The IHTSDO Browser Terminology Server is an Open Source project, available here:

https://github.com/IHTSDO/sct-snapshot-rest-api

Acessing SNOMED CT Content
--------------------------

The following examples can be types into the command line of any terminal that has cURL and python configured. It should work by without requiring any installation in Unix/Linx/BSD and Apple OS X systems.

### Getting full concept details into a local .json file

`
curl http://browser.ihtsdotools.org/api/snomed/en-edition/v20160131/concepts/195967001 > concept.json
`

Notice that the resource identifier "concepts" and a valid conceptId "195967001" were added to the base URL to contruct the final URL. All the examples will follow this example and the details can be consultes in the full [REST API documentation](http://docs.snomedctsnapshotapi.apiary.io/).

This command will create a concept.json file that will contain the full JSON object representing the concept, you can explore the format and properties in the [API documentation](http://docs.snomedctsnapshotapi.apiary.io/).

### Show the default term for the concept

`
curl --silent http://browser.ihtsdotools.org/api/snomed/en-edition/v20160131/concepts/195967001 | python -c "import json,sys;obj=json.load(sys.stdin);print obj['defaultTerm'];"
`

Output:

`
Asthma (disorder)
`

"Asthma (disorder)" is the default term for this concept, contained in the defaultTerm property.

### Count the Inferred children of the concept

`
curl --silent http://browser.ihtsdotools.org/api/snomed/en-edition/v20160131/concepts/195967001/children?form=inferred | python -c "import json,sys;obj=json.load(sys.stdin);print len(obj);"
`

Output:

`
24
`

This concept has 24 children (direct subtypes, not descendants) in the inferred view. Note the "form=inferred" parameter, that can be changed to "form=stated" as necessary.

### Count the Inferred descendants of the concept

`
curl --silent http://browser.ihtsdotools.org/api/snomed/en-edition/v20160131/concepts/195967001 | python -c "import json,sys;obj=json.load(sys.stdin);print obj['inferredDescendants'];"
`

Output:

`
95
`

This concept has 95 descendants (children, and children of the children, recursively) in the inferred view, contained in the inferredDescendants property.