/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

/**
 *
 * @author guptas5279
 */
public class Player extends PlayerInfo implements Printable{
    
    private String lastName = "";
    private String firstName = "";
    private char gender = 'M';
    
    /*
    private String email = "";
    private double contantNum = 0;
    private int rating = 0;
    private int rank = 0;
    private String city = "";
    private int playerId = 0;
    private int teamId = 0;
    */
    
    public Player(){
        super("one", "player1", 'm');
    }
    
    public Player(String lastName, String firstName, char gender){
        super(lastName, firstName, gender);
        
        /*
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        */
    }
    
    public String toString(){
        return getLastName()+", "+ getFirstName()+", "+getGender();
    }
    
}
