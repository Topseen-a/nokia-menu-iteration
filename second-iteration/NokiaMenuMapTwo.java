import java.util.Scanner;
    public class NokiaMenuMapTwo{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    
        while(true){
        System.out.println("List of menu options");
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");

        System.out.print("Select a number: ");
        int menuFunctions = input.nextInt();

        switch (menuFunctions) {
            case 1 -> {
                while(true){
                    System.out.println("1. Search");
                    System.out.println("2. Service Nos.");
                    System.out.println("3. Add name");
                    System.out.println("4. Erase");
                    System.out.println("5. Edit");
                    System.out.println("6. Assign tone");
                    System.out.println("7. Send b’card");
                    System.out.println("8. Options");
                    System.out.println("9. Speed dials");
                    System.out.println("10. Voice tags");
                    System.out.println("0. Back");
                    System.out.print("Select a number: ");
           
                    menuFunctions = input.nextInt();
   
                    switch (menuFunctions) {
                        case 1 -> {System.out.println("Search");
                                  System.out.println("0. Back");}

                        case 2 -> {System.out.println("Service Nos.");
                                    System.out.println("0. Back");}

                        case 3 -> {System.out.println("Add name");
                                    System.out.println("0. Back");}

                        case 4 -> {System.out.println("Erase");
                                    System.out.println("0. Back");}

                        case 5 -> {System.out.println("Edit");
                                    System.out.println("0. Back");}

                        case 6 -> {System.out.println("Assign tone");
                                    System.out.println("0. Back");}

                        case 7 -> {System.out.println("Send b’card");
                                    System.out.println("0. Back");}

                        case 8 -> {
                                System.out.println("Options");
                                System.out.println("1. Type of view");
                                System.out.println("2. Memory status");
                                System.out.println("0. Back");
                              
                                System.out.print("Select an input: ");
                                menuFunctions = input.nextInt();

                                switch (menuFunctions){
                                    case 1 -> {System.out.println("Type of view");
                                                System.out.println("0. Back");}
                                            
                                    case 2 -> {System.out.println("Memory status");
                                                System.out.println("0. Back");}
                                }
                             }

                        case 9 -> {System.out.println("Speed dials");
                                System.out.println("0. Back");}

                        case 10 -> {System.out.println("Voice tags");
                                    System.out.println("0. Back");}
                            } 
                        } 
                      }
                case 2 -> {
                        System.out.println("1. Write messages");
                        System.out.println("2. Inbox");
                        System.out.println("3. Outbox");
                        System.out.println("4. Picture messages");
                        System.out.println("5. Templates");
                        System.out.println("6. Smileys");
                        System.out.println("7. Message settings");
                        System.out.println("8. Info service");
                        System.out.println("9. Voice mailbox number");
                        System.out.println("10. Service command editor");
                        System.out.println("0. Back");
                        System.out.print("Select a number: ");

                        menuFunctions = input.nextInt();

                        switch (menuFunctions) {

                            case 1 -> {System.out.println("Write messages");
                                        System.out.println("0. Back");}

                            case 2 -> {System.out.println("Inbox");
                                        System.out.println("0. Back");}

                            case 3 -> {System.out.println("Outbox");
                                        System.out.println("0. Back");}

                            case 4 -> {System.out.println("Picture messages");
                                        System.out.println("0. Back");}

                            case 5 -> {System.out.println("Templates");
                                        System.out.println("0. Back");}

                            case 6 -> {System.out.println("Smileys");
                                        System.out.println("0. Back");}

                            case 7 -> {
                                    System.out.println("Message settings");
                                    System.out.println("1. Set 1");
                                    System.out.println("2. Common 3");
                                    System.out.println("0. Back");

                                    System.out.print("Select an input: ");
                                    menuFunctions = input.nextInt();

                                    switch (menuFunctions) {
                                        case 1 -> {
                                                System.out.println("1. Message centre number");
                                                System.out.println("2. Message sent as");
                                                System.out.println("3. Message validity");
                                                System.out.println("0. Back");

                                                System.out.print("Select an input: ");
                                                menuFunctions = input.nextInt();

                                            switch (menuFunctions) {
                                                case 1 -> {System.out.println("Message centre number");
                                                            System.out.println("0. Back");}

                                                case 2 -> {System.out.println("Message sent as");
                                                            System.out.println("0. Back");}

                                                case 3 -> {System.out.println("Message validity");
                                                            System.out.println("0. Back");}
                                                }
                                            }

                                        case 2 -> {
                                                System.out.println("1. Delivery reports");
                                                System.out.println("2. Reply via same centre");
                                                System.out.println("3. Character support");
                                                System.out.println("0. Back");

                                                System.out.print("Select an input: ");
                                                menuFunctions = input.nextInt();

                                            switch (menuFunctions) {
                                                case 1 -> {System.out.println("Delivery reports");
                                                            System.out.println("0. Back");}

                                                case 2 -> {System.out.println("Reply via same centre");
                                                            System.out.println("0. Back");}

                                                case 3 -> {System.out.println("Character support");
                                                            System.out.println("0. Back");}
                                                }
                                            }
                                        } 
                                    } 

                            case 8 -> {System.out.println("Info service");
                                        System.out.println("0. Back");}

                            case 9 -> {System.out.println("Voice mailbox number");
                                        System.out.println("0. Back");}

                            case 10 -> {System.out.println("Service command editor");
                                        System.out.println("0. Back");}
                                }
                            }
                case 3 -> {System.out.println("Chat");
                            System.out.println("0. Back");}

                case 4 -> {
                        System.out.println("1. Missed calls");
                        System.out.println("2. Received calls");
                        System.out.println("3. Dialled numbers");
                        System.out.println("4. Erase recent call list");
                        System.out.println("5. Show call duration");
                        System.out.println("6. Show call costs");
                        System.out.println("7. Call cost settings");
                        System.out.println("8. Prepaid credit");
                        System.out.println("0. Back");
                        System.out.print("Select a number: ");

                        menuFunctions = input.nextInt();

                        switch (menuFunctions) {

                            case 1 -> {System.out.println("Missed calls");
                                        System.out.println("0. Back");}

                            case 2 -> {System.out.println("Received calls");
                                        System.out.println("0. Back");}

                            case 3 -> {System.out.println("Dialled numbers");
                                        System.out.println("0. Back");}

                            case 4 -> {System.out.println("Erase recent call list");
                                        System.out.println("0. Back");}

                            case 5 -> {
                                    System.out.println("Show call duration");
                                    System.out.println("1. Last call duration");
                                    System.out.println("2. All calls duration");
                                    System.out.println("3. Received calls duration");
                                    System.out.println("4. Dialled calls duration");
                                    System.out.println("5. Clear timers");
                                    System.out.println("0. Back");

                                    System.out.print("Select an input: ");
                                    menuFunctions = input.nextInt();

                                        switch (menuFunctions) {
                                            case 1 -> {System.out.println("Last call duration");
                                                        System.out.println("0. Back");}

                                            case 2 -> {System.out.println("All calls duration");
                                                        System.out.println("0. Back");}

                                            case 3 -> {System.out.println("Received calls duration");
                                                        System.out.println("0. Back");}

                                            case 4 -> {System.out.println("Dialled calls duration");
                                                        System.out.println("0. Back");}

                                            case 5 -> {System.out.println("Clear timers");
                                                        System.out.println("0. Back");}
                                                }
                                              }

                            case 6 -> {
                                    System.out.println("Show call cost");
                                    System.out.println("1. Last call cost");
                                    System.out.println("2. All calls cost");
                                    System.out.println("3. Clear counters");
                                    System.out.println("0. Back");

                                    System.out.print("Select an input: ");
                                    menuFunctions = input.nextInt();

                                        switch (menuFunctions) {
                                            case 1 -> {System.out.println("Last call cost");
                                                        System.out.println("0. Back");}

                                            case 2 -> {System.out.println("All calls cost");
                                                        System.out.println("0. Back");}

                                            case 3 -> {System.out.println("Clear counters");
                                                        System.out.println("0. Back");}
                                                }
                                            }

                            case 7 -> { 
                                    System.out.println("Call cost settings");
                                    System.out.println("1. Call cost limit");
                                    System.out.println("2. Show costs in");
                                    System.out.println("0. Back");

                                    System.out.print("Select an input: ");
                                    menuFunctions = input.nextInt();

                                        switch (menuFunctions) {
                                            case 1 -> {System.out.println("Call cost limit");
                                                        System.out.println("0. Back");}

                                            case 2 -> {System.out.println("Show costs in");
                                                        System.out.println("0. Back");}
                                                }
                                            }   

                            case 8 -> {System.out.println("Prepaid credit");
                                        System.out.println("0. Back");}
                                }   
                            }   

                case 5 -> {
                        System.out.println("1. Ringing tone");
                        System.out.println("2. Ringing volume");
                        System.out.println("3. Incoming call alert");
                        System.out.println("4. Composer");
                        System.out.println("5. Message alert tone");
                        System.out.println("6. Keypad tones");
                        System.out.println("7. Warning and game tones");
                        System.out.println("8. Vibrating alert");
                        System.out.println("9. Screen saver");
                        System.out.println("0. Back");

                        System.out.print("Select a number: ");
                        menuFunctions = input.nextInt();

                        switch (menuFunctions) {

                            case 1 -> {System.out.println("Ringing tone");
                                        System.out.println("0. Back");}

                            case 2 -> {System.out.println("Ringing volume");
                                        System.out.println("0. Back");}

                            case 3 -> {System.out.println("Incoming call alert");
                                        System.out.println("0. Back");}

                            case 4 -> {System.out.println("Composer");
                                        System.out.println("0. Back");}
                            
                            case 5 -> {System.out.println("Message alert tone");
                                        System.out.println("0. Back");}

                            case 6 -> {System.out.println("Keypad tones");
                                        System.out.println("0. Back");}

                            case 7 -> {System.out.println("Warning and game tones");
                                        System.out.println("0. Back");}

                            case 8 -> {System.out.println("Vibrating alert");
                                        System.out.println("0. Back");}

                            case 9 -> {System.out.println("Screen saver");
                                        System.out.println("0. Back");}
                                    }                   
                                }
            
                case 6 -> {
                        System.out.println("1. Call settings");
                        System.out.println("2. Phone settings");
                        System.out.println("3. Security settings");
                        System.out.println("4. Restore factory settings");
                        System.out.println("0. Back");                    
                        
                        System.out.print("Select a number: ");
                        menuFunctions = input.nextInt();

                        switch (menuFunctions) {

                            case 1 -> {
                                System.out.println("1. Automatic redial");
                                System.out.println("2. Speed dialling");
                                System.out.println("3. Call waiting options");
                                System.out.println("4. Own number sending");
                                System.out.println("5. Phone line in use");
                                System.out.println("6. Automatic answer");
                                System.out.println("0. Back");

                                System.out.print("Select a number: ");
                                menuFunctions = input.nextInt();

                                    switch (menuFunctions) {
                                        case 1 -> {System.out.println("Automatic redial");
                                                    System.out.println("0. Back");}

                                        case 2 -> {System.out.println("Speed dialling");
                                                    System.out.println("0. Back");}

                                        case 3 -> {System.out.println("Call waiting options");
                                                    System.out.println("0. Back");}

                                        case 4 -> {System.out.println("Own number sending");
                                                    System.out.println("0. Back");}

                                        case 5 -> {System.out.println("Phone line in use");
                                                    System.out.println("0. Back");}

                                        case 6 -> {System.out.println("Automatic answer");
                                                    System.out.println("0. Back");}
                                                }
                                        }      


                            case 2 -> {
                                System.out.println("1. Language");
                                System.out.println("2. Cell info display");
                                System.out.println("3. Welcome notes");
                                System.out.println("4. Network selection");
                                System.out.println("5. Lights");
                                System.out.println("6. Confirm SIM service actions");
                                System.out.println("0. Back");

                                System.out.print("Select a number: ");
                                menuFunctions = input.nextInt();

                                    switch (menuFunctions) {
                                        case 1 -> {System.out.println("Language");
                                                    System.out.println("0. Back");}

                                        case 2 -> {System.out.println("Cell info display");
                                                    System.out.println("0. Back");}

                                        case 3 -> {System.out.println("Welcome notes");
                                                    System.out.println("0. Back");}

                                        case 4 -> {System.out.println("Network selection");
                                                    System.out.println("0. Back");}

                                        case 5 -> {System.out.println("Lights");
                                                    System.out.println("0. Back");}

                                        case 6 -> {System.out.println("Confirm SIM service actions");
                                                    System.out.println("0. Back");}
                                                }  
                                            }      

                            case 3 -> {
                                System.out.println("1. PIN code request");
                                System.out.println("2. Call barring service");
                                System.out.println("3. Fixed dialling");
                                System.out.println("4. Closed user group");
                                System.out.println("5. Phone security");
                                System.out.println("6. Change access codes");
                                System.out.println("0. Back");

                                System.out.print("Select a number: ");
                                menuFunctions = input.nextInt();

                                    switch (menuFunctions) {
                                        case 1 -> {System.out.println("PIN code request");
                                                    System.out.println("0. Back");}

                                        case 2 -> {System.out.println("Call barring service");
                                                    System.out.println("0. Back");}

                                        case 3 -> {System.out.println("Fixed dialling");
                                                    System.out.println("0. Back");}

                                        case 4 -> {System.out.println("Closed user group");
                                                    System.out.println("0. Back");}

                                        case 5 -> {System.out.println("Phone security");
                                                    System.out.println("0. Back");}

                                        case 6 -> {System.out.println("Change access codes");
                                                    System.out.println("0. Back");}
                                                }
                                             }

                            case 4 -> {System.out.println("Restore factory settings");
                                        System.out.println("0. Back");}
                                      } 
                                }              
                
                case 7 -> {System.out.println("Call divert");
                            System.out.println("0. Back");}

                case 8 -> {System.out.println("Games");
                            System.out.println("0. Back");}

                case 9 -> {System.out.println("Calculator");
                            System.out.println("0. Back");}

                case 10 -> {System.out.println("Reminders");
                            System.out.println("0. Back");}
            
                case 11 -> {
                        System.out.println("1. Alarm clock");
                        System.out.println("2. Clock settings");
                        System.out.println("3. Date setting");
                        System.out.println("4. Stopwatch");
                        System.out.println("5. Countdown timer");
                        System.out.println("6. Auto update of date and time");
                        System.out.println("0. Back");
    
                        System.out.print("Select a number: ");
                        menuFunctions = input.nextInt();

                        switch (menuFunctions) {

                            case 1 -> {System.out.println("Alarm clock");
                                        System.out.println("0. Back");}

                            case 2 -> {System.out.println("Clock settings");
                                        System.out.println("0. Back");}

                            case 3 -> {System.out.println("Date setting");
                                        System.out.println("0. Back");}

                            case 4 -> {System.out.println("Stopwatch");
                                        System.out.println("0. Back");}
                            
                            case 5 -> {System.out.println("Countdown timer");
                                        System.out.println("0. Back");}

                            case 6 -> {System.out.println("Auto update of date and time");
                                        System.out.println("0. Back");}
                                    }                   
                                }
                
                case 12 -> {System.out.println("Profiles");
                            System.out.println("0. Back");}

                case 13 -> {System.out.println("SIM services");
                            System.out.println("0. Back");}


            }
        }
    }
}
