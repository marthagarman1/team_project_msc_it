import commandline.TopTrumpsCLIApplication;

import online.TopTrumpsOnlineApplication;



public class TopTrumps {

	/** This is the main class for the TopTrumps Application */
   public static void main(String[] args) throws Exception {
   	
      	System.out.println(" _____            _____ ");
	System.out.println("|_   _|__ _ __  |_   _|_ _  _ _ __  _ __ ___ ");
	System.out.println("  | |/ _ \\ '_ \\   | || '_| || | '  \\| '_ (_- ");
	System.out.println("  |_|\\___/ .__/   |_||_|  \\_,_|_|_|_| .__/__/");
	System.out.println("          |_|                         |_| ");
   	
   	// command line switches
      boolean onlineMode = false;
      boolean commandLineMode = false;
      boolean printTestLog = false;
   	
   	// check the command line for what switches are active
      for (String arg : args) {
      	
         if (arg.equalsIgnoreCase("-t")) printTestLog=true;
         if (arg.equalsIgnoreCase("-c")) commandLineMode=true;
         if (arg.equalsIgnoreCase("-o")) onlineMode=true;
      	
      }
   	
   	// We cannot run online and command line mode simultaniously
      if (onlineMode && commandLineMode) {
         System.out.println("ERROR: Both online and command line mode selected, select one or the other!");
         System.exit(0);
      }
   	
   	// Start the appropriate application
      if (onlineMode) {
      	// Start the online application
         String[] commandArgs = {"server", "TopTrumps.json"};
         TopTrumpsOnlineApplication.main(commandArgs);
      } else if (commandLineMode) {
      	// Start the command line application
         String[] commandArgs = {String.valueOf(printTestLog)};
         TopTrumpsCLIApplication.main(commandArgs);
      }
   	
   }
	
}
