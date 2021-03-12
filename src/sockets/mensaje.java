package sockets;

import java.io.Serializable;

public class mensaje implements Serializable{

	public mensaje(String nick,String ip,String mensaje) {
		this.nick=nick;
		this.ip=ip;
		this.mensaje=mensaje;
	}
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	private String nick,ip,mensaje;
}
