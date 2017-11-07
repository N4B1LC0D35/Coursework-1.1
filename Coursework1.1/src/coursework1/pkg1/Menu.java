/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.util.Scanner;

/**
 *
 * @author M00555527
 */
public class Menu {
    
}

class Main {
  public void display_menu() {
    System.out.println ( "1) Option 1\n2) Option 2\n3) Option 3" );
    System.out.print ( "Selection: " );
  }
  
  public Main() {
    Scanner in = new Scanner ( System.in );
    
    while 
    
    display_menu();
    int choice = in.nextInt();
    switch ( choice ) {
      case 1:
        System.out.println ( "You picked option 1" );
        break;
      case 2:
        System.out.println ( "You picked option 2" );
        break;
      case 3:
        System.out.println ( "You picked option 3" );
        break;
      default:
        System.err.println ( "Unrecognized option" );
        break;
    }
  }
  
  public static void main ( String[] args ) {
    new Main();
  }
}