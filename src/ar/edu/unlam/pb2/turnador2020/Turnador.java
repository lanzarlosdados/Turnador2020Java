package ar.edu.unlam.pb2.turnador2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Turnador {
    private LinkedList<Integer> turnos;
    private LinkedList<Integer>  turnosEnEspera;
	private Integer cantidadDeTurnos;
	private Integer turnosAtendidos ;
   
	public Turnador(Integer cantidadDeTurnos) {
		super();
		this.cantidadDeTurnos= cantidadDeTurnos;
		
		turnosEnEspera = new LinkedList<>();
		
		turnos = new LinkedList<>();
		
		for(Integer i =1;i<=cantidadDeTurnos;i++){
			turnos.add(i);
		}
		turnosAtendidos=0;
	}

	public void EntregarTurno(){
		
		turnosEnEspera.add(turnos.getFirst());
		turnos.removeFirst();
		
	}
    
	public Integer obtenerTurnoActual(){
		
		if(!turnosEnEspera.isEmpty()){
		
			return turnosEnEspera.getFirst();
	   }else{
		   return 0;
	   }
	}	
	
	public Integer contarTurnosEntregados(){
		
		return turnosEnEspera.size();
		
	}
	 public void atenderTurno(){
		 
		 turnos.addLast(turnosEnEspera.getFirst()); 
		 turnosEnEspera.removeFirst();
		 turnosAtendidos++;
		 
	 }
	 
	 public Integer turnosAtendidos(){
		 
		 return turnosAtendidos;
	 }
	public List<Integer> getTurnos() {
		return turnos;
	}

	public List<Integer> getTurnosEnEspera() {
		return turnosEnEspera;
	}

	public Integer getCantidadDeTurnos() {
		return cantidadDeTurnos;
	}
    
   
    
    
}
