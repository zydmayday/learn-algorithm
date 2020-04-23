package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static int count = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建一个ServerSocket对象
        System.out.println("服务器开始与客户端交互数据");
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            //循环监听客户端请求
            while (true) {
                //持续监听客户端,如果有请求则创建一个Socket对象
                Socket socket = serverSocket.accept();
                //创建线程，进行通信
                ServerThread serverThread = new ServerThread(socket);
                //开启通信进程
                serverThread.start();
                //添加计数器
                count++;
                System.err.println("客户端数量：" + count);
            }
            /*
            //获取输入流，读取客户端信息
            InputStream inputStream = socket.getInputStream();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            //创建一个缓冲
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = bufferedReader.readLine();
//          while (str!=null) {
//
//              System.out.println("服务器获取："+str);
//          }

            System.out.println("服务器获取："+str);
            socket.shutdownInput();//关闭输入流
            // 响应客户端
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter p = new PrintWriter(outputStream);//将输出流包装成打印流
            BufferedWriter buf = new BufferedWriter(p);
            buf.write("服务器响应了哟");
            buf.flush();
            //关闭资源
            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
            outputStream.close();
            buf.close();
            */
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
