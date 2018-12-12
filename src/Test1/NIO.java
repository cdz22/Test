package Test1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class NIO {
	//buffer基本用法
	public void readFile(String fileName) {
		try {
			RandomAccessFile rf = new RandomAccessFile(fileName,"rw");
			FileChannel cn =rf.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			int n = cn.read(buffer);
			while(n!=-1) {
				buffer.flip();
	             while (buffer.hasRemaining()) {
	                //获取buffer中的数据
	                System.out.print((char) buffer.get());
	             }
	             buffer.clear();
	             n = cn.read(buffer);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
