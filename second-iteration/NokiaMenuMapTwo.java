import java.util.Scanner;
    public class NokiaMenuMapOne{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while (true){    
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
            System.out.println("0. Exit");

            System.out.print("Select a number: ");
            int menuFunctions = input.nextInt();

            if (menuFunctions == 0){
                System.out.println("Exiting");
                break;
            }

            switch (menuFunctions) {
                case 1 -> {
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
                            case 1 -> System.out.println("Search");

                            case 2 -> System.out.println("Service Nos.");

                            case 3 -> System.out.println("Add name");

                            case 4 -> System.out.println("Erase");

                            case 5 -> System.out.println("Edit");

                            case 6 -> System.out.println("Assign tone");

                            case 7 -> System.out.println("Send b’card");

                            case 8 -> {
                                    System.out.println("Options");
                                    System.out.println("1. Type of view");
                                    System.out.println("2. Memory status");
                                    System.out.println("0. Back");

                                    System.out.print("Select an input: ");
                                    menuFunctions = input.nextInt();

                                    switch (menuFunctions){
                                        case 1 -> System.out.println("Type of view");
                                                
                                        case 2 -> System.out.println("Memory status");
                                    }
                                 }

                            case 9 -> System.out.println("Speed dials");

                            case 10 -> System.out.println("Voice tags");
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

                                case 1 -> System.out.println("Write messages");

                                case 2 -> System.out.println("Inbox");

                                case 3 -> System.out.println("Outbox");

                                case 4 -> System.out.println("Picture messages");

                                case 5 -> System.out.println("Templates");

                                case 6 -> System.out.println("Smileys");

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
                                                    case 1 -> System.out.println("Message centre number");

                                                    case 2 -> System.out.println("Message sent as");

                                                    case 3 -> System.out.println("Message validity");
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
                                                    case 1 -> System.out.println("Delivery reports");

                                                    case 2 -> System.out.println("Reply via same centre");

                                                    case 3 -> System.out.println("Character support");
                                                    }
                                                }
                                            } 
                                        } 

                                case 8 -> System.out.println("Info service");

                                case 9 -> System.out.println("Voice mailbox number");

                                case 10 -> System.out.println("Service command editor");
                                    }
                                }
                    case 3 -> System.out.println("Chat");

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

                                case 1 -> System.out.println("Missed calls");

                                case 2 -> System.out.println("Received calls");

                                case 3 -> System.out.println("Dialled numbers");

                                case 4 -> System.out.println("Erase recent call list");

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
                                                case 1 -> System.out.println("Last call duration");

                                                case 2 -> System.out.println("All calls duration");

                                                case 3 -> System.out.println("Received calls duration");

                                                case 4 -> System.out.println("Dialled calls duration");

                                                case 5 -> System.out.println("Clear timers");
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
                                                case 1 -> System.out.println("Last call cost");

                                                case 2 -> System.out.println("All calls cost");

                                                case 3 -> System.out.println("Clear counters");
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
                                                case 1 -> System.out.println("Call cost limit");

                                                case 2 -> System.out.println("Show costs in");
                                                    }
                                                }   

                                case 8 -> System.out.println("Prepaid credit");
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

                                case 1 -> System.out.println("Ringing tone");

                                case 2 -> System.out.println("Ringing volume");

                                case 3 -> System.out.println("Incoming call alert");

                                case 4 -> System.out.println("Composer");
                                
                                case 5 -> System.out.println("Message alert tone");

                                case 6 -> System.out.println("Keypad tones");

                                case 7 -> System.out.println("Warning and game tones");

                                case 8 -> System.out.println("Vibrating alert");

                                case 9 -> System.out.println("Screen saver");
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
                                            case 1 -> System.out.println("Automatic redial");

                                            case 2 -> System.out.println("Speed dialling");

                                            case 3 -> System.out.println("Call waiting options");

                                            case 4 -> System.out.println("Own number sending");

                                            case 5 -> System.out.println("Phone line in use");

                                            case 6 -> System.out.println("Automatic answer");
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
                                            case 1 -> System.out.println("Language");

                                            case 2 -> System.out.println("Cell info display");

                                            case 3 -> System.out.println("Welcome notes");

                                            case 4 -> System.out.println("Network selection");

                                            case 5 -> System.out.println("Lights");

                                            case 6 -> System.out.println("Confirm SIM service actions");
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
                                            case 1 -> System.out.println("PIN code request");

                                            case 2 -> System.out.println("Call barring service");

                                            case 3 -> System.out.println("Fixed dialling");

                                            case 4 -> System.out.println("Closed user group");

                                            case 5 -> System.out.println("Phone security");

                                            case 6 -> System.out.println("Change access codes");
                                                    }
                                                 }

                                case 4 -> System.out.println("Restore factory settings");
                                          } 
                                    }              
                    
                    case 7 -> System.out.println("Call divert");

                    case 8 -> System.out.println("Games");

                    case 9 -> System.out.println("Calculator");

                    case 10 -> System.out.println("Reminders");
                
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

                                case 1 -> System.out.println("Alarm clock");

                                case 2 -> System.out.println("Clock settings");

                                case 3 -> System.out.println("Date setting");

                                case 4 -> System.out.println("Stopwatch");
                                
                                case 5 -> System.out.println("Countdown timer");

                                case 6 -> System.out.println("Auto update of date and time");
                                        }                   
                                    }
                    
                    case 12 -> System.out.println("Profiles");

                    case 13 -> System.out.println("SIM services");


                }
            }
        }
    }
