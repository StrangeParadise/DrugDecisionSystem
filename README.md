# DrugDecisionSystem
## Greetings! 
## This readme file will guide you to run this application.

**To run this application, please follow the following steps:**
1. Make sure you have your **JRE** installed in your computer.
2. **Clone or download** this github repository to your computer.
3. Direct to **"DrugDecisionSystem/out/artifacts/DrugDecisionSystem_jar"** on your bash or powershell.
4. Type in **"java -jar DrugDecisionSystem.jar patients.txt"**, this will generate the resulting file named **"decisions.txt"**.
5. Open **"decisions.txt"** in **"DrugDecisionSystem/out/artifacts/DrugDecisionSystem_jar"** to see the drug decisions.
6. Feel free to modify the **"patients.txt"** file in **"DrugDecisionSystem/out/artifacts/DrugDecisionSystem_jar"** then run the program again to see the corresponding changes in the **"decisions.txt"** file.

**Alternativly**,

Import this project to your Intellij IDE, add application configurations with valid input arguments(in this case, patients.txt), then run it through the IDE.

## Assumptions made
1. I assume each patient has a patientID to distinguish cases like name duplication.
2. I assume each patient has a firstname and a lastname.
3. I assume the layout for each row of the input text file as:

PatientID | FirstName | LastName | Age | Weight
--------- | --------- | -------- | --- | ------
4. I assume all the input information is in a valid range.
5. I made the layout for each row of the output text file as:

Patient Name | Age | Weight | Random Number | Allocation Group | Drug Name
------------ | --- | ------ | ------------- | ---------------- | ---------

If you has any difficulties in running this program, please contact me without hesitation!
