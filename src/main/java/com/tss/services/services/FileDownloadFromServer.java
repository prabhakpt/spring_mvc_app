package com.tss.services.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
public class FileDownloadFromServer {

    public void fileDownload() {
       /* String serverAddress = ""; // ftp server address 
        int port = ; // ftp uses default port Number 21
        String username = "";// username of ftp server
        String password = ""; // password of ftp server
  
        FTPClient ftpClient = new FTPClient();
        try {
  
            ftpClient.connect(serverAddress, port);
            ftpClient.login(username,password);
 
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE/FTP.ASCII_FILE_TYPE);
            String remoteFilePath = "g/atg_ps4.log";
            File localfile = new File("/log/atg_ps4.log");
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(localfile));
            boolean success = ftpClient.retrieveFile(remoteFilePath, outputStream);
            outputStream.close();
  
            if (success) {
                System.out.println("Ftp file successfully download.");
            }
  
        } catch (IOException ex) {
            System.out.println("Error occurs in downloading files from ftp Server : " + ex.getMessage());
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
 */   }
}