pipeline {
  agent any
  stages {
    stage('java build') {
      steps {
        git(url: 'git@github.com:xiangruo/jenkins-demo.git', branch: 'master', changelog: true, poll: true)
      }
    }

  }
}