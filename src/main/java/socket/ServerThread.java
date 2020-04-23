package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author ausu：服务器循环监听客户端连接请求，并创建多个进程建立通信。
 *
 */
public class ServerThread extends Thread{

    Socket socket=null;
    InputStream  inputStream=null;
    InputStreamReader inputStreamReader=null;
    OutputStream outputStream=null;
    BufferedReader bufferedReader=null;
    BufferedWriter buf=null;
    ServerSocket serverSocket=null;

    public ServerThread(Socket socket){

        this.socket=socket;
    }
    //重写Runable进程中的run()方法
    public void run(){
        try {
            //获取输入流，读取客户端信息
            InputStream inputStream = socket.getInputStream();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            //创建一个缓冲
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = bufferedReader.readLine();
            System.out.println("服务器获取："+str);
            socket.shutdownInput();//关闭输入流
            /**
             * 响应客户端
             */
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter p = new PrintWriter(outputStream);//将输出流包装成打印流
            BufferedWriter buf = new BufferedWriter(p);
            buf.write("服务器(Topsocket)线程响应客户端");
            buf.flush();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally{
            try {
                //关闭输出流


                //关闭资源
                if (inputStream!=null)
                    inputStream.close();
                if(inputStreamReader!=null)
                    inputStreamReader.close();
                if(bufferedReader!=null)
                    bufferedReader.close();
                if(outputStream!=null)
                    outputStream.close();
                if(buf!=null)
                    buf.close();
                if(socket!=null)
                    socket.close();
                if(serverSocket!=null)
                    serverSocket.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
    }
}
