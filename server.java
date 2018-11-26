import java.io.*;
import java.net.*;
class server{
	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			DataInputStream stream = new DataInputStream(s.getInputStream());
			String str=(String)stream.readUTF();
			System.out.println("message"+str);
			ss.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}