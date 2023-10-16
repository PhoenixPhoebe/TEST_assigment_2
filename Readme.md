# Test assigment 2

## REFLECTIONS

### 1.1 COMPUTER MOUSE

tests der kan laves på en computer mus
- endurence tests,  
* hvor mange clicks den kan tage
* hvor mange gange den kan blive tabt
* hvor højt den kan blive tabt fra
* hvordan den tager at blive kastet med
* hvis den har en ledning, holdbarheden i den

- præcisions test
* hvor præcis den bevæger sig
* hvor præcis den reagere

- hastigheds test
* hvor hurtigt den reagere
* hvor hurtigt der kan clikkes 
* hvor hurtigt forbindelse der er hvis det er en trådløs mus


### 1.2 CATASTROPHIC FAILURE 
New York City Taxi and Limousine Commission Skulle starte med en højere rate d. 1. marts, men udviklerne havde glemt at der var en ekstra dag i februar det år, så den højere rate begyndte allerede d. 29. februar. (historie nr 54)

For at have undgået det kunne de have kigget på en kalender og testet spesefikt for den dag, samt dagene optil og efter d. 1 marts, i stedet for random dage som de sikkert gjorde.


## INVESTIGATION OF TOOLS 
### JUNIT 5 

@Tag kan bruges til at fortælle hvilken type test og filtere dem. Hvilket kan give et godt overblik.
@Disabled kan bruges til at ignorer en test, så man ikke køre den. 
@RepeatedTest kan bruges til at lave en skabelon til en test, god hvis man har mange tests der ligner hinanden. 
@BeforeEach bruges til at gøre noget før hver test, fx at oprette en i en database som man tester på så man er sikker på at det er det samme man tester på hver gang.
@AfterEach bruges til at gøre noget efter hver test, fx til at ryde op efter hver test. 
@BeforeAll, @AfterAll bruges til at gøre noget før den første test og efter den sidste test. 
@DisplayName bruges til at lave et custom navn til testen som bliver vist når testen køre. 
@Nested Bruges til at skabe en realation mellem test klasserne
assumeFalse, assumeTrue men assumsions kan man lægge et ekstra tjek ind, hvis den fejler, fejler testen ikke men kan blive afbrudt. 

### MOCKING FRAMEWORKS 

Mocktio og Easymock ligner hinaden meget, specielt i at de begge bruges til at lave Java test. Forskellen mellem dem, er hvem der har lavet dem og hvordan de bliver implimentert i koden. 
Jeg ville nok vælge Mockito, da det virker simplere og mere vel dokumenteret,samt ligner det at der er flere funktioner i det.