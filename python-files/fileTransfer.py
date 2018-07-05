import paramiko
from scp import SCPClient

ssh = paramiko.SSHClient()
ssh.load_system_host_keys()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect("10.58.27.208",username="mindcurv", password="pustiMe.2016")
print("Connected")
scp = SCPClient(ssh.get_transport())
scp.get("/APP/oracle/jboss-eap-6.1/standalone/log/atg_ps2.log")
print("File is been downloaded..")
scp.close()
