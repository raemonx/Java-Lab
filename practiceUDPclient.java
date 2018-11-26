import java.io.*;
import java.net.*;

class practiceUDPclient{
	public static void main(String[] args) throws IOException{
	DatagramSocket socket = new DatagramSocket();
	InetAddress address = InetAddress.getByName("localhost");
	int port=5242;
	byte buff[]={12,13};
	byte buffOne[]= new byte[2];
	DatagramPacket packet = new DatagramPacket(buff,2,address,port);

	DatagramPacket packetrcv = new DatagramPacket(buffOne,2);

	socket.connect(address,port);
	socket.send(packet);

	socket.receive(packetrcv);	
	}
	

}