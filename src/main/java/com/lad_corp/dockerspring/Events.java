package com.lad_corp.dockerspring;


public class Events {
	
	public int EventoId;
	public String Nome;
	public String Descricao;
	public String Local = "Local do evento";
	public String Data;
	public String Hora;
	public String HoraFim;
	public String Url = "https://www.google.com.br";
	public String Image = "imagem?";
	public boolean AoVivo = true;
	public String AoVivoUrl =  "https://www.google.com.br/maps";
	
	public Events(int eventoId, String nome, String descricao, String data, String hora,String hora_fim, boolean aoVivo) {
		this.EventoId = eventoId;
		this.Nome = nome;
		this.Descricao = descricao;
		this.Data = data;
		this.Hora = hora;
		this.HoraFim = hora_fim;
		this.AoVivo = aoVivo;
	}
}
