package com.lad_corp.dockerspring;


public class Events {
	
	public int eventoId;
	public String nome;
	public String descricao;
	public String local = "Local do evento";
	public String data;
	public String hora;
	public String horaFim;
	public String url = "https://www.google.com.br";
	public String image = "imagem?";
	public boolean aoVivo = true;
	public String aoVivoUrl =  "https://www.google.com.br/maps";
	
	public Events(int eventoId, String nome, String descricao, String data, String hora,String hora_fim, boolean aoVivo) {
		this.eventoId = eventoId;
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.hora = hora;
		this.horaFim = hora_fim;
		this.aoVivo = aoVivo;
	}
}
