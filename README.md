cupcake-cipher-starter
======================

Hostile spy networking is leveraging popular cooking websites and magazines to communicate by using messages encrypted in cupcake recipes. 

**Your task is to break the cipher**

What we know about the cipher so far is that it is probably simple substitution cipher that should be prone to frequency analysis attack. If you are not familiar with the concept take a look at:
[http://en.wikipedia.org/wiki/Letter_frequency](http://en.wikipedia.org/wiki/Letter_frequency) and
[http://en.wikipedia.org/wiki/Frequency_analysis](http://en.wikipedia.org/wiki/Frequency_analysis)

Separate department is working on intercepting suspicious recipes. In the world of everything as a service the departament has managed to successfully build a MITMAAS (Man in the middle as a service) system codenamed CupcakeEradicator. 

Your task is to build two services:
 - feed consumer service - should recieve encrypted communication which might help you to break the cipher. You might want to store the data somewhere and later analyze it.
 - decrypting service - will plug directly into CupcakeEradicator infrastructure. We need you to decrypt critical passwords and return the result back. Your success will be greatly rewarded and will allow us to finally launch an operation against the spy network.
 
CupcakeEradicator will be posting (to your feed consumer service) various cupcake recipes throughout the hackathon. Make sure you establish your receiving service application as soon as possible to be able to gather as much data as possible, as soon as possible.

If you wish you may reuse our simple Dropwizard skeleton from JDD for quicker start:
[https://github.com/basecrm/jdd-base](https://github.com/basecrm/jdd-base)

Details regarding the API can be found at: http://10.12.216.192:8080/assets/swagger/.
Use the registration service (http://10.12.216.192:8080/assets/swagger/#!/registration/register) to register your two endpoints with CupcakeEradicator. Provide unique (but recognizable) name of your team.

IP: 10.12.216.192

Good luck!
