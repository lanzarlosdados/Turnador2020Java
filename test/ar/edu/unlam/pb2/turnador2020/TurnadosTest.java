package ar.edu.unlam.pb2.turnador2020;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TurnadosTest {

	

	@Test
	public void testQueCargueLosTurnos() {
		
		 
		
		 Turnador miTurnador = new Turnador(30);
		 
		 Integer actual =miTurnador.getTurnos().size();
		 Integer esperado=30;
		 
		 assertEquals(esperado, actual);
		
	}
	
	
	@Test
	public void testObtenerTurnoActual() {
		
		 
		
		 Turnador miTurnador = new Turnador(30);
		 
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 Integer actual =miTurnador.obtenerTurnoActual();
		 Integer esperado = 1;
		 
		 assertEquals(esperado, actual);
		 
		 
	}	
	
	@Test
	public void comoQuedaMiListaTurnoCuandoEntregoElPrimerTurno(){
		
		Turnador miTurnador = new Turnador(30);
		 
		 miTurnador.EntregarTurno();
		
		 Integer actual=miTurnador.getTurnos().get(0);
		 Integer esperado = 2;
		
		 assertEquals(esperado, actual);
		
		
		 Integer actual1= miTurnador.getTurnos().size();
		 Integer esperado1 = 29;
		 assertEquals(esperado1, actual1);
		
	}
	@Test 
	public void testDeContarTurnosEntregados(){
		
		
        Turnador miTurnador = new Turnador(30);
		 
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 
		 Integer actual= miTurnador.contarTurnosEntregados();
		 Integer esperado= 4;
		 
		 assertEquals(esperado,actual);
	}
	
	@Test 
	public void testDeContarTurnosAtendidos(){
		
		
        Turnador miTurnador = new Turnador(30);
		 
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 
		 miTurnador.atenderTurno();
		 miTurnador.atenderTurno();
		 miTurnador.atenderTurno();
		 
		 Integer actual= miTurnador.turnosAtendidos();
		 Integer esperado= 3;
		 
		 assertEquals(esperado,actual);
	}
	@Test
	public void testAtenderTurnos(){
		
		Turnador miTurnador = new Turnador(30);
		 
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 miTurnador.EntregarTurno();
		 
		 miTurnador.atenderTurno();
		 miTurnador.atenderTurno();
		 miTurnador.atenderTurno();
		 
		 Integer actual = miTurnador.getTurnosEnEspera().size();
		 Integer esperado = 1;
		 
		 assertEquals(esperado,actual);
	}

}
