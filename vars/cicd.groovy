def download(repo)
{
  	echo "git 'https://github.com/intelliqittrainings/${repo}"
}
def build()
{
  	echo "sh 'mvn package'"
}
def deploy(jobname,ip,context)
{
	echo "sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}"
}
def runselenium(jobname)
{
	sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar'
}
