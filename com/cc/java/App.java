package com.cc.java;

public class App {
    public static void main(String[] args) {
        HoneyBee w = new Worker();
        HoneyBee d = new Drone();
        HoneyBee q = new Queen();
        HoneyBee s = new Security();

        Out.o( Out.c( "#y" ) + Out.l( "Bees" ) );
            Out.o( Out.t( 1 ) + d.j() );
            Out.o( Out.t( 1 ) + w.j() );
            Out.o( Out.t( 1 ) + s.j() );
            Out.o( Out.t( 1 ) + q.j() );
    
        Out.o( Out.n() + Out.c( "#y" ) + Out.l( "Can u fly?" ) );
            Out.o( Out.t( 1 ) + d.f() );
            Out.o( Out.t( 1 ) + w.f() );
            Out.o( Out.t( 1 ) + s.f() );
            Out.o( Out.t( 1 ) + q.f() );

        // Ansprechen der Pseudo Klasse ist dank abstract nicht mehr möglich
            // Out.o( Out.n() + Out.c( "#y" ) + Out.l() );
            // Out.o( Out.c( "#y" ) + Out.l( "Test - sollte nicht gehen" ) );
            //     HoneyBee b = new HoneyBee();
            //     Out.o( Out.t( 1 ) + b.j() );
            //     Out.o( Out.t( 1 ) + b.f() );
        
        Out.o( Out.n() + Out.c( "#y" ) + Out.l( "end of line" ) );
    }
}