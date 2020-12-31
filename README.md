# DrugDecisionSystem
## Greetings! 
## This readme file will guide you to run this application.

**To run this application, please follow the following steps:**
1. Make sure you have your **JRE** installed in your computer.
2. **Clone or download** this github repository to your computer.
3. Direct to **"DrugDecisionSystem/out/artifacts/DrugDecisionSystem_jar"** on your bash or powershell.
4. Type in **"java -jar DrugDecisionSystem.jar patients.txt"**, this will generate the resulting file named **"decisions.txt"**.
5. Open **"decisions.txt"** in **"DrugDecisionSystem/out/artifacts/DrugDecisionSystem_jar"** to see the drug decisions.

## Assumptions made
1. I assume each patient has a patientID to distinguish cases like name duplication.
2. I assume each patient has a firstname and a lastname.
3. I assume the layout for each row of the input text file as:

PatientID | FirstName | LastName | Age | Weight
--------- | --------- | -------- | --- | ------

4. I made the layout for each row of the output text file as:

Patient Name | Age | Weight | Random Number | Allocation Group | Drug Name
------------ | --- | ------ | ------------- | ---------------- | ---------

If you has any difficulties in running this program, please contact me without hesitation!
