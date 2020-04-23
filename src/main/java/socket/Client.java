package socket;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Socket socket = new Socket("localhost", 8888);
            OutputStream outputStream = socket.getOutputStream();

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("机密文件"+"come form PCsocket");
            bufferedWriter.flush();

            //关闭输出流
            socket.shutdownOutput();
            /**
             * 接收服务器信息
             */
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = bufferedReader.readLine();
            System.out.println(str);
            //关闭输入流
            //socket.shutdownInput();
            //socket.shutdownOutput();
            //关闭资源
            outputStream.close();
            outputStreamWriter.close();
            bufferedWriter.close();
            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
            socket.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
