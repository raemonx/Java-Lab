import java.io.*;
import java.net.*;

class practiceUDPserver{
	public static void main(String[] args) throws IOException{
		DatagramSocket socket = new DatagramSocket(5242);
	byte buff[]=new byte[2];
	byte buffOne[]={18,15};

	DatagramPacket packet = new DatagramPacket(buff,2);
	socket.receive(packet);
	DatagramPacket packetToSend = new DatagramPacket(buffOne,2,packet.getAddress(),packet.getPort());
	socket.send(packetToSend);
	}
	
}