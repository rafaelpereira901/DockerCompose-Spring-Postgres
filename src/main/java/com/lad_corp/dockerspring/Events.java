package com.lad_corp.dockerspring;


public class Events {
	
	public int eventoId;
	public String nome;
	public String descricao;
	public String local = "Local do evento";
	public String data = "2022-04-19T20:33:59.452Z";
	public String hora = "hora_inicio";
	public String horaFim = "hora_fim";
	public String url = "https://www.google.com.br";
	public String image = "imagem?";
	public boolean aoVivo = true;
	public String aoVivoUrl =  "https://www.google.com.br/maps";
	
	public Events(int eventoId, String nome, String descricao) {
		this.eventoId = eventoId;
		this.nome = nome;
		this.descricao = descricao;
	}
}
