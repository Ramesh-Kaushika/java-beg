import java.util.*;
  class Hospitel{
	 
	 public static void main(String []args){
		 
		 Scanner input = new Scanner (System.in);
		 
		 String[] mainQuestions = {"1. Patient Management", "2. Doctor Management", "3.Appointment Management"};
		 String[] questions = {"(2) Find Patient", "(3) Delete Patient", "(4) Update Patient", "(5) Print All Patient", "(6) Main Menu"};
		 
		 System.out.println("Hospital Management System Menu");
		 
		 for(int i = 0; i<mainQuestions.length; i++){
		 System.out.println(mainQuestions[i]);
	 }
		 System.out.print("Select Option ");
		 
		 
		  
		 int numbers = input.nextInt();
		 
		 switch(numbers){
			 
			 
			 case 1 :
						while (flag) {
                        System.out.println("<---Select Your Option--->");
                        int answer = printQuestions(questions, input);


                        switch (answer) {

                            case 0:
                                addPatient(patients, input);
                                System.out.println(Arrays.deepToString(patients));
                                break;
                            case 1:
                                findAndPrintPatients(patients, input);
                                break;
                            case 2:
                                deletePatients(patients, input);
                                System.out.println(Arrays.deepToString(patients));
                                break;
                            case 3:
                                updatePatients(patients, input);
                                System.out.println(Arrays.deepToString(patients));
                                break;
                            case 4:
                                printAll(patients);
                                break;
                            case 5:
                                // System.exit(0);
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid Entry");
                                break;

                        }

                    }
			 break;
			 
			 case 2 :
			 
			 break;
			 
			 }
		 
		 
		 
	 }
	 
 }
