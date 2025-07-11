package Inheritance.Method_Overridding;

import java.util.*;
public class Simple {

        String getName(){
            return "Generic Sports";
        }

        void getNumberOfTeamMembers(){
            System.out.println( "Each team has n players in " + getName() );
        }
    }

    class Soccer extends Simple{
        @Override
        String getName(){
            return "Soccer Class";
        }

        // Write your overridden getNumberOfTeamMembers method here
        void getNumberOfTeamMembers(){
            System.out.println( "Each team has 11 players in " + getName() );
        }
    }

    class Solution{

        public static void main(String []args){
            Simple c1 = new Simple();
            Soccer c2 = new Soccer();
            System.out.println(c1.getName());
            c1.getNumberOfTeamMembers();
            System.out.println(c2.getName());
            c2.getNumberOfTeamMembers();
        }
    }

