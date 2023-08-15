def download(repo)
{
  echo "git 'https://github.com/intelliqittrainings/${repo}"
}
def build()
{
  sh 'mvn package'
}
